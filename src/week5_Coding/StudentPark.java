package week5_Coding;

public class StudentPark {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "king";
        student1.gender = "male";
        student1.id = 31231233;
        student1.age = 55;

        System.out.println(student1.name);
        System.out.println(student1.id);
        System.out.println(student1.gender);
        System.out.println(student1.age);

        Student student2 = new Student();
        student2.setInfo("king2","male",44,123445);
    }
}

