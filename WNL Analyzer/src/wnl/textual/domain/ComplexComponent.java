package wnl.textual.domain;

import java.util.ArrayList;
import java.util.List;

import wnl.textual.node.Node;

public abstract class ComplexComponent extends Component {
	
	protected List<Component> subcomponents;
	
	public ComplexComponent(String nm, Node nn) {
		super(nm, nn);
		this.subcomponents = new ArrayList<Component>();
	}

	public int getSubComponentSize() {
		return this.subcomponents.size();
	}
	
	public Component getSubComponentAt(int i) {
		return this.subcomponents.get(i);
	}
	
	public Component getSubComponent(String name) {
		Component retval = null;
		int counter = 0;
		while ((retval == null) && (counter < this.subcomponents.size())) {
			Component temp = this.getSubComponentAt(counter);
			if (temp.getName().equals(name)) {
				retval = temp;
			}
			counter++;
		}
		return retval;
	}

	public List<Component> getSubComponents() {
		return this.subcomponents;
	}


}
