import java.util.Scanner;

public class Lommeregner {
    // 5 metoder til at regne med to integers
    int sum(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }

    int secret(int a, int b) {
        return a + a - b * b;
    }
}
