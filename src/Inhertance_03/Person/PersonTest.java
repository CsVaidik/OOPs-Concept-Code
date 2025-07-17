package Inhertance_03.Person;

public class PersonTest {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Vaidik";
        s.introduce();
        s.study();

        System.out.println();

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.introduce();
        t.teach();
    }
}
