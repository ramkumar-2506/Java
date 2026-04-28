import java.util.Scanner;
public class FactorialRecursive {
    static long factorial(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Its a Negative Number!");
        }
        else{
            System.out.println("Factorial = "+factorial(num));
        }
        sc.close();
    }
}
