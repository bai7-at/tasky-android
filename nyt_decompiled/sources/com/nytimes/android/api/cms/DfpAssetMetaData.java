package com.nytimes.android.api.cms;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.et3;
import defpackage.zq3;
import java.util.AbstractMap;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class DfpAssetMetaData {
    private String col;
    private String des;
    private String geo;
    private String id;

    /* renamed from: org, reason: collision with root package name */
    private String f55org;
    private String per;
    private String ser;
    private String spon;
    private String ttl;
    private String typ;

    public DfpAssetMetaData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final String component1() {
        return this.des;
    }

    public final String component10() {
        return this.ser;
    }

    public final String component2() {
        return this.f55org;
    }

    public final String component3() {
        return this.ttl;
    }

    public final String component4() {
        return this.per;
    }

    public final String component5() {
        return this.id;
    }

    public final String component6() {
        return this.typ;
    }

    public final String component7() {
        return this.spon;
    }

    public final String component8() {
        return this.geo;
    }

    public final String component9() {
        return this.col;
    }

    public final DfpAssetMetaData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new DfpAssetMetaData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DfpAssetMetaData)) {
            return false;
        }
        DfpAssetMetaData dfpAssetMetaData = (DfpAssetMetaData) obj;
        return zq3.c(this.des, dfpAssetMetaData.des) && zq3.c(this.f55org, dfpAssetMetaData.f55org) && zq3.c(this.ttl, dfpAssetMetaData.ttl) && zq3.c(this.per, dfpAssetMetaData.per) && zq3.c(this.id, dfpAssetMetaData.id) && zq3.c(this.typ, dfpAssetMetaData.typ) && zq3.c(this.spon, dfpAssetMetaData.spon) && zq3.c(this.geo, dfpAssetMetaData.geo) && zq3.c(this.col, dfpAssetMetaData.col) && zq3.c(this.ser, dfpAssetMetaData.ser);
    }

    public final String getCol() {
        return this.col;
    }

    public final String getDes() {
        return this.des;
    }

    public final String getGeo() {
        return this.geo;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOrg() {
        return this.f55org;
    }

    public final String getPer() {
        return this.per;
    }

    public final String getSer() {
        return this.ser;
    }

    public final String getSpon() {
        return this.spon;
    }

    public final String getTtl() {
        return this.ttl;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        String str = this.des;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f55org;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ttl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.per;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.typ;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.spon;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.geo;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.col;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ser;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final ArrayList<AbstractMap.SimpleEntry<String, String>> paramList() {
        ArrayList<AbstractMap.SimpleEntry<String, String>> arrayList = new ArrayList<>();
        String str = this.des;
        if (str != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("des", str));
        }
        String str2 = this.f55org;
        if (str2 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("org", str2));
        }
        String str3 = this.per;
        if (str3 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("per", str3));
        }
        String str4 = this.id;
        if (str4 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("id", str4));
        }
        String str5 = this.typ;
        if (str5 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("typ", str5));
        }
        String str6 = this.ttl;
        if (str6 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("ttl", str6));
        }
        String str7 = this.spon;
        if (str7 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("spon", str7));
        }
        String str8 = this.geo;
        if (str8 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("geo", str8));
        }
        String str9 = this.col;
        if (str9 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("col", str9));
        }
        String str10 = this.ser;
        if (str10 != null) {
            arrayList.add(new AbstractMap.SimpleEntry<>("ser", str10));
        }
        return arrayList;
    }

    public final void setCol(String str) {
        this.col = str;
    }

    public final void setDes(String str) {
        this.des = str;
    }

    public final void setGeo(String str) {
        this.geo = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setOrg(String str) {
        this.f55org = str;
    }

    public final void setPer(String str) {
        this.per = str;
    }

    public final void setSer(String str) {
        this.ser = str;
    }

    public final void setSpon(String str) {
        this.spon = str;
    }

    public final void setTtl(String str) {
        this.ttl = str;
    }

    public final void setTyp(String str) {
        this.typ = str;
    }

    public String toString() {
        return "DfpAssetMetaData(des=" + this.des + ", org=" + this.f55org + ", ttl=" + this.ttl + ", per=" + this.per + ", id=" + this.id + ", typ=" + this.typ + ", spon=" + this.spon + ", geo=" + this.geo + ", col=" + this.col + ", ser=" + this.ser + ")";
    }

    public DfpAssetMetaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.des = str;
        this.f55org = str2;
        this.ttl = str3;
        this.per = str4;
        this.id = str5;
        this.typ = str6;
        this.spon = str7;
        this.geo = str8;
        this.col = str9;
        this.ser = str10;
    }

    public /* synthetic */ DfpAssetMetaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
