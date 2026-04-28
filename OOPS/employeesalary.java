class employeesalary {
    int id;
    String name;
    double salary;

     employeesalary(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        if(salary<10000){
            this.salary =10000; 
        }
        else{
            this.salary = salary;
        }
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
        employeesalary a1 = new employeesalary(1000, "Ram", 50000);
        employeesalary a2 = new employeesalary(1001, "kumar", 60000);
        a1.display();
        a2.display();
    }
}
