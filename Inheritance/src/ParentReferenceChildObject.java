

//Question  (Parent Reference → Child Object)
//Create:
//Parent class Shape → method draw()
//Child class Circle → override draw()
class Shape{
    public void draw(){
        System.out.println("drawing a shape....");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("drawing a circle....");
        System.out.println("looks like it take about 365 days....");
    }


}
public class ParentReferenceChildObject {
    public static void main(String[] args) {
Shape sp=new Circle();
sp.draw();
    }
}
