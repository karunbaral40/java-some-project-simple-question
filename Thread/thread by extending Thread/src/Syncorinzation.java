class Table {
    void printTable(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
    }
}

public class Syncorinzation {
    public static void main(String[] args) {
        Table obj=new Table();
        MyThread1 t1= new MyThread1(obj);
        t1.start();
        MyThread1 t2=new MyThread1(obj);

        t2.start();
    }
}
