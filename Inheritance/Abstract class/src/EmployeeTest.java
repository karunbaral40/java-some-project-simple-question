//- Write a program where Employee is abstract with method calculatePay().
//Implement FullTimeEmployee and ContractEmployee.
//Store them in an array of Employee and print their pay using polymorphism.
abstract class Employee2{
    String name;
    Employee2(String name){
        this.name =name;
    }
    abstract double calculatePay();
}
class FullTime extends Employee2{
    double amount;
    FullTime(String name,double amount){
        super(name);
        this.amount=amount;
    }
    @Override
    double calculatePay() {
return amount;
    }
}
class ContractEmployee extends Employee2{
    double amount;
    float workHour;
    ContractEmployee(String name ,double amount ,float workHour){
        super(name);
        this.amount=amount;
        this.workHour=workHour;

    }

    @Override
    double calculatePay() {
        return amount*workHour;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
Employee2 []employee2={
      new  FullTime("radha",1200000),
        new ContractEmployee("ram",2000.00,12.3f)

};
        for (Employee2 e : employee2) {
            System.out.println(e.name + " earns: $" + e.calculatePay());
        }

    }
}
