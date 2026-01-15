import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//batch statement with  prepaid statement
public class demo4 {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String user="root";
    private static final String password="Karun@123#";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        try {
            Connection connection= DriverManager.getConnection(url,user,password);
             String Query="insert into students(name,age,marks)values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(Query);
           while(true){
               System.out.println("enter the name");
               String name=sc.nextLine();
               System.out.println("enter the age");
               int age =sc.nextInt();
               System.out.println("enter the nmarks" );
               double marks=sc.nextDouble();
               System.out.println("want to continue(Y/N)");
               String choice=sc.next();
               preparedStatement.setString(1,name);
               preparedStatement.setInt(2,age);
               preparedStatement.setDouble(3,marks);
               preparedStatement.addBatch();
               if (choice.toUpperCase().equals('N')){
                   break;
               }
           }
           int[]rowsAffected=preparedStatement.executeBatch();
            for (int i = 0; i < rowsAffected.length; i++) {
                if (rowsAffected[i]==0){
                    System.out.println("query "+i+" doesn't execute ");
                }
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
