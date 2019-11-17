package formalism.core;

public abstract class Edge extends NamedElement {

	protected Node from;
	
	protected Node to;
	
	public Edge(String name, Node f, Node t) {
		super(name);
		this.from = f;
		this.to = t;	
	}

	public Node getFrom() {
		return this.from;
	}

	public void setFrom(Node n) {
		this.from = n;
	}

	public Node getTo() {
		return this.to;
	}

	public void setTo(Node t) {
		this.to = t;
	}
	
	public boolean isIncomingTo(Node n) {
		return this.to.getName().equals(n.getName());
	}
	
	public boolean isOutgoingFrom(Node n) {
		return this.from.getName().equals(n.getName());
	}

}
