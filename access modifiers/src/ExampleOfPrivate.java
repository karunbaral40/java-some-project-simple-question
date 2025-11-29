//this is a program which is demonstrated how to use private access modifiers.
class MyEmployee{
    private String name;
    private int id;
    public String getName(){
        return name;
    }
    public void setName(String n){

        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int a){
        id=a;
    }
}
public class ExampleOfPrivate {
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        emp.setName("your name");
       emp.setId(12);
        System.out.println(emp.getName());
        System.out.println(emp.getId());


    }
}
