import java.util.Scanner;

public class odev {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int dayOfMonth [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        
        

        for(int j = 2020; j <= 2030; j++) {

    
        if (j % 4 == 0) {
            dayOfMonth[1] = 29;
        }
            else
                dayOfMonth[1] = 28;
        
            System.out.println("\n\n  year is " + j + "\n");
        
        for (int i = 0; i < 12; i++) {
        
            System.out.print(i + 1 + ". ayda " + dayOfMonth[i] + " gun var - ");


        }
    }

    }

}

