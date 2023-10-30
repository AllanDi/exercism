package exercisms.chars;

import java.nio.charset.Charset;
import java.text.Normalizer;

public class SqueakyClean {
    public static String clean(String identifier) {
        String regex = "[\\p{Cntrl}]";
        String normalizedText = Normalizer.normalize(identifier, Normalizer.Form.NFC);
        String cleanText = normalizedText
                .replaceAll(regex, "CTRL")
                .replaceAll(" ", "_");

        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < cleanText.length(); i++) {
            char c = cleanText.charAt(i);
            if (c == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                camelCase.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                camelCase.append(c);
            }
        }

        return camelCase.toString();
    }
}
