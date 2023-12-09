import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hello world");

        Employee employee1 = new Employee("Alikhan", "Arman", 1234,870234,
                new Date(2023,5,15), 150000);

        Employee employee2 = new Employee("Alizhan", "Asel", 12564,87023456,
                new Date(2023,5,15), 160000);

        System.out.println(employee1.compareTo(employee2));

        Employee employee3 = employee1.clone();
        employee3.setFirstname("Dastan");
        employee3.setHireDate(new Date(2020,12,1));

        System.out.println(employee3.getFirstname() + "'s hireDate: " + employee3.getHireDate().getDate());
        System.out.println(employee1.getFirstname() + "'s hireDate: " + employee1.getHireDate().getDay());



    }

}