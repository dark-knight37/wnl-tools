/* This file was generated by SableCC (http://www.sablecc.org/). */

package bn.analysis.distribution.node;

import bn.analysis.distribution.analysis.Analysis;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PResult _pResult_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PResult _pResult_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPResult(_pResult_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pResult_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PResult getPResult()
    {
        return this._pResult_;
    }

    public void setPResult(PResult node)
    {
        if(this._pResult_ != null)
        {
            this._pResult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pResult_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pResult_ == child)
        {
            this._pResult_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pResult_ == oldChild)
        {
            setPResult((PResult) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pResult_) +
            toString(this._eof_);
    }
}
