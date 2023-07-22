package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private HashMap<String,String> dictionaryInverse;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
        this.dictionaryInverse = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.file=file;
    }

    public void add(String words, String translation){
        if(dictionary.get(words)==null){
            dictionary.put(words, translation);
            dictionaryInverse.put(translation, words);
        }
    }

    public String translate(String word){
        if(dictionary.get(word)!=null){
            return dictionary.get(word);
        }
        if(dictionaryInverse.get(word)!=null){
            return dictionaryInverse.get(word);
        }
        return null;
    }

    public void delete(String word){
        String translation = dictionary.get(word);
        String translationInverse = dictionaryInverse.get(word);
        if(translation!=null){
            dictionary.remove(word);
            dictionaryInverse.remove(translation);
        }
        if(translationInverse!=null){
            dictionary.remove(translationInverse);
            dictionaryInverse.remove(word);
        }
    }

    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.file))) {
            while(scanner.hasNext()){
                String[] data = scanner.nextLine().split(":");
                this.add(data[0],data[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String word : dictionary.keySet()) {
                writer.println(word+":"+dictionary.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
