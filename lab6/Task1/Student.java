
package taoshiflex.lab6.Task1;

class Student extends Person {
    
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    private String status;

    public Student(String name, String address, double phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Child-Class: Student, " + super.toString() + ", Status: " + status;
    }   
}
