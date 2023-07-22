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
            System.out.println("First: "+container1.getLiquid()+"/100");
            System.out.println("Second: "+container2.getLiquid()+"/100");
            String input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] data = input.split(" ");
            String option = data[0];
            int liquid = Integer.valueOf(data[1]);
            if(option.equals("add")){
                container1.addLiquid(liquid);
            }
            if(option.equals("move")){
                if(container1.getLiquid()-liquid<0){
                    container2.addLiquid(container1.getLiquid());
                    container1.removeLiquid(liquid);
                }else{
                    container2.addLiquid(liquid);
                    container1.removeLiquid(liquid);
                }
            }
            if(option.equals("remove")){
                container2.removeLiquid(liquid);
            }
        }
    }

}
