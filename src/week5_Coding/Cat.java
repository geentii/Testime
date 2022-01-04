package week5_Coding;

public class Cat {
    public String name;
    public String color;
    public String gender;
    public int age;
    public String breed;

    public void scratch(String scrathing){
        System.out.println(name + " is schratching " + scrathing);
    }

    public void breakThings(String breakThings){
        System.out.println(name + " is breaking  " + breakThings);
    }

    public void jump(){
        System.out.println(name + " is jumping");
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void setInfo(String catName, String catColor, String catGender, int catAge, String catBreed ){
        name = catName;
        color = catColor;
        gender = catGender;
        age = catAge;
        breed = catBreed;
    }

}
