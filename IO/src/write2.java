import java.io.FileWriter;

public class write2 {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("testt.txt");
        fw.write("hello world! is the rule of program");
        fw.close();
    }
}
