//create a class cellphone with methode to print ringing vibrating.
class cellPhone{
    static void ringing(){
        System.out.println("ringing......");
    }
    static void vibrating(){
        System.out.println("vibrating......");
    }
}
public class CellPhne {
    public static void main(String[] args) {
        cellPhone tecno=new cellPhone();
        tecno.ringing();
        tecno.vibrating();
    }
}
