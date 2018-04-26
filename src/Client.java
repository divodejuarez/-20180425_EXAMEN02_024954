import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner s = new Scanner(new File("C:\\Users\\roris\\Documents\\tasks.txt"));
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		
		ConcreteRobotFactory c = new ConcreteRobotFactory();
		Robot r1 = c.getNewRobot(0, list);
		Robot r2 = c.getNewRobot(1, list);
		Robot r3 = c.getNewRobot(2, list);
		
		r1.doTasks();
		r2.doTasks();
		r3.doTasks();
	}

}
