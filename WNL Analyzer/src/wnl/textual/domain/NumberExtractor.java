package wnl.textual.domain;

import wnl.textual.analysis.DepthFirstAdapter;
import wnl.textual.node.ABothFixedpoint;
import wnl.textual.node.ADecFixedpoint;
import wnl.textual.node.AEng2Floatingpoint;
import wnl.textual.node.AEngFloatingpoint;
import wnl.textual.node.AIntFixedpoint;
import wnl.textual.node.ANumAbsnum;
import wnl.textual.node.APosnegIntnum;

public class NumberExtractor extends DepthFirstAdapter {
	
	private String vault;
	
	public void inANumAbsnum(ANumAbsnum node) {
		this.vault = node.getNumber().getText();
    }

	public int getInt() {
		return Integer.valueOf(this.vault);
	}
	
	public void reset() {
		this.vault = "";
	}

	public double getDouble() {
		return Double.valueOf(this.vault);
	}

	public String asString() {
		return this.vault;
	}

	public void outAPlainFixedPoint(ANumAbsnum node) {
		this.vault = node.getNumber().getText();
    }
	
    public void outAEngFloatingpoint(AEngFloatingpoint node) {
    	NumberExtractor mantixExtractor = new NumberExtractor(); 
        node.getFixedpoint().apply(mantixExtractor);
        double mantix = mantixExtractor.getDouble();
        
    	NumberExtractor expExtractor = new NumberExtractor(); 
        node.getIntnum().apply(expExtractor);
        double exp = expExtractor.getInt();
        
        double value = mantix*Math.pow(10,exp);
        this.vault = Double.valueOf(value).toString(); 
    }
	
    public void outAPosnegIntnum(APosnegIntnum node) {
    	String sign = (node.getMinus().size() == 0) ? "" : "-";
    	this.vault = sign + node.getNumber().getText();
    }

    public void outAEng2Floatingpoint(AEng2Floatingpoint node) {
    	NumberExtractor expExtractor = new NumberExtractor(); 
        node.getIntnum().apply(expExtractor);
        double exp = expExtractor.getInt();
        
        double value = Math.pow(10,exp);
        this.vault = Double.valueOf(value).toString();
    }
	

    public void outAIntFixedpoint(AIntFixedpoint node) {
    	APosnegIntnum intnum = (APosnegIntnum) node.getIntnum();
    	String sign = (intnum.getMinus().size() == 0) ? "" : "-";
    	this.vault = sign + intnum.getNumber().getText();
    }

    public void outADecFixedpoint(ADecFixedpoint node) {
    	NumberExtractor absExtractor = new NumberExtractor(); 
        node.getAbsnum().apply(absExtractor);
        this.vault = "0." + absExtractor.asString();
    }
    
    public void outABothFixedpoint(ABothFixedpoint node) {
    	NumberExtractor absExtractor = new NumberExtractor(); 
        node.getAbsnum().apply(absExtractor);
        String abs = absExtractor.asString();
        
    	APosnegIntnum intnum = (APosnegIntnum) node.getIntnum();
    	String sign = (intnum.getMinus().size() == 0) ? "" : "-";
    	this.vault = sign + intnum.getNumber().getText() + "." + abs;
    }
}