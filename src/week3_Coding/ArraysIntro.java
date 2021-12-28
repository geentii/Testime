package week3_Coding;

public class ArraysIntro {
    public static void main(String[] args) {

        //DataType [] variableName = {data1, data2, data3 ...};

        String[] group1 = {"Gent", "Besnik", "Blerta", "Ylli"};
        //        Index =     0  ,    1    ,    2    ,    3

        // retrieve data from array
        System.out.println(group1[0]);
        System.out.println(group1[1]);
        System.out.println(group1[2]);
        System.out.println(group1[3]);

        System.out.println("------------------------------");

        for(int i = 0; i <= 3; i++){
            System.out.println(group1[i]);
        }

    }
}
