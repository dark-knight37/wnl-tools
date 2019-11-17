package wnl.textual.domain;

import wnl.textual.node.Node;

public abstract class SimpleComponent extends Component {

	protected double failureProb;

	public SimpleComponent(String nm, Node nn) {
		super(nm, nn);
		this.failureProb = 0.0;
	}

	public double getFailureProb() {
		return this.failureProb;
	}
}