
import java.text.DecimalFormat;
import java.util.Scanner;

public class LottoCalc {
    static void showCalc(){
        //initialize user input values
        Scanner userInput = new Scanner(System.in);
        int userDollarValue = 0;
        int userCentsValue = 0;

        //calculate seconds for each time frame
        //declare them as final so they cannot be changed after initialization
        final int yearSeconds = 60 * 60 * 24 * 30 * 12;
        final int monthSeconds = 60 * 60 * 24 * 30;
        final int daySeconds = 60 * 60 * 24;
        final int hourSeconds = 60 * 60;

        //Declare a decimal format to add commas to outputted numbers
        DecimalFormat addCommas = new DecimalFormat("###,###");




        userDollarValue = userInput.nextInt();
        userCentsValue = userDollarValue * 100;

        /*******
         * End initial output
         */

        /*************
         * Begin whole number/left over seconds pattern
         *
         * pattern:
         * A: whole number: the product of remaining seconds / total seconds for a given time frame
         * B: left over seconds: the remainder of remaining seconds / total seconds for given time frame
         *
         * example
         * A: years = 100000000 / 31104000
         *     3 = 100000000 / 3110400
         * B: yearsRemainder = 100000000 % 31104000
         *     6688000 = 100000000 % 31104000
         * ----
         * A: months = 6688000 / 2592000
         *     2 = 6688000 / 2592000
         * B: monthsRemainder = 6688000 % 2592000
         *    1504000 = 6688000 % 2592000
         *
         *
         */
        int years = 2019 + userCentsValue / yearSeconds;
        int yearRemainder = userCentsValue % yearSeconds;

        int months = yearRemainder / monthSeconds;
        int monthRemainder = yearRemainder % monthSeconds;

        int days = monthRemainder / daySeconds;
        int dayRemainder = monthRemainder % (daySeconds);

        int hours = dayRemainder / hourSeconds;
        int hourRemainder = dayRemainder % hourSeconds;

        int minutes = hourRemainder / 60;
        int secondsLeft = hourRemainder % 60;

        /**********
         * End whole number/left over seconds pattern
         */


        //output values to the user
        System.out.println("It will take you " + addCommas.format(userCentsValue) + " seconds to make $" + addCommas.format(userDollarValue) +
                "\nThis is the exact moment in time you'll make it: ");

        System.out.println(Main.showMonth(months) + ", " + days + ", " + years +
                " at " + hours + ":" + minutes + ":" + secondsLeft);
    }
}
