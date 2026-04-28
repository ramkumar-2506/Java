public class countevenodd {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,1,3,5};
        int even = 0; int odd = 0;
        for(int num:arr){
            if(num % 2 == 0)even++;
            else odd++;
        }
        System.out.println("Even="+even);
        System.out.println("ODD="+odd);
    }
}
