
public class SendEmail implements ICommand{

	Sender sender;
	
	public SendEmail(Sender sender) {
		this.sender = sender;
	}
	
	public void execute() {
		this.sender.send();
	}
}
