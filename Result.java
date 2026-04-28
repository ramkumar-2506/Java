public class Result {
    public static void main(String[] args) {
        int[] marks = {66,35,44,78,89,98};
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=60){
                System.out.println(marks[i]+"PASS");
            }
            else{
                System.out.println(marks[i]+"FAIL");
            }
        }
    }
}
