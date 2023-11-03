package exercisms.chars;
public class SqueakyClean {
    public static String clean(String identifier) {
       String result = identifier
               .replace(" ", "_")
               .replaceAll("\\p{Cntrl}", "CTRL");

       if (identifier.contains("-")) {

           String[] partes = identifier.split("-");
           char[] caracteres = partes[1].toCharArray();

           if (!Character.isDigit(caracteres[0])) {
               caracteres[0] = Character.toUpperCase(caracteres[0]);
               String string = new String(caracteres);
               return partes[0]+string;
           } else {

               return partes[0]+string;

           }

           return partes[0]+string;
       }

       return result;
    }

    public static String teste(String testeString) {



        String[] partes = testeString.split("-");
        char[] caracteres = partes[1].toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        String string = new String(caracteres);

        System.out.println(string);

        return testeString;






    }

}
