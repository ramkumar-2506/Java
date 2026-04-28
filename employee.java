class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double overtimePay;

    Developer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class employee {
    public static void main(String[] args) {
        Manager m = new Manager("Ram", 50000, 10000);
        Developer d = new Developer("Arun", 40000, 5000);

        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Developer Salary: " + d.calculateSalary());
    }
}
