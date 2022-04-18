package Company;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class Company {
    int income;
    Scanner scInt = new Scanner(System.in);

    public void hire() {
        System.out.printf("Какого сотрудника нанять? (1 -> %s, 2 -> %s, 3 -> %s, " +
                "любое доугое число -> выход):%n", "Manager", "TopManager", "Operator");
        int inCommand = Application.nextIntCommand(scInt);
        switch (inCommand) {
            case 1:
                getNewManager(1, 1);
                break;
            case 2 :
                getNewTopManager(1);
                break;
            case 3:
                getNewEmployee(1);
                break;
            default:
                System.out.println("Выход...");
        }
    }

    public void hireAll() {

    }

    void getNewEmployee(int count, int  ) {
        if ()
        for (int i = 0; i < count; i++) {
            Employee employee = new Operator();
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {

        return;
    }

    public List<Employee> getLowestSalaryStaff(int count) {

    }
}
