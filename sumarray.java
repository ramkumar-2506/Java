public class sumarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for(int num: array){
            sum = num + sum;
            double avg = (double)sum/array.length;
        }
        System.out.println("Sum of array elements:"+sum);
    }
}
