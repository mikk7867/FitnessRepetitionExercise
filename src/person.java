import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class person {

    private String name;
    private String cpr;

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public person(String name, String cpr){
        this.name = name;
        this.cpr = cpr;
    }

    public static void register(ArrayList<person> Persons){
        //til at registrere data, kaldes fra main
        Scanner console = new Scanner(System.in);
        System.out.println("Input 1 to register a member");
        System.out.println("Input 2 to resister an employee");
        System.out.println("Input 0 to go back");
        String choice = console.next();
        switch(choice){
            case "1":
                member.register(Persons);
                break;
            case "2":
                employee.register(Persons);
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid menu choice, please try again");
                break;
        }
    }

    public static void show(ArrayList<person> Persons){
        Scanner console = new Scanner(System.in);
        System.out.println("Input 1 to view members");
        System.out.println("Input 2 to view employees");
        System.out.println("Input 0 to go back to the menu");
        String choice = console.next();
        switch(choice){
            case "1":
                member.show(Persons);
                break;
            case "2":
                employee.show(Persons);
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid menu choice, please try again");
        }
    }

    public String toString() {
        return (name+", "+cpr);
    }
}
