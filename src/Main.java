import exercisms.basics.Lasagna;
import exercisms.booleans.AnnalynsInfiltration;
import exercisms.chars.SqueakyClean;
import exercisms.ifElseStatements.CarsAssemble;
import exercisms.strings.LogLevels;

public class Main {
    public static void main(String[] args) {

        System.out.println(SqueakyClean.clean("my    Id"));
        System.out.println(SqueakyClean.clean("my\0Id"));
        System.out.println(SqueakyClean.clean("à-ḃç"));
        System.out.println(SqueakyClean.clean("àḃç"));

        System.out.println("-------------------");
        System.out.println(SqueakyClean.teste("12345-1234-5"));
        System.out.println(SqueakyClean.teste("123456-12345"));


    }
}