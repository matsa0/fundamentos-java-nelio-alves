public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public double increaseSalary(int percentage) {
        double increase = percentage / 100.0;
        return this.salary = this.salary + (this.salary * increase);
    }
    
    @Override
    public String toString() {
        return getId() + ", " + getName() + ", " + String.format("%.2f", salary);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


}
