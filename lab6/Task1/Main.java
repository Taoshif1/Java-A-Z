
package taoshiflex.lab6.Task1;


public class Lab6 {

    public static void main(String[] args) {
        Person person = new Person("Forash Uddin Sir", "Dhaka", 734567899, "fusir@outlook.com");
        Student student = new Student("Gazi Taoshif", "151 Bailey Road", 1738949857 , "taoshif2@gmail.com", Student.SOPHOMORE);
        Employee employee = new Employee("Rasel Mahmud", "789 Rampura", 1234567890 , "rasel@yahoo.com", "Room- 101(FUB)", 30000, "15-04-2022");
        Faculty faculty = new Faculty("Sadika Sneha Maam", "101 Narayongonj", 444555666, "sdis@gmail.com", "Room- 215", 50000, "31-12-2019", 8 , "Lecturer");
        Staff staff = new Staff("Alomgir Hossain", "202/A Saydabad", 333444555, "alomgir@gmail.com", "Room- 303(AB3)", 20000, "01-01-2021", "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
