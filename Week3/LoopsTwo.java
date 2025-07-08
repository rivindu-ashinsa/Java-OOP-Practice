package Week3;

public class LoopsTwo {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            if (i%2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
 }