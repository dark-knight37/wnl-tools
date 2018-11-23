/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class ANoneDetectbody extends PDetectbody
{
    private TNodetecKw _nodetecKw_;

    public ANoneDetectbody()
    {
        // Constructor
    }

    public ANoneDetectbody(
        @SuppressWarnings("hiding") TNodetecKw _nodetecKw_)
    {
        // Constructor
        setNodetecKw(_nodetecKw_);

    }

    @Override
    public Object clone()
    {
        return new ANoneDetectbody(
            cloneNode(this._nodetecKw_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoneDetectbody(this);
    }

    public TNodetecKw getNodetecKw()
    {
        return this._nodetecKw_;
    }

    public void setNodetecKw(TNodetecKw node)
    {
        if(this._nodetecKw_ != null)
        {
            this._nodetecKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nodetecKw_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nodetecKw_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nodetecKw_ == child)
        {
            this._nodetecKw_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nodetecKw_ == oldChild)
        {
            setNodetecKw((TNodetecKw) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
