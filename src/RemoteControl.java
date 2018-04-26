import java.util.ArrayList;

public class RemoteControl {
	ArrayList<ICommand> commands = new ArrayList<>();
	ArrayList<String> list = new ArrayList<>();
	Cooker cooker = new Cooker();
	Helper helper = new Helper();
	Painter painter = new Painter();
	Repairer repairer = new Repairer();
	Sender sender = new Sender();
	
	public void doTasks() {
		for(int i=0; i<commands.size(); i++) {
			if(commands.size() == 0) {
				break;
			}
			commands.get(i).execute();
		}
	}
	
	void setCommands() {
		ICommand cmd;
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			switch(s) {
			case "1":
				cmd = new Cook(cooker);
				commands.add(cmd);
				break;
			case "2":
				cmd = new HelpHuman(helper);
				commands.add(cmd);
				break;
			case "3":
				cmd = new Paint(painter);
				commands.add(cmd);
				break;
			case "4":
				cmd = new Repair(repairer);
				commands.add(cmd);
				break;
			case "5":
				cmd = new SendEmail(sender);
				commands.add(cmd);
				break;
			default:
				break;
			}
		}
	}
}
