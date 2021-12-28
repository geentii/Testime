package week4_Coding;

public class LengthTask {
    public static void main(String[] args) {

    }
    public static int countWordInString(String str, String word){
        //get the original length
        int ogLength = str.length();
        //get the new length after removing all the words in the given string
        int newLength = str.replace(word,"").length();

        //originalLength = 28;
        //newLength = 25;

        //         28    -    16 = 12/4
        //we will know how many times "Java" is existing in the given string
        //by replacing all "Java" occurances with empty
        //original String = "Java is an awesome language. Also Java is way better than C# and PHP combined. Java"
        //original String after replacement = " is an awesome language. Also  is way better than C# and PHP combined. "
        //we will count the difference of the two string lengths and divide by 4 ("Java" length is 4)

        return (ogLength - newLength)/word.length();
    }
}
