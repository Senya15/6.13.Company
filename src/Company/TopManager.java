package Company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopManager implements Employee {
    private int companyIncomeByEmployee;
    private int salary;


    public TopManager() {
        this.salary = 150_000;
        this.companyIncomeByEmployee = (int) (250_000 + Math.random() * 25_000);
    }

    @Override
    public int getCompanyIncomeByEmployee() {
        return this.companyIncomeByEmployee;
    }

    @Override
    public int getMonthSalary() {
        return Company.income > 10_000_000 ? (int) (this.salary * 2.5) : this.salary;
    }

    @Override
    public String toString() {
        return this.getClass() + " Зарплата: " + getMonthSalary();
    }
}
