import java.util.*;

public class App {

//Ask the user to enter several numbers in one line, with a space between each number.

//Use the split method to separate the line into pieces and store them in a String array.

//Convert each piece from a String into an integer and store those integers in a new int array.
//Print how many numbers the user entered.
//Print the largest number from the array.
//Print the sum of all the numbers.


    public static void main(String[] args) throws Exception {
        System.out.println("Enter several numbers separated by spaces:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(" ");   
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("You entered " + numbers.length + " numbers");

        int largest = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            sum += num;
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Sum of all numbers: " + sum);
    }
}
