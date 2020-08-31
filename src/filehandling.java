import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class filehandling {
    public static void printer(ArrayList<person> Persons) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("C:\\Users\\Mikkel\\IdeaProjects\\Fitness Repetition Exercise\\src\\persons.txt"));
        for(int i = 0; i < Persons.size();i++) {
            output.println(Persons.get(i));
        }
    }

    public static void reader(ArrayList<person> Persons) throws FileNotFoundException {
        File file = new File("C:\\Users\\Mikkel\\IdeaProjects\\Fitness Repetition Exercise\\src\\persons.txt");
        Scanner output = new Scanner(file);
        Persons.clear();
        while(output.hasNextLine()){
            String line = output.nextLine();
            String[] in = line.split(", ");
            if(in.length == 3){
                boolean b = Boolean.parseBoolean(in[2]);
                person info = new member(in[0],in[1],b);
                Persons.add(info);
            } else if (in.length == 4){
                int h = Integer.parseInt(in[2]);
                int s = Integer.parseInt(in[3]);
                person info = new instructor(in[0],in[1],h,s);
                Persons.add(info);
            } else if (in.length == 5){
                int h = Integer.parseInt(in[2]);
                int s = Integer.parseInt(in[3]);
                int v = Integer.parseInt(in[4]);
                person info = new admin(in[0],in[1],h,s,v);
                Persons.add(info);
            }
        }
    }
}
