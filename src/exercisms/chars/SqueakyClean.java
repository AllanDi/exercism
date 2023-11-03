package exercisms.chars;
public class SqueakyClean {
    public static String clean(String identifier) {
       String result = identifier
               .replace(" ", "_")
               .replaceAll("\\p{Cntrl}", "CTRL");

       return result;
    }

    public static String teste(String testeString) {
        String[] partes = testeString.split("-");


        StringBuilder stringBuilder = new StringBuilder();


                stringBuilder.append(parte.substring(0, 1).toLowerCase());

                stringBuilder.append(parte.substring(1).toUpperCase());

                return stringBuilder.toString();

            }
        }

    }

}
