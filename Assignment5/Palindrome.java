import java.util.Scanner;
import java.lang.Character;
public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayStack<Character> myStack = new ArrayStack<Character>();

        String quit= "";

        // program will continue running until user inputs q
        while (!quit.equals("q")) {

            System.out.print("Enter a palindrome: ");
            String palindrome = input.nextLine();
            String initialPalindrome = palindrome; // saves the original palindrome to be outputted later
            boolean isPalindrome = true;
            
            // removes all non alphabet characters from palindrome
            for (int i = 0; i < palindrome.length(); i++) {
                if (!Character.isLetter(palindrome.charAt(i))) {
                    String tempString = String.valueOf(palindrome.charAt(i));
                    palindrome = palindrome.replace(tempString, "");
                    i--;
                }
            }

            palindrome = palindrome.toLowerCase();

            // puts the first half of the string into the stack
            for (int i = 0; i < palindrome.length() / 2; i++) {
                myStack.push(palindrome.charAt(i));
            }

            // compares the second half of the string with the stack
            for (int i = (int)Math.round(palindrome.length() / 2.0); i < palindrome.length(); i++) {
                if(!(myStack.pop()).equals(palindrome.charAt(i))) {
                    isPalindrome = false;
                    break;
                }
            }

            // prints whether string is a palindrome
            if (isPalindrome) {
                System.out.println(initialPalindrome + " is a palindrome");
            }
            else {
                System.out.println(initialPalindrome + " is not a palindrome");
            }

            System.out.print("continue? (enter q to quit) ");
            quit = input.nextLine();

        }

        input.close();

    }
}