import java.util.Scanner;

public class largestthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            System.out.println("The Greatest Among Three is:"+a);
        }
        if(b>c){
            System.out.println("The Greatest Among Three is:"+b);
        }
        else{
            System.out.println("The Greatest Among Three is:"+c);
        }
    }
}

