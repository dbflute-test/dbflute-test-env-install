package org.docksidestage.install.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.install.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.install.dbflute.exentity.*;

/**
 * The entity of product_status as TABLE. <br>
 * 商品ステータス : 商品のステータスを表現する固定的なマスタ。
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     product
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected String _productStatusName;

    /** DISPLAY_ORDER: {UQ, NotNull, INT(10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "product_status";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productStatusCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueBy(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** product by PRODUCT_STATUS_CODE, named 'productList'. */
    protected List<Product> _productList;

    /**
     * [get] product by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * [set] product by PRODUCT_STATUS_CODE, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProductStatus) {
            BsProductStatus other = (BsProductStatus)obj;
            if (!xSV(_productStatusCode, other._productStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_productList != null) { for (Product et : _productList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "productList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_productStatusName));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productList != null && !_productList.isEmpty())
        { sb.append(dm).append("productList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ProductStatus clone() {
        return (ProductStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br>
     * 商品ステータスコード : 商品ステータスを識別するコード。
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br>
     * 商品ステータスコード : 商品ステータスを識別するコード。
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 商品ステータス名称 : 表示用の名称、英語名カラムがないのでそのままメソッド名の一部としても利用される。
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusName() {
        checkSpecifiedProperty("productStatusName");
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 商品ステータス名称 : 表示用の名称、英語名カラムがないのでそのままメソッド名の一部としても利用される。
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusName(String productStatusName) {
        registerModifiedProperty("productStatusName");
        _productStatusName = productStatusName;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, INT(10)} <br>
     * 表示順 : もう、ご想像の通りです。
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, INT(10)} <br>
     * 表示順 : もう、ご想像の通りです。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }
}
