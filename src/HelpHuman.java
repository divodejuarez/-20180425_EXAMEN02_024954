
public class HelpHuman implements ICommand{
	
	Helper helper;
	
	public HelpHuman(Helper helper) {
		this.helper = helper;
	}
	
	public void execute() {
		this.helper.help();
	}
}
