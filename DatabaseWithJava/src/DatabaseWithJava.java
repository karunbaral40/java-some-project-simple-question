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
            ResultSet resultSet=statement.executeQuery("SELECT s.RollNo,s.name AS student_name, s.age,s.contact, s.email,    t.name,c.course_name, c.course_fee FROM student s INNER JOIN course c  ON s.course_id = c.course_id INNER JOIN teacher t ON c.teacher_id = t.teacher_id;\n ");

            while(resultSet.next()){
                System.out.println(" | "+resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getInt(3)+" | "+resultSet.getLong(4)+" | "+resultSet.getString(5)+"|"+resultSet.getString(6)+"|"+resultSet.getString(7)+"|"+resultSet.getInt(8)+"|") ;
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
