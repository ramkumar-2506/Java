public class Attendance {
    public static void main(String[] args) {
        int[] attendance = {1,1,0,1,1,0,0,1,0};
        int presentCount = 0;
        for(int i=0;i<attendance.length;i++){
            if(attendance[i] == 1){
                presentCount++;
            }
        }
        System.out.println("Total Present Student:"+presentCount);
    }
}
