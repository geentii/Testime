package week3_Coding;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("        Multiplication Table");

        System.out.print("   ");
        for(int j = 1; j <= 9; j++)
            System.out.print("  " +j);

        System.out.println("\n-------------------------------------------");

        // Display Table Body
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "|");
            for(int j = 1; j <= 9; j++){
                System.out.print(" " + i * j);
            }
            System.out.println();
        }
    }
}
