

//- Password length is less than 8
import java.util.Scanner;


class PasswordLengthException extends Exception {
    public String toString() {
        return "Password must have at least 8 characters";
    }
}

// Class that validates password
class EnterPassword {
    void validate(String pass) throws PasswordLengthException {
        if (pass.length() < 8) {
            throw new PasswordLengthException();
        }
        System.out.println("Password accepted: " + pass);
    }
}

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        EnterPassword ep = new EnterPassword();

        try {
            ep.validate(pass);
        } catch (PasswordLengthException e) {
            System.out.println(e);
        }
    }
}