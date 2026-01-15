import java.sql.*;

public class demo2 {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "Karun@123#";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            // 👉👉 Data insertion
            /*
            String insertQuery = "INSERT INTO students(name, age, marks) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
            insertStmt.setString(1, "anyone");
            insertStmt.setInt(2, 25);
            insertStmt.setDouble(3, 87.5);

            int rowsAffected = insertStmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("🎉 Data inserted successfully!!");
            } else {
                System.out.println("❌ Data not inserted");
            }
            */

            // 👉👉 Data display
//            String Query = "SELECT * FROM students ";
//            PreparedStatement selectStmt = connection.prepareStatement(Query);
//
//
//
//            ResultSet resultSet = selectStmt.executeQuery();
//
//       while(resultSet.next()) {
//           System.out.println("\n--------------------------\n");
//                System.out.printf("\nid : "+resultSet.getInt("id")+"\nname : "+resultSet.getString("name")+"\nage : "
//                        +resultSet.getInt("age")+"\nmarks : "+resultSet.getDouble("marks"));
//            }
     //👉❌update method
//
            //👉❌Delete student
//            String Query="delete from students where id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(Query);
//            preparedStatement.setInt(1,13);
//            int rowsAffected=preparedStatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("delete successfully");
//            }else {
//                System.out.println("doesn't deleted");
//            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}