import Company.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            employees.add(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            employees.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            employees.add(new TopManager());
        }

        company.hireAll(employees);


        System.out.println(company.getTopSalaryStaff(5));
        System.out.println("------------------------------------");
        System.out.println(company.getLowestSalaryStaff(5));
    }
}
