package Week4;
import java.util.*;

public class RandomSim {
    public static void main(String[] args) {
        Random rand = new Random();
        float xCount = 0;
        float yCount = 0;
        float xyCount = 0;
        for (int i = 0; i < 1000; i++){
            int numberX = rand.nextInt(1,7);
            int numberY = rand.nextInt(1,7);
            if (numberX == 4){
                xCount++;
            }
            if (numberY == 4){
                yCount++;
            }
            if (numberX == 4 && numberY == 4){
                xyCount++;
            }
        }
        System.out.println("Probability of X being 4 : " + (xCount/1000));
        System.out.println("Probability of Y being 4 : " + (yCount/1000));
        System.out.println("Prbability of both X and Y being 4 : " + (xyCount/1000));
    }
}
