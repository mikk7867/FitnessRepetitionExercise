import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<person> Persons = new ArrayList<person>();
        filehandling.reader(Persons);
        boolean isRunning = true;
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the fitness club");
        do{
            sepparator();
            System.out.println("Input 1 to register a person");
            System.out.println("Input 2 to view data");
            System.out.println("Input 0 to exit the program");
            sepparator();
            String menuChoice = console.next(); //fejl hvis man inputter andet end tal, løst ved at bruge String i stedet for int
            switch(menuChoice){
                case "1":
                    //kalder metode fra person.java
                    person.register(Persons);
                    break;
                case "2":
                    //kalder metode fra person.java
                    person.show(Persons);
                    break;
                case "0": //virker
                    filehandling.printer(Persons);
                    System.out.println("Shutting down...");
                    System.exit(0);
                default: //virker
                    System.out.println("Invalid menu choice, please try again");
                    break;
            }
        }while(isRunning);
    }

    public static void sepparator(){
        for(int i = 0; i < 30; i++){
            System.out.print("=");
        }
        System.out.println();
    }
}

//CPR format -> DDMMYY-XXXX
