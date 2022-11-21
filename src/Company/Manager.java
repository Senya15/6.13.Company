package Company;

import lombok.Getter;

@Getter
public class Manager implements Employee {
    private int bonus; // percent %
    private int salary;
    private int companyIncomeByEmployee;

    public Manager() {
        this.companyIncomeByEmployee = (int) (200_000 + Math.random() * 25_000);
        this.bonus = 5;
        this.salary = 100_000;
    }
    @Override
    public int getCompanyIncomeByEmployee() {
        return this.companyIncomeByEmployee;
    }
    @Override
    public int getMonthSalary() {
        return  (100_000 + (this.companyIncomeByEmployee / 100 * bonus));
    }

    @Override
    public String toString() {
        return this.getClass() + " Зарплата: " + getMonthSalary();
    }
}
