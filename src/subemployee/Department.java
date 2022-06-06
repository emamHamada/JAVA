package subemployee;

import employee.Employee;
import subemployee.HourlyEmployee;
import subemployee.SalariedEmployee;
import subemployee.commission.CommissionEmployee;

import java.util.ArrayList;

public class Department {
    int dNumber;
    String dName;
    ArrayList<Employee> empList;

    public int getdNumber() {
        return dNumber;
    }

    public void setdNumber(int dNumber) {
        this.dNumber = dNumber;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    Department() {
    }

    public Department(int dNumber, String dName) {
        this.dNumber = dNumber;
        this.dName = dName;
        empList = new ArrayList<Employee>();
    }

    public void add_Employee(Employee e) {
        empList.add(e);

    }

    public void removeEmployee(int x) {
        empList.remove(x);

    }

    public void getCount() {
        empList.size();

    }

    public void printdDpartmentData() {

        System.out.println(this.dName + "  " + this.dNumber);

    }

    public void printBasicData() {
        for (int i = 0; i < empList.size(); i++) {
            System.out.println(empList.get(i).getSsn() + " " + empList.get(i).getAddress() + " " + empList.get(i).getName() + " " + empList.get(i).getSex());
        }
    }

    public void printAllDetails() {
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i) instanceof SalariedEmployee) {
                ((SalariedEmployee) empList.get(i)).Displayalldetails();
            }
            if (empList.get(i) instanceof HourlyEmployee) {
                ((HourlyEmployee) empList.get(i)).Displayalldetails();
            }
            if (empList.get(i) instanceof CommissionEmployee) {
                ((CommissionEmployee) empList.get(i)).Displayalldetails();
            }
        }
    }
}
