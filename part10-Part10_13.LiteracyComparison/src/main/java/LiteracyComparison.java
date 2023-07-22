
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        ArrayList<People> groups = new ArrayList<>();
        for (String row : rows) {
            String[] data = row.split(",");
            groups.add(
                new People(
                    data[0].trim(), 
                    data[1].trim(), 
                    data[2].trim(), 
                    data[3].trim(), 
                    Integer.valueOf(data[4]), 
                    Double.valueOf(data[5])
                )
            );
        }
        groups.stream()
            .sorted((g1,g2) -> g1.compareTo(g2))
            .forEach(g -> System.out.println(g));
    }
}
