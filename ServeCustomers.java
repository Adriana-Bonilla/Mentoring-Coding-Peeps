import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ServeCustomers {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the coffee shop! Type customer names (type 'done' to stop):");
        
        while (true) {
            String customer = scanner.nextLine();
            if (customer.equalsIgnoreCase("done")) break;
            queue.add(customer);
        }

        System.out.println("\nServing customers in order:");
        while (!queue.isEmpty()) {
            System.out.println("☕ Serving: " + queue.poll());
        }
        
        scanner.close();
    }
}
