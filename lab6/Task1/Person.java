
package taoshiflex.lab6.Task1;

class Person {
    
    private String name;
    private String address;
    private double phone;
    private String email;
    
public Person(String name, String address, double phone, String email) {

    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;
    }
    
    @Override
      public String toString() {
        return "Parent-Class: Person, Name: " + name + ", " + address + ", " + phone + ", " + email;
    }   
}

