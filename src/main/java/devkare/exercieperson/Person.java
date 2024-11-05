package devkare.exercieperson;

public class Person {

    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    
    public Person(String firstName, String lastName, String idNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }
    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
    }
}

