package Company;

import Company.Application.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Setter
@Getter
public class Company {
    public static int income;
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void hire() {
        System.out.printf("Какого сотрудника нанять? (1 -> %s, 2 -> %s, 3 -> %s, " +
                "любое доугое число -> выход):%n", "Manager", "TopManager", "Operator");
        int inCommand = ScanCommand.nextIntCommand();
        switch (inCommand) {
            case 1 -> hireNewManager(1);
            case 2 -> hireNewTopManager(1);
            case 3 -> hireNewOperator(1);
            default -> System.out.println("Выход...");
        }
    }

    public void hireAll(List<Employee> employees) {
        employeeList.addAll(employees);
        employees.forEach(employee -> addIncome(employee.getCompanyIncomeByEmployee() - employee.getMonthSalary()));
    }

    private void addIncome(int income) {
        this.income += income;
    }


    public void hireNewManager(int count) {
        for (int i = 0; i < count; i++) {
            Manager employee = new Manager();
            employeeList.add(employee);
            addIncome(employee.getCompanyIncomeByEmployee() - employee.getMonthSalary());
        }
    }

    public void hireNewTopManager(int count) {
        for (int i = 0; i < count; i++) {
            TopManager employee = new TopManager();
            employeeList.add(employee);
            addIncome(employee.getCompanyIncomeByEmployee() - employee.getMonthSalary());
        }
    }

    public void hireNewOperator(int count) {
        for (int i = 0; i < count; i++) {
            Operator employee = new Operator();
            employeeList.add(employee);
            addIncome(employee.getCompanyIncomeByEmployee() - employee.getMonthSalary());
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {

        return employeeList.stream().sorted(Comparator.comparing((Employee employee)
                -> employee.getMonthSalary())).collect(Collectors.toList()).subList(employeeList.size() - 1 - count, employeeList.size() - 1);

       /* EmployeeComparatorTop comparatorTop = new EmployeeComparatorTop();
        Collections.sort(this.employeeList, comparatorTop);
        List<Employee> employees = new ArrayList<>();
        for (int i = employeeList.size() - 1; i > employeeList.size() - 1 - count; i--) {
            employees.add(this.employeeList.get(i));
        }

        return employees;*/

    }

    public List<Employee> getLowestSalaryStaff(int count) {
        EmployeeComparatorTop comparatorTop = new EmployeeComparatorTop();
        Collections.sort(this.employeeList, comparatorTop);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(this.employeeList.get(i));
        }

        return employees;

    }
}
