package week4_Coding;

public class MethodWithStringTask {
    public static void main(String[] args) {

        String str1 = "wooden spoon";
        String str2 = "wood";

        System.out.println(modifyString(str1,str2));

        int mbledhja = sum(1,2) + sum(3,5);
        System.out.println(mbledhja);

    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static String modifyString(String str1, String str2){
        return str1.replace(str2,"[" + str2 + "]");
    }

}
