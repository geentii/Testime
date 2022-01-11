package week5_Coding;

public class Student {
    public String name;
    public String gender;
    public int age;
    public int id;

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void sleep(){
        System.out.println(name + " is sleeping ");
    }
    public void drink  (String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void coding (){
        System.out.println(    name + "is coding ");
    }
    public void setInfo (String studentName, String studentgender, int studentage, int studentId){

        name = studentName;
        gender = studentgender;
        age = studentage;
        id = studentId;
    }
}
