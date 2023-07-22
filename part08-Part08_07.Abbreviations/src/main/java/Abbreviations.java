import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbreviations;

    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }

    public String clean(String s){
        s=s.toLowerCase();
        s=s.trim();
        return s;
    }

    public void addAbbreviation(String abbreviation, String explanation){
        if(abbreviation.equals("")){
            return;
        }
        abbreviation=clean(abbreviation);
        explanation=clean(explanation);
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        abbreviation=clean(abbreviation);
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)==true){
            return abbreviations.get(abbreviation);
        }else{
            return null;
        }
    }
}
