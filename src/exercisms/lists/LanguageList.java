package exercisms.lists;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {

        boolean empty = false;
        if (languages.size() == 0) {
            return empty =true;
        }
        return empty;
    }

    public void addLanguage(String language) {

    }

    public void removeLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {
        throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {
        throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        throw new UnsupportedOperationException("Please implement the isExciting() method");
    }
}
