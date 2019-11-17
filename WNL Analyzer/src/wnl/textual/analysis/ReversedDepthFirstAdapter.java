/* This file was generated by SableCC (http://www.sablecc.org/). */

package wnl.textual.analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import wnl.textual.node.ABothFixedpoint;
import wnl.textual.node.AComplexComponent;
import wnl.textual.node.ADecFixedpoint;
import wnl.textual.node.AEng2Floatingpoint;
import wnl.textual.node.AEngFloatingpoint;
import wnl.textual.node.AIdAname;
import wnl.textual.node.AIdCname;
import wnl.textual.node.AIdContname;
import wnl.textual.node.AIdSname;
import wnl.textual.node.AIntFixedpoint;
import wnl.textual.node.AListAffbody;
import wnl.textual.node.AListAttacks;
import wnl.textual.node.AListComponents;
import wnl.textual.node.AListContbody;
import wnl.textual.node.AListSbody;
import wnl.textual.node.AListServices;
import wnl.textual.node.AListUbody;
import wnl.textual.node.ANoneDetectbody;
import wnl.textual.node.ANoneUses;
import wnl.textual.node.ANumAbsnum;
import wnl.textual.node.APlainFloatingpoint;
import wnl.textual.node.APosnegIntnum;
import wnl.textual.node.ASimpleAffbody;
import wnl.textual.node.ASimpleAttack;
import wnl.textual.node.ASimpleAttacks;
import wnl.textual.node.ASimpleComponent;
import wnl.textual.node.ASimpleComponents;
import wnl.textual.node.ASimpleContbody;
import wnl.textual.node.ASimpleDescr;
import wnl.textual.node.ASimpleDetectbody;
import wnl.textual.node.ASimpleFailure;
import wnl.textual.node.ASimpleModel;
import wnl.textual.node.ASimpleRedundancy;
import wnl.textual.node.ASimpleReplication;
import wnl.textual.node.ASimpleSbody;
import wnl.textual.node.ASimpleService;
import wnl.textual.node.ASimpleServices;
import wnl.textual.node.ASimpleSuccess;
import wnl.textual.node.ASimpleUbody;
import wnl.textual.node.ASimpleUses;
import wnl.textual.node.Node;
import wnl.textual.node.PDescr;
import wnl.textual.node.Start;
import wnl.textual.node.TMinus;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPModel().apply(this);
        outStart(node);
    }

    public void inASimpleModel(ASimpleModel node)
    {
        defaultIn(node);
    }

    public void outASimpleModel(ASimpleModel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleModel(ASimpleModel node)
    {
        inASimpleModel(node);
        if(node.getCtrlZ() != null)
        {
            node.getCtrlZ().apply(this);
        }
        if(node.getAttacks() != null)
        {
            node.getAttacks().apply(this);
        }
        if(node.getComponents() != null)
        {
            node.getComponents().apply(this);
        }
        if(node.getServices() != null)
        {
            node.getServices().apply(this);
        }
        outASimpleModel(node);
    }

    public void inASimpleServices(ASimpleServices node)
    {
        defaultIn(node);
    }

    public void outASimpleServices(ASimpleServices node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleServices(ASimpleServices node)
    {
        inASimpleServices(node);
        if(node.getService() != null)
        {
            node.getService().apply(this);
        }
        outASimpleServices(node);
    }

    public void inAListServices(AListServices node)
    {
        defaultIn(node);
    }

    public void outAListServices(AListServices node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListServices(AListServices node)
    {
        inAListServices(node);
        if(node.getService() != null)
        {
            node.getService().apply(this);
        }
        if(node.getServices() != null)
        {
            node.getServices().apply(this);
        }
        outAListServices(node);
    }

    public void inASimpleService(ASimpleService node)
    {
        defaultIn(node);
    }

    public void outASimpleService(ASimpleService node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleService(ASimpleService node)
    {
        inASimpleService(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getDetectbody() != null)
        {
            node.getDetectbody().apply(this);
        }
        if(node.getSbody() != null)
        {
            node.getSbody().apply(this);
        }
        if(node.getImplKw() != null)
        {
            node.getImplKw().apply(this);
        }
        if(node.getSname() != null)
        {
            node.getSname().apply(this);
        }
        if(node.getServKw() != null)
        {
            node.getServKw().apply(this);
        }
        outASimpleService(node);
    }

    public void inASimpleDetectbody(ASimpleDetectbody node)
    {
        defaultIn(node);
    }

    public void outASimpleDetectbody(ASimpleDetectbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleDetectbody(ASimpleDetectbody node)
    {
        inASimpleDetectbody(node);
        if(node.getContbody() != null)
        {
            node.getContbody().apply(this);
        }
        if(node.getDetecKw() != null)
        {
            node.getDetecKw().apply(this);
        }
        outASimpleDetectbody(node);
    }

    public void inANoneDetectbody(ANoneDetectbody node)
    {
        defaultIn(node);
    }

    public void outANoneDetectbody(ANoneDetectbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneDetectbody(ANoneDetectbody node)
    {
        inANoneDetectbody(node);
        if(node.getNodetecKw() != null)
        {
            node.getNodetecKw().apply(this);
        }
        outANoneDetectbody(node);
    }

    public void inASimpleContbody(ASimpleContbody node)
    {
        defaultIn(node);
    }

    public void outASimpleContbody(ASimpleContbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleContbody(ASimpleContbody node)
    {
        inASimpleContbody(node);
        if(node.getContname() != null)
        {
            node.getContname().apply(this);
        }
        outASimpleContbody(node);
    }

    public void inAListContbody(AListContbody node)
    {
        defaultIn(node);
    }

    public void outAListContbody(AListContbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListContbody(AListContbody node)
    {
        inAListContbody(node);
        if(node.getContbody() != null)
        {
            node.getContbody().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getContname() != null)
        {
            node.getContname().apply(this);
        }
        outAListContbody(node);
    }

    public void inASimpleSbody(ASimpleSbody node)
    {
        defaultIn(node);
    }

    public void outASimpleSbody(ASimpleSbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleSbody(ASimpleSbody node)
    {
        inASimpleSbody(node);
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outASimpleSbody(node);
    }

    public void inAListSbody(AListSbody node)
    {
        defaultIn(node);
    }

    public void outAListSbody(AListSbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListSbody(AListSbody node)
    {
        inAListSbody(node);
        if(node.getSbody() != null)
        {
            node.getSbody().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outAListSbody(node);
    }

    public void inASimpleComponents(ASimpleComponents node)
    {
        defaultIn(node);
    }

    public void outASimpleComponents(ASimpleComponents node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleComponents(ASimpleComponents node)
    {
        inASimpleComponents(node);
        if(node.getComponent() != null)
        {
            node.getComponent().apply(this);
        }
        outASimpleComponents(node);
    }

    public void inAListComponents(AListComponents node)
    {
        defaultIn(node);
    }

    public void outAListComponents(AListComponents node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListComponents(AListComponents node)
    {
        inAListComponents(node);
        if(node.getComponent() != null)
        {
            node.getComponent().apply(this);
        }
        if(node.getComponents() != null)
        {
            node.getComponents().apply(this);
        }
        outAListComponents(node);
    }

    public void inASimpleComponent(ASimpleComponent node)
    {
        defaultIn(node);
    }

    public void outASimpleComponent(ASimpleComponent node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleComponent(ASimpleComponent node)
    {
        inASimpleComponent(node);
        if(node.getCCurl() != null)
        {
            node.getCCurl().apply(this);
        }
        if(node.getRedundancy() != null)
        {
            node.getRedundancy().apply(this);
        }
        if(node.getReplication() != null)
        {
            node.getReplication().apply(this);
        }
        if(node.getFailure() != null)
        {
            node.getFailure().apply(this);
        }
        if(node.getUses() != null)
        {
            node.getUses().apply(this);
        }
        {
            List<PDescr> copy = new ArrayList<PDescr>(node.getDescr());
            Collections.reverse(copy);
            for(PDescr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOCurl() != null)
        {
            node.getOCurl().apply(this);
        }
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        if(node.getCompKw() != null)
        {
            node.getCompKw().apply(this);
        }
        outASimpleComponent(node);
    }

    public void inAComplexComponent(AComplexComponent node)
    {
        defaultIn(node);
    }

    public void outAComplexComponent(AComplexComponent node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComplexComponent(AComplexComponent node)
    {
        inAComplexComponent(node);
        if(node.getCCurl() != null)
        {
            node.getCCurl().apply(this);
        }
        if(node.getRedundancy() != null)
        {
            node.getRedundancy().apply(this);
        }
        if(node.getReplication() != null)
        {
            node.getReplication().apply(this);
        }
        if(node.getComponents() != null)
        {
            node.getComponents().apply(this);
        }
        if(node.getUses() != null)
        {
            node.getUses().apply(this);
        }
        {
            List<PDescr> copy = new ArrayList<PDescr>(node.getDescr());
            Collections.reverse(copy);
            for(PDescr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOCurl() != null)
        {
            node.getOCurl().apply(this);
        }
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        if(node.getCompKw() != null)
        {
            node.getCompKw().apply(this);
        }
        outAComplexComponent(node);
    }

    public void inANoneUses(ANoneUses node)
    {
        defaultIn(node);
    }

    public void outANoneUses(ANoneUses node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneUses(ANoneUses node)
    {
        inANoneUses(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getNouseKw() != null)
        {
            node.getNouseKw().apply(this);
        }
        outANoneUses(node);
    }

    public void inASimpleUses(ASimpleUses node)
    {
        defaultIn(node);
    }

    public void outASimpleUses(ASimpleUses node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleUses(ASimpleUses node)
    {
        inASimpleUses(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getUbody() != null)
        {
            node.getUbody().apply(this);
        }
        if(node.getUseKw() != null)
        {
            node.getUseKw().apply(this);
        }
        outASimpleUses(node);
    }

    public void inASimpleUbody(ASimpleUbody node)
    {
        defaultIn(node);
    }

    public void outASimpleUbody(ASimpleUbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleUbody(ASimpleUbody node)
    {
        inASimpleUbody(node);
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outASimpleUbody(node);
    }

    public void inAListUbody(AListUbody node)
    {
        defaultIn(node);
    }

    public void outAListUbody(AListUbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListUbody(AListUbody node)
    {
        inAListUbody(node);
        if(node.getUbody() != null)
        {
            node.getUbody().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outAListUbody(node);
    }

    public void inASimpleAttacks(ASimpleAttacks node)
    {
        defaultIn(node);
    }

    public void outASimpleAttacks(ASimpleAttacks node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleAttacks(ASimpleAttacks node)
    {
        inASimpleAttacks(node);
        if(node.getAttack() != null)
        {
            node.getAttack().apply(this);
        }
        outASimpleAttacks(node);
    }

    public void inAListAttacks(AListAttacks node)
    {
        defaultIn(node);
    }

    public void outAListAttacks(AListAttacks node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListAttacks(AListAttacks node)
    {
        inAListAttacks(node);
        if(node.getAttack() != null)
        {
            node.getAttack().apply(this);
        }
        if(node.getAttacks() != null)
        {
            node.getAttacks().apply(this);
        }
        outAListAttacks(node);
    }

    public void inASimpleAttack(ASimpleAttack node)
    {
        defaultIn(node);
    }

    public void outASimpleAttack(ASimpleAttack node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleAttack(ASimpleAttack node)
    {
        inASimpleAttack(node);
        if(node.getCCurl() != null)
        {
            node.getCCurl().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getAffbody() != null)
        {
            node.getAffbody().apply(this);
        }
        if(node.getAonKw() != null)
        {
            node.getAonKw().apply(this);
        }
        if(node.getSuccess() != null)
        {
            node.getSuccess().apply(this);
        }
        {
            List<PDescr> copy = new ArrayList<PDescr>(node.getDescr());
            Collections.reverse(copy);
            for(PDescr e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getOCurl() != null)
        {
            node.getOCurl().apply(this);
        }
        if(node.getAname() != null)
        {
            node.getAname().apply(this);
        }
        if(node.getAttackKw() != null)
        {
            node.getAttackKw().apply(this);
        }
        outASimpleAttack(node);
    }

    public void inASimpleAffbody(ASimpleAffbody node)
    {
        defaultIn(node);
    }

    public void outASimpleAffbody(ASimpleAffbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleAffbody(ASimpleAffbody node)
    {
        inASimpleAffbody(node);
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outASimpleAffbody(node);
    }

    public void inAListAffbody(AListAffbody node)
    {
        defaultIn(node);
    }

    public void outAListAffbody(AListAffbody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListAffbody(AListAffbody node)
    {
        inAListAffbody(node);
        if(node.getAffbody() != null)
        {
            node.getAffbody().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getCname() != null)
        {
            node.getCname().apply(this);
        }
        outAListAffbody(node);
    }

    public void inASimpleDescr(ASimpleDescr node)
    {
        defaultIn(node);
    }

    public void outASimpleDescr(ASimpleDescr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleDescr(ASimpleDescr node)
    {
        inASimpleDescr(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getText() != null)
        {
            node.getText().apply(this);
        }
        if(node.getDescrKw() != null)
        {
            node.getDescrKw().apply(this);
        }
        outASimpleDescr(node);
    }

    public void inASimpleFailure(ASimpleFailure node)
    {
        defaultIn(node);
    }

    public void outASimpleFailure(ASimpleFailure node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleFailure(ASimpleFailure node)
    {
        inASimpleFailure(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getFloatingpoint() != null)
        {
            node.getFloatingpoint().apply(this);
        }
        if(node.getFailureKw() != null)
        {
            node.getFailureKw().apply(this);
        }
        outASimpleFailure(node);
    }

    public void inASimpleReplication(ASimpleReplication node)
    {
        defaultIn(node);
    }

    public void outASimpleReplication(ASimpleReplication node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleReplication(ASimpleReplication node)
    {
        inASimpleReplication(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getAbsnum() != null)
        {
            node.getAbsnum().apply(this);
        }
        if(node.getReplicationKw() != null)
        {
            node.getReplicationKw().apply(this);
        }
        outASimpleReplication(node);
    }

    public void inASimpleRedundancy(ASimpleRedundancy node)
    {
        defaultIn(node);
    }

    public void outASimpleRedundancy(ASimpleRedundancy node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleRedundancy(ASimpleRedundancy node)
    {
        inASimpleRedundancy(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getAbsnum() != null)
        {
            node.getAbsnum().apply(this);
        }
        if(node.getRedundancyKw() != null)
        {
            node.getRedundancyKw().apply(this);
        }
        outASimpleRedundancy(node);
    }

    public void inASimpleSuccess(ASimpleSuccess node)
    {
        defaultIn(node);
    }

    public void outASimpleSuccess(ASimpleSuccess node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleSuccess(ASimpleSuccess node)
    {
        inASimpleSuccess(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getFixedpoint() != null)
        {
            node.getFixedpoint().apply(this);
        }
        if(node.getSuccessKw() != null)
        {
            node.getSuccessKw().apply(this);
        }
        outASimpleSuccess(node);
    }

    public void inAPlainFloatingpoint(APlainFloatingpoint node)
    {
        defaultIn(node);
    }

    public void outAPlainFloatingpoint(APlainFloatingpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlainFloatingpoint(APlainFloatingpoint node)
    {
        inAPlainFloatingpoint(node);
        if(node.getFixedpoint() != null)
        {
            node.getFixedpoint().apply(this);
        }
        outAPlainFloatingpoint(node);
    }

    public void inAEngFloatingpoint(AEngFloatingpoint node)
    {
        defaultIn(node);
    }

    public void outAEngFloatingpoint(AEngFloatingpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEngFloatingpoint(AEngFloatingpoint node)
    {
        inAEngFloatingpoint(node);
        if(node.getIntnum() != null)
        {
            node.getIntnum().apply(this);
        }
        if(node.getEng() != null)
        {
            node.getEng().apply(this);
        }
        if(node.getFixedpoint() != null)
        {
            node.getFixedpoint().apply(this);
        }
        outAEngFloatingpoint(node);
    }

    public void inAEng2Floatingpoint(AEng2Floatingpoint node)
    {
        defaultIn(node);
    }

    public void outAEng2Floatingpoint(AEng2Floatingpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEng2Floatingpoint(AEng2Floatingpoint node)
    {
        inAEng2Floatingpoint(node);
        if(node.getIntnum() != null)
        {
            node.getIntnum().apply(this);
        }
        if(node.getUnoeng() != null)
        {
            node.getUnoeng().apply(this);
        }
        outAEng2Floatingpoint(node);
    }

    public void inAIntFixedpoint(AIntFixedpoint node)
    {
        defaultIn(node);
    }

    public void outAIntFixedpoint(AIntFixedpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntFixedpoint(AIntFixedpoint node)
    {
        inAIntFixedpoint(node);
        if(node.getIntnum() != null)
        {
            node.getIntnum().apply(this);
        }
        outAIntFixedpoint(node);
    }

    public void inADecFixedpoint(ADecFixedpoint node)
    {
        defaultIn(node);
    }

    public void outADecFixedpoint(ADecFixedpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecFixedpoint(ADecFixedpoint node)
    {
        inADecFixedpoint(node);
        if(node.getAbsnum() != null)
        {
            node.getAbsnum().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        outADecFixedpoint(node);
    }

    public void inABothFixedpoint(ABothFixedpoint node)
    {
        defaultIn(node);
    }

    public void outABothFixedpoint(ABothFixedpoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABothFixedpoint(ABothFixedpoint node)
    {
        inABothFixedpoint(node);
        if(node.getAbsnum() != null)
        {
            node.getAbsnum().apply(this);
        }
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getIntnum() != null)
        {
            node.getIntnum().apply(this);
        }
        outABothFixedpoint(node);
    }

    public void inAPosnegIntnum(APosnegIntnum node)
    {
        defaultIn(node);
    }

    public void outAPosnegIntnum(APosnegIntnum node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPosnegIntnum(APosnegIntnum node)
    {
        inAPosnegIntnum(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        {
            List<TMinus> copy = new ArrayList<TMinus>(node.getMinus());
            Collections.reverse(copy);
            for(TMinus e : copy)
            {
                e.apply(this);
            }
        }
        outAPosnegIntnum(node);
    }

    public void inANumAbsnum(ANumAbsnum node)
    {
        defaultIn(node);
    }

    public void outANumAbsnum(ANumAbsnum node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumAbsnum(ANumAbsnum node)
    {
        inANumAbsnum(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumAbsnum(node);
    }

    public void inAIdAname(AIdAname node)
    {
        defaultIn(node);
    }

    public void outAIdAname(AIdAname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAname(AIdAname node)
    {
        inAIdAname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdAname(node);
    }

    public void inAIdSname(AIdSname node)
    {
        defaultIn(node);
    }

    public void outAIdSname(AIdSname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdSname(AIdSname node)
    {
        inAIdSname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdSname(node);
    }

    public void inAIdContname(AIdContname node)
    {
        defaultIn(node);
    }

    public void outAIdContname(AIdContname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdContname(AIdContname node)
    {
        inAIdContname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdContname(node);
    }

    public void inAIdCname(AIdCname node)
    {
        defaultIn(node);
    }

    public void outAIdCname(AIdCname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdCname(AIdCname node)
    {
        inAIdCname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdCname(node);
    }
}