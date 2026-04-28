public class armstrong {
    public static void main(String[] args) {
        int n = 153,temp = n,sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum+(r*r*r);
            n = n/10;
        }
        System.out.println(temp == sum?"Armstrong":"Not Armstrong");
    }
}
