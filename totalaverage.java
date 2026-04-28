public class totalaverage {
    public static void main(String[] args) {
        int[]  marks = {77,89,67,78,98};
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        double average = (double)total/marks.length;
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);
    }
}
