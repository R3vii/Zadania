package database;
import osoby.Student;

public class StudentDatabase {
    private Student[] students;
    private static final int SIZE = 100;

    public StudentDatabase() {
        students = new Student[SIZE];
        for (int i = 0; i < SIZE; i++) {
            students[i] = new Student("", "", "", "", 0);
        }
    }

    public void dodajStudenta(int index, Student student) {
        if (index >= 0 && index < SIZE) {
            students[index] = student;
        }
    }

    public void edytujStudenta(int index, Student student) {
        if (index >= 0 && index < SIZE) {
            students[index] = student;
        }
    }

    public void usunStudenta(int index) {
        if (index >= 0 && index < SIZE) {
            students[index] = new Student("", "", "", "", 0);
        }
    }

    public void wyswietlStudenta(int index) {
        if (index >= 0 && index < SIZE) {
            students[index].wyswietlDane();
        }
    }

    public void wyswietlWszystkichStudentow() {
        for (Student student : students) {
            student.wyswietlDane();
            System.out.println();
        }
    }

    public void wyswietlZakresStudentow(int start, int end) {
        if (start >= 0 && end < SIZE && start <= end) {
            for (int i = start; i <= end; i++) {
                students[i].wyswietlDane();
                System.out.println();
            }
        }
    }
}
