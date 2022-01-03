package week4_Coding;

public class MathRandom {
    public static void main(String[] args) {

        //                           0.242311   * 200 = 123
        int count = 0;
        for (int i = 0; true ; i++) {
            int rand = (int) (Math.random() * 200) + 1;
            if( rand == 200){
                System.out.println("E Gjetem");
                break;
            }
            count++;
        }

        System.out.println("200 u gjet pas " + count + " iterimeve");

        }
    }
