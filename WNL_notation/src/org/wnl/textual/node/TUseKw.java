/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class TUseKw extends Token
{
    public TUseKw()
    {
        super.setText("uses");
    }

    public TUseKw(int line, int pos)
    {
        super.setText("uses");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUseKw(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUseKw(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUseKw text.");
    }
}
