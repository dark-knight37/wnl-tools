/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.node;

import wnl.textual.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASimpleService extends PService
{
    private TServKw _servKw_;
    private PSname _sname_;
    private TImplKw _implKw_;
    private PSbody _sbody_;
    private PDetectbody _detectbody_;
    private TSemi _semi_;

    public ASimpleService()
    {
        // Constructor
    }

    public ASimpleService(
        @SuppressWarnings("hiding") TServKw _servKw_,
        @SuppressWarnings("hiding") PSname _sname_,
        @SuppressWarnings("hiding") TImplKw _implKw_,
        @SuppressWarnings("hiding") PSbody _sbody_,
        @SuppressWarnings("hiding") PDetectbody _detectbody_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setServKw(_servKw_);

        setSname(_sname_);

        setImplKw(_implKw_);

        setSbody(_sbody_);

        setDetectbody(_detectbody_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleService(
            cloneNode(this._servKw_),
            cloneNode(this._sname_),
            cloneNode(this._implKw_),
            cloneNode(this._sbody_),
            cloneNode(this._detectbody_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleService(this);
    }

    public TServKw getServKw()
    {
        return this._servKw_;
    }

    public void setServKw(TServKw node)
    {
        if(this._servKw_ != null)
        {
            this._servKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._servKw_ = node;
    }

    public PSname getSname()
    {
        return this._sname_;
    }

    public void setSname(PSname node)
    {
        if(this._sname_ != null)
        {
            this._sname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sname_ = node;
    }

    public TImplKw getImplKw()
    {
        return this._implKw_;
    }

    public void setImplKw(TImplKw node)
    {
        if(this._implKw_ != null)
        {
            this._implKw_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._implKw_ = node;
    }

    public PSbody getSbody()
    {
        return this._sbody_;
    }

    public void setSbody(PSbody node)
    {
        if(this._sbody_ != null)
        {
            this._sbody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sbody_ = node;
    }

    public PDetectbody getDetectbody()
    {
        return this._detectbody_;
    }

    public void setDetectbody(PDetectbody node)
    {
        if(this._detectbody_ != null)
        {
            this._detectbody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._detectbody_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._servKw_)
            + toString(this._sname_)
            + toString(this._implKw_)
            + toString(this._sbody_)
            + toString(this._detectbody_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._servKw_ == child)
        {
            this._servKw_ = null;
            return;
        }

        if(this._sname_ == child)
        {
            this._sname_ = null;
            return;
        }

        if(this._implKw_ == child)
        {
            this._implKw_ = null;
            return;
        }

        if(this._sbody_ == child)
        {
            this._sbody_ = null;
            return;
        }

        if(this._detectbody_ == child)
        {
            this._detectbody_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._servKw_ == oldChild)
        {
            setServKw((TServKw) newChild);
            return;
        }

        if(this._sname_ == oldChild)
        {
            setSname((PSname) newChild);
            return;
        }

        if(this._implKw_ == oldChild)
        {
            setImplKw((TImplKw) newChild);
            return;
        }

        if(this._sbody_ == oldChild)
        {
            setSbody((PSbody) newChild);
            return;
        }

        if(this._detectbody_ == oldChild)
        {
            setDetectbody((PDetectbody) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}