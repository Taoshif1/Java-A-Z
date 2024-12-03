
package taoshiflex.lab6.Task1;

public class Employee extends Person {
       
    private String office;
    private double salary;
    private String dateHired;
    
public Employee(String name, String address, double phone, String email, String office, double salary, String dateHired) {
    super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Child-Class: Employee, " + super.toString() + ", Office: " + office + ", Salary: " + salary + "TK, Date Hired: " + dateHired;
    }
}
