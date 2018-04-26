import java.util.ArrayList;

public class ConcreteRobot implements Robot, Runnable{
	
	int id, index;
	ArrayList<String> q;
	RemoteControl rm;
	ArrayList<ICommand> commands = new ArrayList<>();
	
	
	public ConcreteRobot(int id, ArrayList<String> q) {
		this.id = id;
		this.q = q;
		rm = new RemoteControl();
	}
	
	public void printLogTask() {
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
		rm.setCommands();
		rm.doTasks();
	}
	
	@Override
	public void doTasks() {
		run();
	}

}
