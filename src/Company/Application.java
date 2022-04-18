package Company;

import java.util.Scanner;

class Application {

    public static int nextIntCommand(Scanner scInt) {
        while (!scInt.hasNextInt()) {
            System.out.println("Неверно! Повторите ввод ещё раз.");
            scInt.next();
        }
        return scInt.nextInt();
    }
}
