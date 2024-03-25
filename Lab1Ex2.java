import java.util.Scanner;

class ShoppingList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //class

        System.out.println("Enter the list of products you want to buy");
        String input = scanner.nextLine();

        //make spaces
        String[] products = input.split(", ");

        //Display list
        System.out.println("Shopping List:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        //marking the purchased Items
        System.out.println("Enter the item you put in your card (enter 0 to exit)");

        int selected;
        while((selected = scanner.nextInt()) != 0){
            if(selected >= 1 && selected <= products.length){
                products[selected - 1] += "[bought]";
            }

            else {
                System.out.println("incorrect selection try again ");
            }

            //display the shopping card
            System.out.println("Updated Shopping List:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i]);
                //String.format() check
            }
            System.out.println("Enter the next item you put in your cart (enter '0' to exit):");
        }

        System.out.println("Thank you for shopping, SEE YOU LATER :)");
        scanner.close();
        }


    }