package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name==null || name.length()==0  || name.length()>40){
            throw new IllegalArgumentException("Invalid person name");
        }
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Parameter Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
