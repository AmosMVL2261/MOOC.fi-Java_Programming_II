public class Book implements Packable {

    private String name;
    private String author;
    private double weight;

    public Book(String author, String name, double weight){
        this.name=name;
        this.author=author;
        this.weight=weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.author+": "+this.name;
    }
    
}
