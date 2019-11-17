package wnl.textual.domain;

import wnl.textual.node.AIdAname;
import wnl.textual.node.AIdCname;
import wnl.textual.node.AIdContname;
import wnl.textual.node.AIdSname;

public class IdentifierExtractor extends ListExtractor {
	
    public void inAIdAname(AIdAname node) {
        this.payload.add(node.getIdentifier().getText());
    }

    public void inAIdSname(AIdSname node){
        this.payload.add(node.getIdentifier().getText());
    }

    public void inAIdCname(AIdCname node) {
    	this.payload.add(node.getIdentifier().getText());
    }

    public void inAIdContname(AIdContname node) {
        this.payload.add(node.getIdentifier().getText());
    }
}