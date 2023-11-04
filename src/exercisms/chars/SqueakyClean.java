package exercisms.chars;

import java.util.regex.Pattern;

public class SqueakyClean {
    public static String clean(String identifier) {
        String result = identifier
                .replaceAll("[α-ω]", "")
                .replace(" ", "_")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[\\p{So}]", "")
                .replaceAll("\\d", "")
                .replaceAll("\0", "CTRL");

        String noDigit = "";

        if (identifier.contains("-")) {
            String[] parts = identifier.split("-");
            if (Character.isDigit(parts[1].charAt(0))) {
                noDigit = parts[1].substring(1);

                String resultIf = parts[0] + noDigit.substring(0, 1).toUpperCase() + noDigit.substring(1);
                String resultIf2 = resultIf
                        .replaceAll("[α-ω]", "")
                        .replace(" ", "_")
                        .replaceAll("\\p{Cntrl}", "CTRL")
                        .replaceAll("[\\p{So}]", "")
                        .replaceAll("\\d", "")
                        .replaceAll("\0", "CTRL");

                return resultIf2;
            } else {
                String resultIfElse = parts[0] + parts[1].substring(0, 1).toUpperCase() + parts[1].substring(1);
                String resultIfElse2 = resultIfElse
                        .replaceAll("[α-ω]", "")
                        .replace(" ", "_")
                        .replaceAll("\\p{Cntrl}", "CTRL")
                        .replaceAll("[\\p{So}]", "")
                        .replaceAll("\\d", "")
                        .replaceAll("\0", "CTRL");
                return resultIfElse2;
            }
        }
        return result;
    }
}

