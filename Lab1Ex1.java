/*Exercise 1 Write a program that after loading a sequence of words in one line from a standard input,
will display these words in the reverse order of loading on the screen. Use the array to reverse the
order of the words.*/
import java.util.Scanner;

class ShoppingList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking the string from the user
        System.out.println("Enter a sequence of words separated by spaces: ");
        String inputLine = scanner.nextLine();

        //search for the spaces and split between ths spaces
        String[] words = inputLine.split("\\s+");

        //reverse the order
        for (int i = 0; i < words.length / 2; i++)
        {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        //display
        System.out.println("Reversed version: ");
        for(String printWord : words)
        {
            System.out.print(printWord + " ");
        }



    }
}