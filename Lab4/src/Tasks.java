import osoby.Student;
import osoby.Osoba;
import database.StudentDatabase;

public class Tasks {
    public void Task001() {

        System.out.println("\nZadanie.1");
        Osoba osoba1 = new Osoba("Maria", "Mazurkiewicz", 25);
        Osoba osoba2 = new Osoba("Michał", 30);
        Osoba osoba3 = new Osoba();

        System.out.println("\nOsoba 1:");
        osoba1.pokazDane();

        System.out.println("\nOsoba 2:");
        osoba2.pokazDane();

        System.out.println("\nOsoba 3:");
        osoba3.pokazDane();
    }

    public void Task002() {
        System.out.println("\nZadanie.2");
        Student student1 = new Student("Maria", "Mazurkiewicz", "12345", "Informatyka", 2);
        Student student2 = new Student("Michał", "Nowak", "54321");
        Student student3 = new Student("67890", "Matematyka");
        Student student4 = new Student(3, "Piotr");

        System.out.println("\nStudent 1:");
        student1.wyswietlDane();

        System.out.println("\nStudent 2:");
        student2.wyswietlDane();

        System.out.println("\nStudent 3:");
        student3.wyswietlDane();

        System.out.println("\nStudent 4:");
        student4.wyswietlDane();
    }

    public void Task003() {
        System.out.println("\nZadanie.3");
        Student student = InputData.wprowadzDaneStudenta();
        System.out.println("\nNowe dane studenta::");
        student.wyswietlDane();
    }

    public void Task004() {
        System.out.println("\nZadanie.4");
        StudentDatabase database = new StudentDatabase();

        database.dodajStudenta(0, new Student("Jan", "Kowalski", "12345", "Informatyka", 2));

        System.out.println("\nStudent na pozycji 0:");
        database.wyswietlStudenta(0);

        System.out.println("\nZakres 0-5:");
        database.wyswietlZakresStudentow(0, 5);
    }
}