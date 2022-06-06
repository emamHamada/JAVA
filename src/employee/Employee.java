package employee;


;

public abstract class Employee {
    // creating fields { variables and methods}
    String name;
    String address;
    Gender sex;
    int ssn;

    // creating getters and setters to use dataFields here perfectly
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Gender getSex() {
        return sex;
    }

    public int getSsn() {
        return ssn;
    }

    // default constructor to be executed directly when calling any subclasses
    public Employee() {
    }

    // parameterized constructor to initialize the values of all dataFields here ..
    public Employee(String name, String address, Gender sex, int ssn) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.ssn = ssn;
    }

    public abstract Double earning();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", ssn=" + ssn +
                '}';
    }
}
