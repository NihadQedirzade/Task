public class PartTimeEmployee extends Employee{
    double perSalary;
    double perHours;
    public PartTimeEmployee(String name, int id,double perSalary,double perHours) {
        super(name, id);
        this.perSalary=perSalary;
        this.perHours=perHours;

    }

    @Override
    void calculatePay() {

        System.out.println(perHours*perSalary);
    }
}
