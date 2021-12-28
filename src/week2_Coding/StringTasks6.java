package week2_Coding;


public class StringTasks6 {
    public static void main(String[] args) {

        String word = "apples";
        int isEven = word.length() / 2 - 1;
        int even = isEven + 1;

        if(word.length() % 2 != 0 && word.length() >= 3){
            System.out.println(word.charAt(word.length()/2));
        }else if(word.length() == 1){
            System.out.print(word);
            System.out.print(word);
            System.out.print(word);
        }

        if(word.length() % 2 == 0 && word.length() >= 4){
            System.out.println("" + word.charAt(isEven) + word.charAt(even));
        } if (word.length() == 2){
            System.out.print(word);
            System.out.print(word);
            }
        }
    }
