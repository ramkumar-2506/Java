import java.util.Scanner;

public class multiplecatch {
    public static void main(String[] args) {
        //User Input Exception
        Scanner A = new Scanner(System.in);
        try{
            System.out.println("Enter the Number:");
            int n = A.nextInt();
            System.out.println(A);
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
    }
}
