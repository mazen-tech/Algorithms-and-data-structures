import java.util.ArrayList;
import java.util.Scanner;

class main {
    public static void main(String[] args) {

        //create a new stack
        TStack<String> bookStack = new TStack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last recent Books that you read");

        for(int i = 0; i < 5; i++){
            System.out.print("Book " + (i + 1) + ": ");
            String bookTitle = scanner.nextLine();
            bookStack.push(bookTitle);
        }

        //Display the data
        System.out.println("\n book is reverse order: ");
        int count = 1;
        while (!bookStack.isEmpty()){
            String bookTitle = bookStack.pop();
            System.out.println(count++ + ". " + bookTitle);
        }
        scanner.close();
    }
}