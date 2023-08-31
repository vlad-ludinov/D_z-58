import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        
    //     Scanner scanner = new Scanner(System.in);

    //     String str = scanner.nextLine();
    //     String str2 = "       \n     ";
    //     System.out.println("-------------");
    //     System.out.println(str);
    //     System.out.println("-------------");
    //     System.out.println(str2);
    //     System.out.println("-------------");
    //     if (str2.isEmpty()) {
    //         System.out.println("yes");
    //     } else {
    //         System.out.println("no");
    //     }
    //     str2 = str2.trim();
    //     System.out.println(str2);
    //     System.out.println("-------------");
    //     if (str2.isEmpty()) {
    //         System.out.println("yes");
    //     } else {
    //         System.out.println("no");
    //     }
        inputEmptyString();
    }

    public static void inputEmptyString() {
        try {
            Scanner scanner = new Scanner(System.in);
            String newStr = scanner.nextLine();
            if (newStr.trim().isEmpty()) {
                throw new RuntimeException("Input empty string");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Нельзя вводить пустые строки");
        }
    }
}
