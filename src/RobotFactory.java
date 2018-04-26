import java.util.ArrayList;

public abstract class RobotFactory {
	
	public Robot getNewRobot(int id, ArrayList<String> q) {
		ConcreteRobot r = new ConcreteRobot(id, q);
		return r;
	}
	
	abstract void readTasks(ArrayList<String> q);
}
