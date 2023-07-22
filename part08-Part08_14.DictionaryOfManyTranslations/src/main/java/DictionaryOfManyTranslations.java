import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = dictionary.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.dictionary.get(word)!=null){
            return this.dictionary.get(word);
        }else{
            return new ArrayList<String>();
        }
    }

    public void remove(String word){
        if(this.dictionary.get(word)!=null){
            this.dictionary.remove(word);
        }
    }
}
