import java.util.ArrayList;
import java.util.Scanner;

public class instructor extends employee {
    public instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public static void register(ArrayList Persons){
        //til at registrere medlemmer, kaldes fra main
        Scanner console = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String[] line = {"Name :", "CPR number :"};
        for(int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
            String input = console.nextLine();
            list.add(input);
        }
        System.out.print("Hours: ");
        int h = console.nextInt();
        person i = new instructor(list.get(0), list.get(1), h*1, h*456);
        Persons.add(i);
    }

    @Override
    public String toString(){
        return(super.toString());
    }
}
