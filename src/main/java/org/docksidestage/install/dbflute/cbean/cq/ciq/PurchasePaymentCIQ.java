package org.docksidestage.install.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.install.dbflute.cbean.*;
import org.docksidestage.install.dbflute.cbean.cq.bs.*;
import org.docksidestage.install.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentCIQ extends AbstractBsPurchasePaymentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPurchasePaymentCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PurchasePaymentCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPurchasePaymentCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValuePurchasePaymentId() { return _myCQ.xdfgetPurchasePaymentId(); }
    protected ConditionValue xgetCValuePurchaseId() { return _myCQ.xdfgetPurchaseId(); }
    protected ConditionValue xgetCValuePaymentAmount() { return _myCQ.xdfgetPaymentAmount(); }
    protected ConditionValue xgetCValuePaymentDatetime() { return _myCQ.xdfgetPaymentDatetime(); }
    protected ConditionValue xgetCValuePaymentMethodCode() { return _myCQ.xdfgetPaymentMethodCode(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(PurchasePaymentCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PurchasePaymentCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PurchasePaymentCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PurchasePaymentCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PurchasePaymentCB.class.getName(); }
    protected String xinCQ() { return PurchasePaymentCQ.class.getName(); }
}
