import java.util.Scanner;

public class javamoocfiI3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write input:");
        String message = scanner.nextLine();

        System.out.println(message);

        scanner.close();
    }
}

