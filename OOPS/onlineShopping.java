import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " Price: " + price);
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    void showWarranty() {
        System.out.println("Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    void show() {
        System.out.println("Size: " + size);
    }
}

public class onlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Electronics details:");
        System.out.print("Name: ");
        String eName = sc.nextLine();
        System.out.print("Price: ");
        double ePrice = sc.nextDouble();
        System.out.print("Warranty (years): ");
        int eWarranty = sc.nextInt();
        sc.nextLine(); 

        Electronics electronicItem = new Electronics(eName, ePrice, eWarranty);
        electronicItem.display();
        electronicItem.showWarranty();

        
        System.out.println("\nEnter Clothing details:");
        System.out.print("Name: ");
        String cName = sc.nextLine();
        System.out.print("Price: ");
        double cPrice = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Size: ");
        String cSize = sc.nextLine();

        Clothing clothingItem = new Clothing(cName, cPrice, cSize);
        clothingItem.display();
        clothingItem.show();

        sc.close();
    }
}
