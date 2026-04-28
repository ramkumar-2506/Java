public class Product {
    String productname;
    double price;

    Product(){
        productname = "iphone17";
        price = 85000;
    }

    void display(){
        System.out.println(productname+"-"+"Rs."+price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.display();
    }
}
