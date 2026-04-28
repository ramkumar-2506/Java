public class nestedexample {
    public static void main(String[] args) {
        int marks = 80;
        if(marks >= 35){
            if(marks >= 70){
                System.out.println("First class");
            } else{
                System.out.println("Second class");
            }
        } else{
            System.out.println("Fail");
        }
    }
}
