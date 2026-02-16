import java.util.Scanner;

public class DivisionOperations {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num = scanner.nextInt();
        int div = scanner.nextInt();
        scanner.close();

        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}
