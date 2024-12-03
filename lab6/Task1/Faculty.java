
package taoshiflex.lab6.Task1;

class Faculty extends Employee {
    
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, double phone, String email, String office, double salary, String dateHired, int officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Grand-Child-Class: Faculty, " + super.toString() + ", Office Hours: " + officeHours + " Hours, Rank: " + rank;
    }
}
