package devkare.exercieperson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PersonTest {
    
    
    @Test
    void testPersonAttributes() {
        Person person = new Person("Jorge", "Clara", "1234567", 1993, "España", 'M');
    
     assertEquals("Jorge", person.getFirstNameString());
     assertEquals("Clara", person.getLastNameString());
     assertEquals("1234567", person.getIdNumberString());
     assertEquals(1993, person.getBirthYearInteger());
     assertEquals("España", person.getCountryOfBirth());
     assertEquals('M', person.getGender());
}

    @Test
    void testPrintInfo() {
        Person person = new Person("Saba", "Diaz", "7890123", 2002, "Pakistan",'F');

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        person.printInfo();

        String expectedOutput = "Name: Saba Diaz" + "ID Number: 890123" + "Birth Year: 2002" + "Country of Birth: Pakistan" + "Gender: F";

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out);
    }
}
