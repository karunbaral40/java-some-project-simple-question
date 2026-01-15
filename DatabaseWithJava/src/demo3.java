import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

//Batch processing using normal processing
public class demo3 {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String user="root";
    private static final String password="Karun@123#";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");

    }catch (ClassNotFoundException e) {
             System.out.println(e);
         }
         try{
             Connection connection= DriverManager.getConnection(url,user,password);
             Statement statement=connection.createStatement();
              while(true) {
                  System.out.println("enter the name");
                  String name=sc.nextLine();
                  System.out.println("\nenter the age :");
                  int age=sc.nextInt();
                  System.out.println("\nenter the marks");
                  double marks=sc.nextDouble();
                  System.out.println("enter more data (Y/N): ");
                  String choice = sc.next();
                  String Query = String.format("insert into student(name , age ,marks)values('%s',%d,%f)" +
                          " ",name,age,marks);

                  statement.addBatch(Query);


                  if (choice.toUpperCase().equals("N")) {
                      break;
                  }

              }
              int [] rowsAffected=statement.executeBatch();
             for (int i = 0; i < rowsAffected.length; i++) {
                 if (rowsAffected[i]==0){
                     System.out.println("quarry" +i+" not execute successfully");
                 }

             }
         }catch (SQLException e){
             System.out.println(e);
         }
         }
}
