//Access Methods With an Object
public class main{

    public void fullThrottle(){
        System.out.println("The car is going fast");
    }

    public void speed(int maxspeed){
        System.out.println("Max speed is:"+ maxspeed);
    }

    public static void main(String[] args) {
        main myCar = new main();
        myCar.fullThrottle();
        myCar.speed(100);
    }
}