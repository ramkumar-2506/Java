import java.util.Scanner;
public class userinput{
    public static void main(String[] args){
        //Area of Rectangle
        System.out.print("Enter Length:");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        System.out.print("Enter width:");
        float width = sc.nextFloat();
        System.out.print("Area of Retangle:"+(length*width));
    }
}