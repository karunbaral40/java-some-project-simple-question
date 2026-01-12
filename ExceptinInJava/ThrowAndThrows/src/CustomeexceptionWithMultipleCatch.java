class OwnException extends Exception
{
    public OwnException(String String)
    {
        super(String);
    }
}
public class CustomeexceptionWithMultipleCatch {
    public static void main(String[] args) {
        int i=10;
        int j;
        try{
            j=i/111;
            System.out.println(j);
            if (j==0){
                throw new OwnException("this is my own exception");
            }
        }catch (OwnException e)
        {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
