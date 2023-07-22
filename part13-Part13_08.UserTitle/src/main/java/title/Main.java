package title;

import javafx.application.Application;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Window's name: ");
        String name = scanner.nextLine();
        Application.launch(UserTitle.class, "--name="+name);
    }

}
