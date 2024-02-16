package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stackfunctions<G> {

    private List<G> stack = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Function 1: Push Element onto Stack
    public void pushElement(G element) {
        stack.add(element);
        System.out.println("Element " + element + " pushed onto the stack.");
    }

    // Function 2: Pop Element from Stack
    public void popElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            G poppedElement = stack.remove(stack.size() - 1);
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Function 3: Display Stack Elements
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }

    // Function 4: Check if Stack is Empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Function 5: Clear Stack
    public void clearStack() {
        stack.clear();
        System.out.println("Stack cleared.");
    }

    // Function 6: Find Minimum Element in Stack
    public void findMinElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No minimum element.");
        } else {
            // Assuming the elements in the stack are comparable
            G minElement = stack.get(0);
            for (G element : stack) {
                if (((Comparable<G>) element).compareTo(minElement) < 0) {
                    minElement = element;
                }
            }
            System.out.println("Minimum element in the stack: " + minElement);
        }
    }

    // Function 7: Exit Program
    public void exitProgram() {
        System.out.println("Exiting program. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        Stackfunctions<Integer> stack = new Stackfunctions<>();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push Element onto Stack");
            System.out.println("2. Pop Element from Stack");
            System.out.println("3. Display Stack Elements");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Clear Stack");
            System.out.println("6. Find Minimum Element in Stack");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push onto the stack:");
                    int element = scanner.nextInt();
                    stack.pushElement(element);
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
                    stack.findMinElement();
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
