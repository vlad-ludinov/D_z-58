import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        inputFloat();
        
    }


    // я не совсем понимаю почему, ему подходит
    // только дробное число через запятую,
    // а не через точку, но все работает

    public static void inputFloat() {
        System.out.print("Пожалуйста введите дробное число: ");
        Float fl = null;
        Scanner scanner = new Scanner(System.in);
        while(fl == null) {
            scanner = new Scanner(System.in);
            try {
                fl = scanner.nextFloat();
                System.out.println("Введенное число: " + fl);
            } catch (InputMismatchException e) {
                System.out.print("Пожалуйста введите дробное число: ");  
            } 
        }
        scanner.close();
    }
}