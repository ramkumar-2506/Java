public class TrycatchExample1{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Result:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        finally{
            System.out.println("This block will always execute");
        }
    }
}
