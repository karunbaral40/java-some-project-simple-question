//this program shows the example of construction overloding with no argument to all argument  pass.
class employees{
    private int id;
    private String name;
    private int salary;
    //no arguments pass
    public employees(){
        id=12;
        name="harry";
        salary=10000;
    }
    //one argument pass
    public employees(int num){
        id=num;
        name="ram";
        salary=20000;
    }
    //two argument pass
    public employees(int num,String n){
        id=num;
        name=n;
        salary=30000;
    }
    //three argument pass
    public employees(int num,String n, int s){
        id=num;
        name=n;
        salary=s;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){

        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int a) {
        id = a;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s) {
        salary= s;
    }

}
public class constructionOverlodingExample {
    public static void main(String[] args) {

        //no argument pass
        System.out.println("no argument pass: ");
        employees emp=new employees();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary()+"\n");

        //one argument pass
        System.out.println("one argument pass: ");
        employees one=new employees(23);
        System.out.println(one.getId());
        System.out.println(one.getName());
        System.out.println(one.getSalary()+"\n");

        //two argument pass
        System.out.println("two argument pass: ");
        employees two=new employees(20 ,"ram badhaur");
        System.out.println(two.getId());
        System.out.println(two.getName());
        System.out.println(two.getSalary()+"\n");

        //three argument pass
        System.out.println("three argument pass:");
        employees three=new employees(20 ,"hari badhaur" ,40000);
        System.out.println(three.getId());
        System.out.println(three.getName());
        System.out.println(three.getSalary()+"\n");
    }
}
