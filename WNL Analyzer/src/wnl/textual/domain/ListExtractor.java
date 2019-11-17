package wnl.textual.domain;

import java.util.ArrayList;
import java.util.List;

import wnl.textual.analysis.DepthFirstAdapter;

public class ListExtractor extends DepthFirstAdapter {
	
	protected List<String> payload;
	
	public ListExtractor() {
    	this.reset();
	}
	
	public void reset() {
    	this.payload = new ArrayList<String>();
	}
    
    public String getValue() {
		return this.payload.get(0);
	}

	public List<String> getValues() {
		return this.payload;
	}
}