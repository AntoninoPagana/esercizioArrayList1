import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> lista1 = new ArrayList<>();
        Student student1 = new Student("Mario",21);
        Student student2 = new Student("Pino",19);
        Student student3 = new Student("Tony",25);
        Student student4 = new Student("Francesco",23);
        lista1.add(student1);
        lista1.add(student2);
        lista1.add(student3);
        lista1.add(student4);
        System.out.println("Lista non aggiornata: " + lista1);
        Student student5 = new Student("Filippo",20);
        Student student6 = new Student("Antonino",20);
        Student student7 = new Student("Giusy",25);
        Student student8 = new Student("Livia",22);
        lista1.add(student5);
        lista1.add(student6);
        lista1.add(student7);
        lista1.add(student8);
        System.out.println("Lista aggiornata: " + lista1);
    }
}
