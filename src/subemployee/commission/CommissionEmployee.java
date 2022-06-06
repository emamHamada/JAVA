package subemployee.commission;

import employee.Displayable;
import employee.Employee;
import employee.Gender;

public class CommissionEmployee extends Employee implements Displayable {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String address, Gender sex, int ssn, double grossSales, double commissionRate) {
        super(name, address, sex, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void Displayalldetails() {
        System.out.println(super.toString());
//        System.out.print("BassPlus");
        System.out.print(toString());
    }

    @Override
    public void Displayearnings() {
        System.out.println(earning());
    }

    @Override
    public Double earning() {
        return grossSales * commissionRate;
    }
}
