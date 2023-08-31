import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        inputEmptyString();
    }

    public static void inputEmptyString() {
        Scanner scanner = new Scanner(System.in);
        try {
            String newStr = scanner.nextLine();
            if (newStr.trim().isEmpty()) {
                throw new RuntimeException("Input empty string");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Нельзя вводить пустые строки");
        } finally {
            scanner.close();
        }
    }
}
