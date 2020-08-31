import java.util.ArrayList;
import java.util.Scanner;

public class employee extends person {
    private int hours;
    private int salary;

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public static void register(ArrayList Persons){
        //til at registrere medlemmer, kaldes fra main
        Scanner console = new Scanner(System.in);
        System.out.println("Input 1 to register an adminisrator");
        System.out.println("Input 2 to register an instructor");
        System.out.println("Input 0 to go back to the menu");
        String choice = console.next();
        switch(choice){
            case "1":
                admin.register(Persons);
                break;
            case "2":
                instructor.register(Persons);
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid menu choice, please try again");
                break;
        }
    }

    public static void show(ArrayList<person> Persons){
        System.out.println("Members:");
        System.out.println("Name:\t\tCPR:\t\tHours:\t\tSalary:\t\tVacation:");
        for(int i = 0; i < Persons.size(); i++) {
            person first = Persons.get(i);
            String second = first.toString();
            String[] third = second.split(", ");
            if(third.length == 4){
                System.out.println(third[0]+"\t\t"+third[1]+"\t\t"+third[2]+"\t\t"+third[3]);
            } else if(third.length == 5){
                System.out.println(third[0]+"\t\t"+third[1]+"\t\t"+third[2]+"\t\t"+third[3]+"\t\t"+third[4]);
            }
        }
    }

    @Override
    public String toString(){
        return(super.toString()+", "+hours+", "+salary);
    }
}
