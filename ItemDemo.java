import java.util.Scanner;

public class ItemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Item item = new Item();
        
        System.out.println("=== Item Class Test Program ===");
        System.out.println("Initial price: " + item.getPrice());
        
        System.out.print("Please enter price: ");
        float userPrice = scanner.nextFloat();
        
        item.setPrice(userPrice);
        
        System.out.println("Price you entered: " + item.getPrice());
        
        System.out.print("Do you want to change the price? Enter new price (or 0 to keep current): ");
        float newPrice = scanner.nextFloat();
        
        if (newPrice != 0) {
            item.setPrice(newPrice);
            System.out.println("New price: " + item.getPrice());
        }
        
        System.out.println("=== Program End ===");
        scanner.close();
    }
}