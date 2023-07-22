import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> list;

    public Employees(){
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        for(Person p : peopleToAdd){
            this.list.add(p);
        }
    }

    public void print(){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p);
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }

    


}
