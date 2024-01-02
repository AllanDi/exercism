package exercisms.lists;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {

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
        System.out.println(languageList.isExciting());
    }

    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean empty = false;
        if (languages.size() == 0) {
            return empty =true;
        }
        return empty;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        for (String e:languages ){
            if (e == language){
                return true;
            }
        }
        return false;
    }

    public boolean isExciting() {
        for (String e:languages ){
            if (e == "Kotlin" || e == "Java" ){
                return true;
            }
        }
        return false;
    }


    /*
    import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
     */



}
