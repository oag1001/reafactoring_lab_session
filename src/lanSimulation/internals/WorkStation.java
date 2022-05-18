package lanSimulation.internals;

public class WorkStation extends Node {

	public WorkStation(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void appendTypeNode(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
	
	public void appendTypeNodeXML(StringBuffer buf) {
		
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}
}
