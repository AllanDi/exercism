package exercisms.chars;

public class SqueakyClean {
    public static String clean(String identifier) {

        String regex = "[\\p{Cntrl}]";
        String cleanText = ((identifier
                .replaceAll(" ", "_"))
                .replaceAll(regex, "CTRL"));



        return cleanText;
    }
}
