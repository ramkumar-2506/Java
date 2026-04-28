public class demo{
    int age = 21;
    String name = "Ram";
    public static void main(String[] args) {
        demo answer = new demo();
        System.out.println(answer.name);
        System.out.println(answer.age);

        demo answer1 = new demo();
        answer1.name = "pravin";
        answer1.age = 21;
        System.out.println(answer1.name);
        System.out.println(answer1.age);
    }
}