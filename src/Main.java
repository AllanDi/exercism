import exercisms.arrays.BirdWatcher;
import exercisms.lists.LanguageList;

public class Main {
    public static void main(String[] args) {

        LanguageList languageList = new LanguageList();
        languageList.addLanguage("ingles");
        System.out.println(languageList.isEmpty());
        languageList.removeLanguage("ingles");
        System.out.println(languageList.isEmpty());
        languageList.addLanguage("ingles");
        System.out.println(languageList.firstLanguage());
        System.out.println(languageList.count());
        System.out.println(languageList.containsLanguage("ingles"));
        System.out.println(languageList.containsLanguage("java"));
        System.out.println(languageList.isExciting());
        languageList.addLanguage("Kotlin");
        System.out.println(languageList.isExciting());
        languageList.addLanguage("Java");
        System.out.println(languageList.isExciting());
    }
}