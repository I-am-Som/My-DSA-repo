import java.util.*;

class Student {

    int rollno;
    String name;
    float percentage;

    public Student(int rollno, String name, float percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
    
    @Override
    public String toString() {
        return rollno + " " + name + " " + percentage;
    }

}

public class ComplexsimpleObj {

    public static void main(String[] args) {

        Student s1 = new Student(12, "Sital", 94.7f);
        Student s2 = new Student(69, "Payal", 64.7f);
        Student s3 = new Student(96, "Kola", 84.7f);

        ArrayList al = new ArrayList();

        al.add(s1);
        al.add(s2);
        al.add(s3);


        System.out.println(al);
    }
}
