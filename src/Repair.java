
public class Repair implements ICommand{
	
	Repairer repairer;
	
	public Repair(Repairer repairer) {
		this.repairer = repairer;
	}
	
	public void execute() {
		this.repairer.repair();
	}
}
