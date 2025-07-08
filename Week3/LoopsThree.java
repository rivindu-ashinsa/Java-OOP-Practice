package Week3;

public class LoopsThree {
    public static void main(String[] args) {
        int iterations = 5;
        for (int i = 1; i<= iterations; i++) {
            for (int j = iterations; j>= i; j--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}