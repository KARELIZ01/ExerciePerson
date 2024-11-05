package devkare.exercieperson;
public class App {
     public static void main(String[] args) {
        Person person1 = new Person("Jorge", "Clara", "1234567", 1993, "España", 'M');
        Person person2 = new Person("Saba", "Diaz", "8901234", "2002", "Pakistan", 'F');
        
        System.out.println("Person1");
        person1.printInfo();

        System.out.println("person2");
}
}