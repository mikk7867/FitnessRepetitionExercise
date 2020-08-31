import java.util.ArrayList;
import java.util.Scanner;

public class member extends person  {
    private boolean isBasic;

    public static String getMemberType(boolean isBasic) {
        if (isBasic){
            return "Basic";
        } else {
            return "Full";
        }
    }

    public static int monthlyFee(boolean isBasic){
        if (isBasic){
            return 199;
        } else {
            return 299;
        }
    }

    public boolean isBasic() {
        return isBasic;
    }

    public member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public static void register(ArrayList<person> Persons){
        //til at registrere medlemmer, kaldes fra main
        Scanner console = new Scanner(System.in);
        String[] first = {"", "", ""};
        String[] line = {"Name: ", "CPR number: "};
        for(int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
            String input = console.nextLine();
            first[i] = input;
        }
        System.out.println("Input 1 for 'Basic' membership: ");
        System.out.println("Input 2 for 'Full' membership: ");
        int i = 1;
        boolean b = false;
        do {
            String input = console.next();
            switch (input) {
                case "1":
                    b = true;
                    i = 0;
                    break;
                case "2":
                    b = false;
                    i = 0;
                    break;
                default:
                    System.out.println("Invalid menu choice, please try again");
                    break;
            }
        }while (i == 1);
        person m = new member(first[0],first[1],b);
        Persons.add(m);
    }

    public static void show(ArrayList<person> Persons){
        System.out.println("Members:");
        System.out.println("Name:\t\tCPR:\t\tMember Type:\t\tFee:");
        for(int i = 0; i < Persons.size(); i++) {
            person first = Persons.get(i);
            String second = first.toString();
            String[] third = second.split(", ");
            if(third.length == 3){
                String fourth = third[2];
                boolean fifth = Boolean.parseBoolean(fourth);
                System.out.println(third[0]+"\t\t"+third[1]+"\t\t"+getMemberType(fifth)+"\t\t"+monthlyFee(fifth));
            }
        }
    }

    @Override
    public String toString(){
        return(super.toString()+", "+isBasic);
    }
}
