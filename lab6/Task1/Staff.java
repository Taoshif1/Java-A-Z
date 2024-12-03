
package taoshiflex.lab6.Task1;

public class Staff extends Employee {
 
    private String title;

    public Staff(String name, String address, double phone, String email, String office, double salary, String dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Grand-Child-Class: Staff, " + super.toString() + ", Title: " + title;
    }
}
