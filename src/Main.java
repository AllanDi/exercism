import exercisms.basics.Lasagna;
import exercisms.booleans.AnnalynsInfiltration;
import exercisms.chars.SqueakyClean;
import exercisms.classes.ElonsToyCar;
import exercisms.ifElseStatements.CarsAssemble;
import exercisms.strings.LogLevels;
import exercisms.ternaryOperators.SalaryCalculator;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(salaryCalculator.multiplierPerDaysSkipped(3));
        System.out.println((salaryCalculator.multiplierPerProductsSold(21)));
        System.out.println((salaryCalculator.bonusForProductSold(5)));
        System.out.println((salaryCalculator.finalSalary(2,3)));
        System.out.println((salaryCalculator.finalSalary(4,40)));
    }
}