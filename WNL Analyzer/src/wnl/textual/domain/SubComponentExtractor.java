package wnl.textual.domain;

import wnl.textual.node.AComplexComponent;
import wnl.textual.node.AIdCname;
import wnl.textual.node.ASimpleComponent;

public class SubComponentExtractor extends ListExtractor {
	
	protected int depthLevel; 
	
	public SubComponentExtractor() {
		this.reset();
	}
	
	public void reset() {
		super.reset();
		this.depthLevel = 0;
	}
	
    public void inASimpleComponent(ASimpleComponent node) {
    	this.depthLevel++;
    }

    public void outASimpleComponent(ASimpleComponent node) {
        this.depthLevel--;
    }

    public void inAComplexComponent(AComplexComponent node) {
    	this.depthLevel++;
    }

    public void outAComplexComponent(AComplexComponent node) {
        this.depthLevel--;
    }
    
    public void inAIdCname(AIdCname node) {
    	if (this.depthLevel == 1) {
        	String name = node.getIdentifier().getText();
            this.payload.add(name);
    	}
    }

}