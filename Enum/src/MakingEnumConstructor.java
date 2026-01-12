enum Laptop{
    acer("aspiring",1400),hp(1000),macBook(2999),asus(1200),lenovo(3000),newBrand;
    private int price;
    private String modelName;


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    Laptop(){//This is a default constructor which is used if you can't pass the  price like   new brand
        int price=500;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    Laptop(int price) {
        this.price=price;
    }
    Laptop(String modelName ,int price) {
        this.price=price;
        this.modelName=modelName;
    }

}
public class MakingEnumConstructor {
    public static void main(String[] args) {
        Laptop[] lap=Laptop.values();
        for (Laptop l:lap){
            System.out.println(l  + ":"+ " : "+ l.getPrice());
        }
    }
}
