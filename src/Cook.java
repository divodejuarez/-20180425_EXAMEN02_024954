
public class Cook implements ICommand{
	
	Cooker cooker;
	
	public Cook(Cooker cooker) {
		this.cooker = cooker;
	}
	
	public void execute() {
		this.cooker.cook();
	}

}
