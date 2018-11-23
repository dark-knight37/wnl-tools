/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class TDetecKw extends Token
{
    public TDetecKw()
    {
        super.setText("detects");
    }

    public TDetecKw(int line, int pos)
    {
        super.setText("detects");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDetecKw(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDetecKw(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDetecKw text.");
    }
}
