//Create a class Employee with following properties and method's:
//Salary (Property) (int)
//getSalary(method returning int)
//name(proper)(string)
//getName(method returning string)
//set name (method Changing name)
import java.util.Scanner;
class Employee{

    String name;
    int salary;
   public String getName(String name){
//       System.out.println("name of the employee is : "+ name);
        return name;
    }
    public int getSalary(int amt){
//        System.out.println("Salary of the employee is : "+ amt);
        return salary;
    }
    public void setName(String Sname){
       name = Sname;
    }
}
public class MethodCostumeClass2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee n=new Employee();
        System.out.println("enter the name ");
        n.setName(sc.nextLine());

        System.out.println("enter the salary");
        n.salary =sc.nextInt();
        sc.nextLine();



        System.out.println("name of the employee is : " +n.getName(n.name));
        System.out.println("Salary of the employee is : " +n.getSalary(n.salary));



    }
}
