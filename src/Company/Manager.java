package Company;

import lombok.Getter;
@Getter
class Manager implements Employee {
    private int income;
    private int monthSalary;
    private double bonus = 5; // percent %

    Manager () {
    this.income = 115_000 + (int) (Math.random() * 25_000);
    this.monthSalary = (100_000 + (int) (getIncome() / 100 * bonus));
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
