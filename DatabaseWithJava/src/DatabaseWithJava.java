import java.sql.*;
public class DatabaseWithJava {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/collage";
        String user="root";
        String password="Karun@123#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student");

            while(resultSet.next()){
                System.out.println(" | "+resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getInt(3)+" | "+resultSet.getLong(4)+" | "+resultSet.getString(5)+"|") ;
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
