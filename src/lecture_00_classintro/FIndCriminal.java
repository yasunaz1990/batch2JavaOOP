package lecture_00_classintro;

import java.util.Scanner;

public class FIndCriminal {

    public static void main(String[] args) {
        // FBI Internal Database for Criminal Archives
        String[] criminals = {"Al Capone",      // 0
                             "Billey D Kid",    // 1
                             "Jeffery Dollar",  // 2
                              "Michel Mires",   // 3
                              "Jeffery GOT",    // 4
                              "Sony the Child", // 5
                               "Yakuza Michiko"};// 6

        System.out.println("Hello agent Smith,");
        pause(1);
        System.out.println("Enter the subject name");
        pause(1);
        System.out.println("====================================");
        pause(1);
        System.out.print("NAME: ");
        Scanner keyboardInput = new Scanner(System.in);
        String userInput = keyboardInput.nextLine();            // name i got from the agent typing
        System.out.println();

        String bar = "▒";
        for(int i = 0; i < 40; i++) {
            pause();
            System.out.print(bar);
        }

        System.out.println();
        System.out.println("Result:");
        System.out.println("====================================");

        // Going through the array
        for(int i=0; i < criminals.length; i++) {
            String crm = criminals[i];  //

            if(crm.equals(userInput) == true) {
                pause(1);
                System.out.println("FOUND HIM!!! ALERT ALERT");
                return;
            }
        }

        System.out.println("NOT IN DB, HE IS INNOCENT!");
    }

    public static void pause(int second) {
        try{
            Thread.sleep(1000 * second);
        }catch (InterruptedException ignore) {
            // do nothing if program crashes.
        }
    }

    public static void pause() {
        try{
            Thread.sleep(100 );
        }catch (InterruptedException ignore) {
            // do nothing if program crashes.
        }
    }
}
