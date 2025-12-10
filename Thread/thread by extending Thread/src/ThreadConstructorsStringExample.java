class string extends Thread{
   string(String name){
           super(name);

   }
    public void run() {

            System.out.println("hello!! " );

   }
}
public class ThreadConstructorsStringExample {
    public static void main(String[] args) {
string st=new string("karun");
st.start();
        System.out.println("hello!! my name is " +st.getName());
        string st2=new string("Baral");
        st2.start();
        System.out.println("and last name is " +st.getName());

    }
}
