
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> persons = new HashMap<>();
        persons.put("matthew","matt");
        persons.put("michael","mix");
        persons.put("arthur","artie");
        System.out.println(persons.get("matthew"));
    }

}
