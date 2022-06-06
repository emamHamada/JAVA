package subemployee;

import employee.Displayable;
import employee.Employee;
import employee.Gender;

public class SalariedEmployee extends Employee implements Displayable {
    double salary, bonus, deduction;


    public SalariedEmployee(String name, String address, Gender sex, int ssn, double salary, double bonus, double deduction) {
        super(name, address, sex, ssn);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
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

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deduction=" + deduction +
                '}';
    }

    @Override
    public Double earning() {
        return (salary + bonus) - deduction;
    }
}
