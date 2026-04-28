public class sumarray1{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int sum = 0;
        for(int num:arr){
            sum = sum+num;
            double avg = (double)sum/arr.length;
            System.out.println(sum);
            System.out.println(avg);
        }
    }
}
