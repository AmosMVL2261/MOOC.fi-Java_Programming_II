import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list=list;
        this.scanner=scanner;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String option = scanner.nextLine();
            if(option.equals("stop")){
                //System.out.println();
                break;
            }else if(option.equals("add")){
                System.out.println("To add:");
                String word = scanner.nextLine();
                this.list.add(word);
            }else if(option.equals("list")){
                this.list.print();
            }else if(option.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);
            }else{
                System.out.println("Unknown command");
                
            }
            
        }
    }
}
