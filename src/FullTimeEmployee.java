public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }


    @Override
    void calculatePay() {
        System.out.println(salary);
    }



}
