public class OtherDatatypeIntoStrng {
    public static void main(String[] args) {
        int s = 10;
        float t = 1.66f;
        String s1 = String.valueOf(s);
        String s2 = String.valueOf(t);
        String sc = s1 + s2;
        System.out.println(sc);
    }
}
