import java.util.ArrayList;
import java.util.Scanner;

public class admin extends employee {
    private int vacation;

    public admin(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary);
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public static void register(ArrayList Persons){
        //til at registrere medlemmer, kaldes fra main
        Scanner console = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String[] line = {"Name :", "CPR number :"};
        for(int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
            String input = console.next();
            list.add(input);
        }
        person i = new admin(list.get(0), list.get(1), 37, 23000, 5);
        Persons.add(i);
    }

    @Override
    public String toString(){
        return(super.toString()+", "+vacation);
    }
}
