package week3_Coding;

public class BranchingStatements {
    public static void main(String[] args) {

        for(int i = 0; i<=5; i++) {
            if (i == 3) {
                break; //exit the loop
            }
            System.out.println(i);
        }

        System.out.println("---------------------");

        for(int i = 0; i<=5; i++){
            if(i==3){
                continue; // skip
            }
            System.out.println(i);
        }

    }
}
