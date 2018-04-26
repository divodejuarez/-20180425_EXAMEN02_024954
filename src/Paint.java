
public class Paint implements ICommand{
	
	Painter painter;
	
	public Paint(Painter painter) {
		this.painter = painter;
	}
	
	public void execute() {
		this.painter.paint();
	}
}
