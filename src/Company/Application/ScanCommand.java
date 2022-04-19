package Company.Application;

public class ScanCommand {

    public static int nextIntCommand() {
        java.util.Scanner scInt = new java.util.Scanner(System.in);
        while (!scInt.hasNextInt()) {
            System.out.println("Неверно! Повторите ввод ещё раз.");
            scInt.next();
        }
        return scInt.nextInt();
    }
}
