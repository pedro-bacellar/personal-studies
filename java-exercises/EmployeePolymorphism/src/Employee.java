public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getBonus(){
        return 0;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " | Salary: " + this.salary;
    }
}