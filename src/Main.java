import exercisms.basics.Lasagna;
import exercisms.booleans.AnnalynsInfiltration;
import exercisms.chars.SqueakyClean;
import exercisms.classes.ElonsToyCar;
import exercisms.ifElseStatements.CarsAssemble;
import exercisms.strings.LogLevels;

public class Main {
    public static void main(String[] args) {

        System.out.println(ElonsToyCar.buy());

        System.out.println(ElonsToyCar.buy().distanceDisplay());

        System.out.println(ElonsToyCar.buy().batteryDisplay());

        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        car.drive();
        car.distanceDisplay();

    }
}