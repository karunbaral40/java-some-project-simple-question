enum Laptop{
    acer(1400),hp(1000),macBook(2999),asus(1200),lenovo(3000);
    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Laptop(int price) {
        this.price=price;
    }
}
public class MakingEnumConstructor {
    public static void main(String[] args) {
        Laptop[] lap=Laptop.values();
        for (Laptop l:lap){
            System.out.println(l + " : "+ l.getPrice());
        }
    }
}
