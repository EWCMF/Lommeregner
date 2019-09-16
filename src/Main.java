import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lommeregner number = new Lommeregner();

        Scanner readInput = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNumber = readInput.nextInt();
        System.out.print("Second number: ");
        int secondNumber = readInput.nextInt();
        System.out.println("What operation? (1: add, 2: minus, 3: multiply, 4: division, 5: secret)");
        int operation = readInput.nextInt();
        if (1 < operation || operation > 5) {
            System.out.println("Invalid input");
        }
        else {
            switch (operation) {
                case 1:
                    System.out.println("Result is: " + number.sum(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Result is: " + number.minus(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("Result is: " + number.multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println("Result is: " + number.division(firstNumber, secondNumber));
                    break;
                case 5:
                    System.out.println("Result is: " + number.secret(firstNumber, secondNumber));
                    break;
            }
        }
    }
}
