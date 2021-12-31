package day4;

public class EncapsulationPractice {

    public static void main(String[] args) {
        Student student1 = new Student(); // student object
        student1.setName("Ram");
        student1.setSocialSecurityNumber("123456");



        Student student2 = new Student();
        student2.setName("Jacki");
        student2.setSocialSecurityNumber("1234567");

        Student student3 = new Student();
        student3.setName("Erica");
        student3.setSocialSecurityNumber("12345678");


        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());

    }
}
