package week7_Coding;

public class MorningWorkOut {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 30 ; i++) {
            System.out.println("Push-Up " + i);
//            try{
//                Thread.sleep(2500);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            pause(2.5);
        }

        System.out.println("----------------------------");

        for (int i = 1 ; i < 21 ; i++) {
            System.out.println("Pull-Up " + i);
//            try{
//                Thread.sleep(3500);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            pause(3.5);
        }

    }

    public static void pause(double seconds){
        try{
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

