import java.sql.*;
//using normal method
public class demo {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "Karun@123#";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e);
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

//            String query = "select * from students ";//👉display data

//            ResultSet resultset = statement.executeQuery(query);//👉use to display not to insert
//
//            while (resultset.next()) {
//                int id = resultset.getInt("id");
//                String name = resultset.getString("name");
//                int age = resultset.getInt("age");
//                double marks = resultset.getDouble("marks");
//
//                System.out.println("Id : " + id);
//                System.out.println("Name : " + name);
//                System.out.println("Age : " + age);
//                System.out.println("Marks : " + marks);
//                System.out.println("----------------------");
//      }


                //👉 this is for data add
//            String query = String.format(
//                    "INSERT INTO students (name, age, marks) VALUES ('%s', %d, %f)",
//                    "Rahul", 23, 94.6
//            );
// int rowsAffected = statement.executeUpdate(query);
// if (rowsAffected>0){
//     System.out.println("Data inserted successfully");
//
// }else {
//     System.out.println("data doesn't inserted");
// }

//            //👉💀 update data
//
//            String query=String.format("update students set marks = %f where id=%d",89.5,11 );
//            int rowsAffected = statement.executeUpdate(query);
//            if (rowsAffected>0){
//     System.out.println("Data updated successfully");
//
// }else {
//     System.out.println("data doesn't update");
// }
//👉💀 delete data

                String query = "DELETE from students where id =11";
                int rowsAffected = statement.executeUpdate(query);
                if (rowsAffected > 0) {
                    System.out.println("Data deleted successfully");
                } else {
                    System.out.println("data doesn't delete");

                }


        }catch (SQLException e) {
            System.out.println("SQL Error: " + e);
        }
    }
}