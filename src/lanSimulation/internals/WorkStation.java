package lanSimulation.internals;

public class WorkStation extends Node {

	public WorkStation(String name) {
		super(Node.WORKSTATION, name);
		// TODO Auto-generated constructor stub
	}
	
	public void appendTypeNode(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
}
