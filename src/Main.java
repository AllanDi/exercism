import exercisms.basics.Lasagna;
import exercisms.booleans.AnnalynsInfiltration;
import exercisms.chars.SqueakyClean;
import exercisms.ifElseStatements.CarsAssemble;
import exercisms.strings.LogLevels;

public class Main {
    public static void main(String[] args) {

        System.out.println(SqueakyClean.clean("my    Id"));
        System.out.println(SqueakyClean.clean("my\0Id"));
        System.out.println(SqueakyClean.clean("à-1ḃç"));
        System.out.println(SqueakyClean.clean("9 -abcĐ\uD83D\uDE00ω\0"));

    }
}