/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_a1_debuggingconsolidation;

/**
 *
 * @author ahalh7876
 */
import java.util.Scanner;
import javax.swing.*;

public class U3_A1_DebuggingConsolidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int questionNmbr = 1, num, strngnum;
        String strng, question;
        Scanner keyPress = new Scanner(System.in);
        switch (questionNmbr) {
            case 1:
                try {
                    System.out.println("Please enter a string 6 characters or longer: ");
                    strng = keyPress.nextLine();
                    if ((strng.length()) > 5) {
                        questionNmbr++;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.err.println("You have to enter a string 6 characters or longer.");
                }
            case 2:
                try {
                    System.out.println("Please enter a string with a lowercase a: ");
                    strng = keyPress.nextLine();
                    if (strng.indexOf('a') > 0) {
                        questionNmbr++;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.err.println("You have to enter a string with a lowercase a.");
                }
            case 3:
                try {
                    System.out.println("Please enter a string with a lowercase a: ");
                    strng = keyPress.nextLine();
                    if ((strng.length() > 4) && (strng.length() < 16)) {
                        questionNmbr++;
                        System.out.println("rEEEEE");
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.err.println("You have to enter a string with a lowercase a.");
                }
        }

    }

}
