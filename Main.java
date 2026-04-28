class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;

        // Salary validation
        if (salary < 10000) {
            this.salary = 10000;
        } else {
            this.salary = salary;
        }
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
