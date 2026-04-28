public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int temp = n;
        while(temp>0){
            int r = temp%10;
            sum += r*r*r;
            temp /= 10;
        }
        System.out.println(sum==n?"Armstrong":"Not Armstrong");
    }
}
