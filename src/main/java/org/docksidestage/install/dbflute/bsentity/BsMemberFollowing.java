package org.docksidestage.install.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.install.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.install.dbflute.exentity.*;

/**
 * The entity of member_following as TABLE. <br>
 * 会員フォローイング : とある会員が他の会員をフォローできる。すると、フォローした会員の購入履歴が閲覧できる。
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     member
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberFollowingId = entity.getMemberFollowingId();
 * Integer myMemberId = entity.getMyMemberId();
 * Integer yourMemberId = entity.getYourMemberId();
 * java.time.LocalDateTime followDatetime = entity.getFollowDatetime();
 * entity.setMemberFollowingId(memberFollowingId);
 * entity.setMyMemberId(myMemberId);
 * entity.setYourMemberId(yourMemberId);
 * entity.setFollowDatetime(followDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberFollowing extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberFollowingId;

    /** MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} */
    protected Integer _myMemberId;

    /** YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member} */
    protected Integer _yourMemberId;

    /** FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _followDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_following";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberFollowingId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param myMemberId : UQ+, NotNull, INT(10), FK to member. (NotNull)
     * @param yourMemberId : +UQ, IX, NotNull, INT(10), FK to member. (NotNull)
     */
    public void uniqueBy(Integer myMemberId, Integer yourMemberId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("myMemberId");
        __uniqueDrivenProperties.addPropertyName("yourMemberId");
        setMyMemberId(myMemberId);setYourMemberId(yourMemberId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** member by my MY_MEMBER_ID, named 'memberByMyMemberId'. */
    protected OptionalEntity<Member> _memberByMyMemberId;

    /**
     * [get] member by my MY_MEMBER_ID, named 'memberByMyMemberId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberByMyMemberId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMemberByMyMemberId() {
        if (_memberByMyMemberId == null) { _memberByMyMemberId = OptionalEntity.relationEmpty(this, "memberByMyMemberId"); }
        return _memberByMyMemberId;
    }

    /**
     * [set] member by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param memberByMyMemberId The entity of foreign property 'memberByMyMemberId'. (NullAllowed)
     */
    public void setMemberByMyMemberId(OptionalEntity<Member> memberByMyMemberId) {
        _memberByMyMemberId = memberByMyMemberId;
    }

    /** member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'. */
    protected OptionalEntity<Member> _memberByYourMemberId;

    /**
     * [get] member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberByYourMemberId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMemberByYourMemberId() {
        if (_memberByYourMemberId == null) { _memberByYourMemberId = OptionalEntity.relationEmpty(this, "memberByYourMemberId"); }
        return _memberByYourMemberId;
    }

    /**
     * [set] member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param memberByYourMemberId The entity of foreign property 'memberByYourMemberId'. (NullAllowed)
     */
    public void setMemberByYourMemberId(OptionalEntity<Member> memberByYourMemberId) {
        _memberByYourMemberId = memberByYourMemberId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberFollowing) {
            BsMemberFollowing other = (BsMemberFollowing)obj;
            if (!xSV(_memberFollowingId, other._memberFollowingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberFollowingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberByMyMemberId != null && _memberByMyMemberId.isPresent())
        { sb.append(li).append(xbRDS(_memberByMyMemberId, "memberByMyMemberId")); }
        if (_memberByYourMemberId != null && _memberByYourMemberId.isPresent())
        { sb.append(li).append(xbRDS(_memberByYourMemberId, "memberByYourMemberId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberFollowingId));
        sb.append(dm).append(xfND(_myMemberId));
        sb.append(dm).append(xfND(_yourMemberId));
        sb.append(dm).append(xfND(_followDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberByMyMemberId != null && _memberByMyMemberId.isPresent())
        { sb.append(dm).append("memberByMyMemberId"); }
        if (_memberByYourMemberId != null && _memberByYourMemberId.isPresent())
        { sb.append(dm).append("memberByYourMemberId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberFollowing clone() {
        return (MemberFollowing)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 会員フォローイングID : 連番
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberFollowingId() {
        checkSpecifiedProperty("memberFollowingId");
        return _memberFollowingId;
    }

    /**
     * [set] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 会員フォローイングID : 連番
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberFollowingId(Long memberFollowingId) {
        registerModifiedProperty("memberFollowingId");
        _memberFollowingId = memberFollowingId;
    }

    /**
     * [get] MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br>
     * わたし : 気になった人がいて...勇気を振り絞った会員のID。
     * @return The value of the column 'MY_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyMemberId() {
        checkSpecifiedProperty("myMemberId");
        return _myMemberId;
    }

    /**
     * [set] MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member} <br>
     * わたし : 気になった人がいて...勇気を振り絞った会員のID。
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyMemberId(Integer myMemberId) {
        registerModifiedProperty("myMemberId");
        _myMemberId = myMemberId;
    }

    /**
     * [get] YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member} <br>
     * あなた : いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @return The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getYourMemberId() {
        checkSpecifiedProperty("yourMemberId");
        return _yourMemberId;
    }

    /**
     * [set] YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member} <br>
     * あなた : いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setYourMemberId(Integer yourMemberId) {
        registerModifiedProperty("yourMemberId");
        _yourMemberId = yourMemberId;
    }

    /**
     * [get] FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * その瞬間 : ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @return The value of the column 'FOLLOW_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getFollowDatetime() {
        checkSpecifiedProperty("followDatetime");
        return _followDatetime;
    }

    /**
     * [set] FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)} <br>
     * その瞬間 : ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setFollowDatetime(java.time.LocalDateTime followDatetime) {
        registerModifiedProperty("followDatetime");
        _followDatetime = followDatetime;
    }
}
