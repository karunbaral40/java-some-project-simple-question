//transaction handling

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 import java.sql.ResultSet;
import java.util.Scanner;


public class demo5 {
    private static final String url = "jdbc:mysql://localhost:3306/my_bank";
    private static final String user = "root";
    private static final String password = "Karun@123#";

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            String debit_quarry = "update  accounts set balance =balance-? where accountNum =?";
            String credit_quarry = "update accounts set balance =balance+? where accountNum=? ";
            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_quarry);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_quarry);
            System.out.println("enter the account number");
            int accountNum=sc.nextInt();
            System.out.println("enter the amount");
            double amount=sc.nextDouble();

            debitPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, accountNum);
            debitPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, accountNum);
            if(insufficient(connection,accountNum,amount)) {
                int rowsAffectedDebit = debitPreparedStatement.executeUpdate();
                int rowsAffectedCredit = creditPreparedStatement.executeUpdate();
                connection.commit();
            }else{
                connection.rollback();
                System.out.println("insufficient balance");

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

  static  boolean insufficient(Connection connection, int accountNum, double amount) {
        try {
            String Quarry = "select balance from accounts where accountNum=?";
            PreparedStatement preparedStatement = connection.prepareStatement(Quarry);
            preparedStatement.setInt(1, accountNum);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                return amount<=current_balance;

            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }


}
