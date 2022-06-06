package subemployee.commission;

import employee.Gender;

public class BassPlusCommissionEmployee extends CommissionEmployee {
    private double base;

    public BassPlusCommissionEmployee(String name, String address, Gender sex, int ssn, double grossSales, double commissionRate,double base) {
        super(name, address, sex, ssn, grossSales, commissionRate);
        this.base=base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public Double earning() {

        return base + super.earning();
    }

    @Override
    public void Displayalldetails() {

        super.Displayalldetails();
        Displayearnings();
    }

    @Override
    public void Displayearnings() {
        System.out.println(earning());
    }

}
