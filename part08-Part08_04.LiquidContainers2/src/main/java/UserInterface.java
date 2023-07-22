import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){
        Container container1 = new Container();
        Container container2 = new Container();
        while(true){
            System.out.println("");
            System.out.println("First: "+container1.contains()+"/100");
            System.out.println("Second: "+container2.contains()+"/100");
            String input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] data = input.split(" ");
            String option = data[0];
            int liquid = Integer.valueOf(data[1]);
            if(option.equals("add")){
                container1.add(liquid);
            }
            if(option.equals("move")){
                if(container1.contains()-liquid<0){
                    container2.add(container1.contains());
                    container1.remove(liquid);
                }else{
                    container2.add(liquid);
                    container1.remove(liquid);
                }
            }
            if(option.equals("remove")){
                container2.remove(liquid);
            }
        }
    }

}
