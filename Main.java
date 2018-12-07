/**********
 * Main.java
 * Mike Preble
 *
 * Convert lottery winnings that result in $0.01 every second
 * to a specific timestamp based on a user inputted value
 *
 */

/************
 *TODO
 *Add lotto number functionality
 *Calculate breakdown per year/month/day/hour and give the user the option to view it
 **************/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        /******
         * Begin initial output
         */
        System.out.print(" //-------------------------||");
        System.out.print("\n||     Mike's Lotto App     ||");
        System.out.print("\n||-------------------------//\n");

        //prompt the user for their name store in userName variable
        System.out.println("Before we get started, what is your name?");
        String userName = userInput.nextLine();

        System.out.println(userName + "do you want to use the calculator or lotto number generator?");
        System.out.println("Enter 1 for calculator \n Enter 2 for lotto number generator");
        int userChoice = userInput.nextInt();

        if (userChoice == 1) {
            //prompt the user for the money they want and turn into cents/seconds
            System.out.println(userName + ", how much money do you want?");
            LottoCalc.showCalc();

        } else if (userChoice == 2){
            LottoNumbers.showNumbers();
        }
    }
    static String showMonth(int months){

        String textMonth = null;
        //String textMonth;

        switch (months) {
            case 0:
                textMonth = "January";
                break;
            case 1:
                textMonth = "February";
                break;
            case 2:
                textMonth = "March";
                break;
            case 3:
                textMonth = "April";
                break;
            case 4:
                textMonth = "May";
                break;
            case 5:
                textMonth = "June";
                break;
            case 6:
                textMonth = "July";
                break;
            case 7:
                textMonth = "August";
                break;
            case 8:
                textMonth = "September";
                break;
            case 9:
                textMonth = "October";
                break;
            case 10:
                textMonth = "November";
                break;
            case 11:
                textMonth = "December";
                break;
            default:
                textMonth = "Oh no, I messed up";
                break;
        }
        return textMonth;
    }


}
