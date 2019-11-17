/* This file was generated by SableCC (http://www.sablecc.org/). */

package bn.analysis.distribution.node;

import bn.analysis.distribution.analysis.Analysis;

@SuppressWarnings("nls")
public final class TRBra extends Token
{
    public TRBra()
    {
        super.setText("}");
    }

    public TRBra(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRBra(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRBra(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRBra text.");
    }
}
