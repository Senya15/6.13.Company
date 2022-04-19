package Company;

import Company.Application.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Company {
    int income = 0;
    List<Employee> employeeList = new ArrayList<Employee>();

    public void hire() {
        System.out.printf("Какого сотрудника нанять? (1 -> %s, 2 -> %s, 3 -> %s, " +
                "любое доугое число -> выход):%n", "Manager", "TopManager", "Operator");
        int inCommand = ScanCommand.nextIntCommand();
        switch (inCommand) {
            case 1:
                getNewManager(1);
                break;
            case 2:
                getNewTopManager(1);
                break;
            case 3:
                getNewOperator(1);
                break;
            default:
                System.out.println("Выход...");
        }
    }

    public void hireAll() {

    }

    void setIncome(int income) {
        this.income += income;
    }


    void getNewManager(int count) {
        for (int i = 0; i < count; i++) {
            Manager employee = new Manager();
            employeeList.add(employee);
            setIncome(employee.getIncome());
        }
    }

    void getNewTopManager(int count) {
        for (int i = 0; i < count; i++) {
            TopManager employee = new TopManager();
            employeeList.add(employee);
        }
    }

    void getNewOperator(int count) {
        for (int i = 0; i < count; i++) {
            Operator employee = new Operator();
            employeeList.add(employee);
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {

        return;
    }

    public List<Employee> getLowestSalaryStaff(int count) {

    }
}
