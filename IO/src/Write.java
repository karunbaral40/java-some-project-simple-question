import java.io.FileWriter;

public class Write {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("test.txt");
        fw.write("hello world");
        fw.close();
    }
}
