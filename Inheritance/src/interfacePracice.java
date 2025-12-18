
class Employee{
  void salary(){
      System.out.println("the employee salary is : 50000");
  }
}
class Manager extends Employee{
    @Override
    void salary() {
        super.salary();
        System.out.println("the Manager salary is 55000");
    }
}


public class interfacePracice {
    public static void main(String[] args) {
Manager M=new Manager();
M.salary();
    }
}
