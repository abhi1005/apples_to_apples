package assignment6.comparable;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;

    public Person(){
        firstName = "first";
        lastName = "second";
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person obj) {
        int lastNameCompare = lastName.compareTo(obj.getLastName());
        if (lastNameCompare != 0) {
            return lastNameCompare;
        } else {
            return firstName.compareTo(obj.getFirstName());
        }
    }
}
