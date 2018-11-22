/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.wnl.textual.node;

import org.wnl.textual.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleServices extends PServices
{
    private PService _service_;

    public ASimpleServices()
    {
        // Constructor
    }

    public ASimpleServices(
        @SuppressWarnings("hiding") PService _service_)
    {
        // Constructor
        setService(_service_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleServices(
            cloneNode(this._service_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleServices(this);
    }

    public PService getService()
    {
        return this._service_;
    }

    public void setService(PService node)
    {
        if(this._service_ != null)
        {
            this._service_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._service_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._service_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._service_ == child)
        {
            this._service_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._service_ == oldChild)
        {
            setService((PService) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}