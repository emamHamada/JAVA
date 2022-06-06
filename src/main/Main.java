package main;

import subemployee.Department;
import subemployee.HourlyEmployee;
import subemployee.SalariedEmployee;
import subemployee.commission.BassPlusCommissionEmployee;
import subemployee.commission.CommissionEmployee;

import static employee.Gender.male;

// enter point for this project .
public class Main {

    public static void main(String[] args) {
        // write your code here
        Department d = new Department(1, "informationSystem");
        SalariedEmployee s = new SalariedEmployee("hamada", "aghour", male, 2000, 4000, 20, 10);
        HourlyEmployee h = new HourlyEmployee("mohamed", "aghour", male, 3000, 100, 40);
        CommissionEmployee c = new CommissionEmployee("emam", "aghour", male, 4000, 3000, 40);
        BassPlusCommissionEmployee b = new BassPlusCommissionEmployee("elshomoty", "aghour", male, 5000, 3000, 40, 500);
        d.add_Employee(s);
        d.add_Employee(h);
        d.add_Employee(c);
        d.add_Employee(b);
        d.printdDpartmentData();
        System.out.println("########################################");
        d.printBasicData();
        System.out.println("########################################");
        d.printAllDetails();
    }
}
