package exercisms.strings;

public class LogLevels {
    public static void main(String[] args) {

        System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));
        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }

    public static String message(String logLine) {
        String[] partes = logLine.split(":", 2);
        String mensagemDeErro = partes[1].trim();
        return mensagemDeErro;
    }
    public static String logLevel(String logLine) {
        String[] partes = logLine.split(":", 2);
        String mensagemDeErro = partes[0].trim();
        return mensagemDeErro.toLowerCase().replaceAll("\\[|\\]", "");
    }
    public static String reformat(String logLine) {
        String[] partes = logLine.split(":", 2);
        String mensagemDeErro = partes[1].trim();
        String tipoMensagem = partes[0].trim();
        return mensagemDeErro + " " + "(" + tipoMensagem.toLowerCase().replaceAll("\\[|\\]", "") + ")";
    }

    /*

    public class LogLevels {
        public static String message(String logLine) {
            return logLine.split("]: ")[1]
                    .trim();
        }
        public static String logLevel(String logLine) {
            return logLine.split("]: ")[0]
                    .substring(1)
                    .toLowerCase();
        }
        public static String reformat(String logLine) {
            return format("%s (%s)", message(logLine), logLevel(logLine));
        }
    }

     */
}
