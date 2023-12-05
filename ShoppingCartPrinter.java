import java.util.Scanner;

public class ShoppingCartPrinter {
    

    public static void main(String[] args){
        
        // creates new object of ItemToPurchase class to store info for item 1
        // asks user to input the details for item 1 and stores it
        System.out.println("---------\nFirst Item");
        System.out.print("Enter item name: ");
        Scanner scanner = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        item1.setName(scanner.nextLine());

        System.out.print("Enter item price: ");
        item1.setPrice(scanner.nextInt());

        System.out.print("Enter item quantity: ");
        item1.setQuantity(scanner.nextInt());
        System.out.print("---------\n\n");


        scanner.nextLine();

        // creates new object of ItemToPurchase class to store info for item 2
        // asks user to input the details for item 2 and stores it
        System.out.println("---------\nSecond Item");
        System.out.print("Enter item name: ");
        ItemToPurchase item2 = new ItemToPurchase();
        item2.setName(scanner.nextLine());

        System.out.print("Enter item price: ");
        item2.setPrice(scanner.nextInt());

        System.out.print("Enter item quantity: ");
        item2.setQuantity(scanner.nextInt());
        System.out.println("----------\n");



        // calculates and outputs total costs 
        System.out.println("---------\nTOTAL COST");
        
        // displays all the info stored for each item and then calculates the subtotal for each item by multiplying quanity and price
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getTotalPrice());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getTotalPrice());

        // adds the item1 and item2 subtotals to come up with a final total for the whole shopping trip
        int userTotal = item1.getTotalPrice() + item2.getTotalPrice();

        // outputs final total to the user 
        System.out.println("\nYour total: $" + userTotal);
        System.out.println("-----------");


        scanner.close();
    }
}
