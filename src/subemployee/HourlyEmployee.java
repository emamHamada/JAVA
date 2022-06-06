package subemployee;

import employee.Displayable;
import employee.Employee;
import employee.Gender;

public class HourlyEmployee extends Employee implements Displayable {
    private double hourRate;
    private int noOfHours;


    public HourlyEmployee(String name, String address, Gender sex, int ssn, double hourRate, int noOfHours) {
        super(name, address, sex, ssn);
        this.hourRate = hourRate;
        this.noOfHours = noOfHours;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Override
    public Double earning() {
        return noOfHours * hourRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourRate=" + hourRate +
                ", noOfHours=" + noOfHours +
                '}';
    }

    @Override
    public void Displayalldetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void Displayearnings() {
        System.out.println(this.earning());
    }

}
