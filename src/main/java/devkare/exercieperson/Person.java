package devkare.exercieperson;

public class Person {

    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String countryOfBirth;
    private char gender;
    
    public Person(String firstName, String lastName, String idNumber, int birthYear, String countryOfBirth, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }
    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Country of Birth; " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }

    public String getFirstNameString(){
        return firstName;
    
    }
    
    public String getLastNameString(){
    return lastName;

    }


    public String getIdNumebeString(){
        return idNumber;

    }

    public int getBirthYearInteger(){
        return birthYear;

    }
    
    
    public String getCountryOfBirth(){
        return countryOfBirth;
    }

    public char getGender(){
    return gender;

    }

}

