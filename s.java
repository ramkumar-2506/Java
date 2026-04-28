public class sumarray1{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int sum = 0;
        for(int num:arr){
            sum = num+sum;
            double avg = (double)sum/arr.length;
            System.out.println("Sum="+sum);
            System.out.println("Avg="+avg);
        }
    }
}
