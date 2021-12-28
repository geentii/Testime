package week2_Coding;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int blanket = 60;
        int charger = 15;
        int hat = 25;
        int headPhones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartPhone = 1000;
        int socks = 5;
        int usbCable = 10;
        int balance = 100;

        System.out.print("What do you want to buy: ");
        String item = scan.nextLine();


          if(item.equals("blanket")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - blanket));
        }else if(item.equals("charger")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - charger));
        }else if(item.equals("hat")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - hat));
        }else if(item.equals("headPhones")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - headPhones));
        }else if(item.equals("laptop")){
            if(balance < laptop){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else{
                System.out.println("Thank you for your purchase! \n" +
                        " Your balance is:" + (balance - laptop));
            }
        }else if(item.equals("pants")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - pants));
        }else if(item.equals("pillow")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - pillow));
        }else if(item.equals("smartPhone")){
            if(balance < smartPhone){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else{
                System.out.println("Thank you for your purchase! \n" +
                        " Your balance is:" + (balance - smartPhone));
            }
        }else if(item.equals("socks")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - socks));
        }else if(item.equals("usbCable")){
            System.out.println("Thank you for your purchase! \n" +
                    " Your balance is:" + (balance - usbCable));
        }else{
            System.out.println("Invalid Item");
        }

    }
}
