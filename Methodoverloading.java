public class Methodoverloading {
    static void display(int a){
        System.out.println("Arguments:"+a);
    }
    static void display(int a,int b){
        System.out.println("Arguments:"+ a +"and"+b);
    }
    public static void main(String[] args) {
        display(20);
        display(20, 30);
    }
}
