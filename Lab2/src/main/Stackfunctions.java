package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stackfunctions<G> {

    private List<G> stack = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public void pushElement(G element) {
        stack.add(element);
        System.out.println("Element " + element + " pushed onto the stack.");
    }

    public void popElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            G poppedElement = stack.remove(stack.size() - 1);
            System.out.println("Popped element: " + poppedElement);
        }
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clearStack() {
        stack.clear();
        System.out.println("Stack cleared.");
    }

    public void findElement(String search) {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            boolean found = false;
            for(G element : stack)
            {
            	if(element instanceof Movie && ((Movie) element).getTitle().equalsIgnoreCase(search))
            	{
            		System.out.println("Movie found: " + element);
            		found = true;
            		break;
            	}
            }
            if (!found) {
            	System.out.println("Movie not found.");
            }
                }
            }
      

    public void exitProgram() {
        System.out.println("Exiting program. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        Stackfunctions<Movie> stack = new Stackfunctions<>();

        while (true) {
        	System.out.println("\nChoose an operation:");
            System.out.println("1. Push Movie onto Stack");
            System.out.println("2. Pop Movie from Stack");
            System.out.println("3. Display Stack Movies");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Clear Stack");
            System.out.println("6. Search Movie in Stack");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Enter the movie title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the movie score:");
                    int score = scanner.nextInt();
                    Movie movie = new Movie(title, score);
                    stack.pushElement(movie);
                    break;
                case 2:
                    stack.popElement();
                    break;
                case 3:
                    stack.displayStack();
                    break;
                case 4:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    stack.clearStack();
                    break;
                case 6:
                    System.out.println("Enter the movie title:");
                    String search = scanner.nextLine();
                    stack.findElement(search);
                    break;
                case 7:
                    stack.exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}