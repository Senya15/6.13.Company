package Company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator implements Employee {
    private int salary;
    private int companyIncomeByEmployee;

    public Operator() {
        this.companyIncomeByEmployee = (int) (150_000 + Math.random() * 25_000);
        this.salary = (int) (50_000 + (Math.random() * 25_000));
    }

    @Override
    public int getCompanyIncomeByEmployee() {
        return this.companyIncomeByEmployee;
    }

    @Override
    public int getMonthSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getClass() + " Зарплата: " + getMonthSalary();
    }
}
