import java.util.Date;

public class Employee extends Person  implements Comparable, Cloneable{

    private Date hireDate;
    private int id;
    private int phoneNumber;

    private double salary;

    public Employee(){}

    public Employee(String lastname, String firstname,int id, int phoneNumber, Date hireDate, double salary){
        super(lastname,firstname);
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.salary = salary;

    }



    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        if (salary < other.salary) return -1;
        if (salary > other.salary) return 1;
        return 0;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{

        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) hireDate.clone();
        return cloned;
    }
}
