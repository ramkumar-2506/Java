public class MethodExamples {
    static int display(int a, int b) {
        return a + b;
    }
    static Float add(Float a, Float b) {
        return a + b;
    }  
    static Double multiply(Double x, Double y) {
        return x * y;
    }
    static Stringexample greet(Stringexample name) {
        return name;
    }    
        public static void main(Stringexample[] args) {
        int answer = display(100, 150);
        System.out.println(answer);
        Float sum = add(25.5f, 25.5f);
        Double product = multiply(1.2, 8.9);
        System.out.println("Sum (Float): " + sum);
        System.out.println("Product (Double): " + product);
    }
}