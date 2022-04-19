package Company.Application;

import Company.Employee;

import java.util.Comparator;

public class EmployeeComparatorTop implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
       return Integer.compare(e1.getMonthSalary(), e2.getMonthSalary());
    }
}
