import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int N = A.nextInt();
        boolean Z = true;
        for(int i = 2;i<=N/2;i++){
            if(N % i == 0){
                Z = false;
                break;
            }
        }
        System.out.println(Z?"Prime":"Not Prime");
    }
}
