public class Manager extends Employee{

    Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public double getBonus(){
        return 0.2 * this.getSalary();
    }
}
