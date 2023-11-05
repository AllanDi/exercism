package exercisms.ternaryOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(salaryCalculator.multiplierPerDaysSkipped(3));
        System.out.println((salaryCalculator.multiplierPerProductsSold(21)));
        System.out.println((salaryCalculator.bonusForProductSold(5)));
        System.out.println((salaryCalculator.finalSalary(2,3)));
        System.out.println((salaryCalculator.finalSalary(4,40)));
    }

    public double baseSalary = 1000;

    public double multiplierPerDaysSkipped(int daysSkipped) {

        double value = daysSkipped <= 5.0 ? 1.0 : 0.85;
        return value;

    }

    public int multiplierPerProductsSold(int productsSold) {

        int value = productsSold > 20 ? 13 : 10;
        return value;
    }

    public double bonusForProductSold(int productsSold) {
       return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = ( baseSalary * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        double value = salary > 2000 ? 2000 : salary;
        return value;
    }

//    public class SalaryCalculator {
//        private static final double regularSalaryMultiplier = 1;
//        private static final int daysSkippedAllowance = 5;
//        private static final double daysSkippedSalaryMultiplier = 0.85;
//        private static final int regularBonusMultiplier = 10;
//        private static final int significantNumProducts = 20;
//        private static final int significantNumProductsBonusMultiplier = 13;
//        private static final double baseSalary = 1000.0;
//        private static final double maxTotalSalary = 2000.0;
//        public double multiplierPerDaysSkipped(int daysSkipped) {
//            return daysSkipped > daysSkippedAllowance ?
//                    daysSkippedSalaryMultiplier : regularSalaryMultiplier;
//        }
//
//        public int multiplierPerProductsSold(int productsSold) {
//            return productsSold > significantNumProducts ? significantNumProductsBonusMultiplier : regularBonusMultiplier;
//        }
//
//        public double bonusForProductSold(int productsSold) {
//            return this.multiplierPerProductsSold(productsSold) * productsSold;
//        }
//
//        public double finalSalary(int daysSkipped, int productsSold) {
//            double salary = 1000.0 * this.multiplierPerDaysSkipped(daysSkipped) +
//                    this.bonusForProductSold(productsSold);
//            return Math.min(salary, maxTotalSalary);
//        }
//    }

}
