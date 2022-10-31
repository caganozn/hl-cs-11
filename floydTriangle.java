
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int row = 10;
        int sayici = 1;

        for(int i = 1; i <= row; i++) {
            
            for(int j = 0; j < i; j++) {
                System.out.print(sayici + " ");
                sayici++;
            }
           System.out.println();
         
        }

    }

}
