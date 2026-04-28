public class Recursion {
 
    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
            // num=10 => 10+sum(10-1=9)
            // 10+9+sum(9-1=8)
            // 10+9+8+sum(8-1-7)
            // 10+9+8+7+sum(7-1=6)
            // 10+9+8+7+6+sum(5)
            //......
            // 10+9+8+7+6+5+4+3+2+1+0
        } else {
            return 0;
        }
    }
 
    public static void main(Stringexample[] args) {
        int answer = sum(10);
        System.out.println(answer);
    }
 
}