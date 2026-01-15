public class Main {
    public static void main(String[] args){

        Employee[] employees = {new Employee("Sarah", 100), new Manager("Walter", 300), new Developer("Pedro", 200)};

        for(Employee employee : employees){
            System.out.println(employee.toString());
            System.out.println("Bonus: " + employee.getBonus());
            System.out.println();
        }
    }
}
