//this is  a same program ExampleOfPrivate but by using constructor.
class mymainEmployee{
    private String name;
    private int id;
    public mymainEmployee(){
        name="Your name";
                id=12;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getid(){
        return id;
    }
    public void setid(int a){
        id=a;
    }


}
public class consrtructorExample {
    public static void main(String[] args) {
mymainEmployee emp=new mymainEmployee();
        System.out.println(emp.getName());
        System.out.println(emp.getid());
    }
}
