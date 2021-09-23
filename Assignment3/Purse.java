import java.util.Scanner;
public class Purse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayBag<String> myPurse = new ArrayBag<String>(100);

        String coin = "";

        System.out.println("Purse");
        System.out.println("enter either DO, H, Q, DI, N, P or E to end input");
        System.out.print("Enter Coins: ");

        // enter input
        while (!coin.equals("E")) {
            coin = input.nextLine();
            coin = coin.toUpperCase();

            // checks if coin is a valid input
            if (checkTender(coin)) {
                myPurse.add(coin);
                System.out.print("Enter the next coin: ");
            }
            // checks if input was e so it won't print an invalid input
            else if (coin.equals("E")) {
                System.out.println();
            }
            // prints invalid input and does not add coin to myPurse
            else {
                System.out.println("--invalid input-- Please re-enter");
                System.out.print("Enter the next coin: ");
            }
        }

        // print coins
        printCoins(myPurse);

        // remove duplicates
        System.out.println("\nRemove Duplicate Coins");
        removeCoins(myPurse);

        // prints coins again without duplicates
        printCoins(myPurse);

        input.close();
    }

    // method to print the total in purse 
    // and the amount of each coin type
    public static void printCoins(ArrayBag<String> myPurse) {
        System.out.printf("Total Amount in the Purse: $%.2f", calcTotal(myPurse));
        System.out.println("\nNumber of Dollars: " + myPurse.getFrequencyOf("DO"));
        System.out.println("Number of Half Dollars: " + myPurse.getFrequencyOf("H"));
        System.out.println("Number of Quarters: " + myPurse.getFrequencyOf("Q"));
        System.out.println("Number of Dimes: " + myPurse.getFrequencyOf("DI"));
        System.out.println("Number of Nickles: " + myPurse.getFrequencyOf("N"));
        System.out.println("Number of Pennies: " + myPurse.getFrequencyOf("P"));
    }

    // removes all duplicate coins in purse
    public static void removeCoins(ArrayBag<String> myPurse) {
        String[] coinStrings = {"DO", "H", "Q", "DI", "N", "P"};
        int numberOfCoins;

        for (int i = 0; i < coinStrings.length; i++) {
            numberOfCoins = myPurse.getFrequencyOf(coinStrings[i]);
            for (int x = 1; x < numberOfCoins; x++) {
                myPurse.remove(coinStrings[i]);
            }
        }
    }

    // method to calc total
    public static double calcTotal(ArrayBag<String> myPurse) {
        double total = 0.0;

        total += myPurse.getFrequencyOf("DO") * 1.00;
        total += myPurse.getFrequencyOf("H") * 0.50;
        total += myPurse.getFrequencyOf("Q") * 0.25;
        total += myPurse.getFrequencyOf("DI") * 0.10;
        total += myPurse.getFrequencyOf("N") * 0.05;
        total += myPurse.getFrequencyOf("P") * 0.01;

        return Math.round(total * 100.0)/ 100.0;
    }

    // method that iterates through an array to check if 
    // user entered a valid coin
    public static boolean checkTender(String coin) {
        String[] coinStrings = {"DO", "H", "Q", "DI", "N", "P"};

        for (int i = 0; i < coinStrings.length; i++) {
            if (coin.equals(coinStrings[i])) {
                return true;
            }
        }
        return false;
    }
}
