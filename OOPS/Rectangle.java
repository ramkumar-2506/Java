// constructor overloading.
public class Rectangle{
    Rectangle(){
        System.out.println("Default Constructor");
    }
    Rectangle(int num){
        System.out.println("parameterized constructor:"+num);
    }
    Rectangle(int num1, int num2){
        System.out.println("Parameterized constructor:"+(num1 + num2));
    }
    public static void main(String[] args) {
        Rectangle d1 = new Rectangle();
        Rectangle d2 = new Rectangle(1000);
        Rectangle d3 = new Rectangle(10,40); 
    }
}
