package exercisms.chars;

public class SqueakyClean {
    public static void main(String[] args) {

        System.out.println(SqueakyClean.clean("my    Id"));
        System.out.println(SqueakyClean.clean("my\0Id"));
        System.out.println(SqueakyClean.clean("à-1ḃç"));
        System.out.println(SqueakyClean.clean("9 -abcĐ\uD83D\uDE00ω\0"));
    }

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

//    import java.util.Locale;
//    import java.util.regex.Pattern;
//
//    class SqueakyClean {
//
//        static String clean(String identifier) {
//
//            var result = identifier.replace(' ', '_')
//                    .replaceAll("[α-ω]", "")
//                    .replaceAll("\\p{C}", "CTRL")
//                    .replaceAll("[^\\p{L}\\p{P}]", "");
//
//            var matcher = Pattern.compile("(.*)(-\\p{L})(.*)").matcher(result);
//            if (matcher.matches()) {
//                result = matcher.replaceAll(
//                        matcher.group(1)
//                                + matcher.group(2).toUpperCase(Locale.ROOT).substring(1)
//                                + matcher.group(3)
//                );
//            }
//
//            return result;
//        }
//    }
}

