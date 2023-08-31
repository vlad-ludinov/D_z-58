public class Task2 {
    
    public static void main(String[] args) {
        

        // если честно не совсем понял суть задания,
        // на прошлом уроке было задание в котором было
        // много методов, и там я так понял надо было
        // сделать чтобы все ошибки выкидывали исключения, 
        // вместо прекращения работы программы,
        // а тут всего несколько строчек кода,
        // где одна ошибка, у которой уже есть выброс исключения,
        // и еще одна ошибка, суть которой в том что массива тупо нет,
        // и ее я так понимаю, нельзя обработать через try catch,
        // и я не сомвсем понял что именно надо сделать,
        // сделать так чтобы не было ошибок и прогрмма сработала до конца
        // или надо добавить массив и добавить в catch исключение
        // выхода за пределы индекса массива, чтобы исключения срабатывали?
        // вообщем я сделал два варианта, в одном все работает
        // во втором срабатывает исключение выхода за пределы массива

        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        
        
        try {
            int[] intArray = new int[2];
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
