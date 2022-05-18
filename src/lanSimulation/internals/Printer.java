package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String name) {
		super(Node.PRINTER, name);
		// TODO Auto-generated constructor stub
	}
	
	public void appendTypeNode(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
}
