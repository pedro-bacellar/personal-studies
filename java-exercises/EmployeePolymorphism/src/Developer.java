public class Developer extends Employee{

    Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    public double getBonus(){
        return 0.1 * this.getSalary();
    }
}
