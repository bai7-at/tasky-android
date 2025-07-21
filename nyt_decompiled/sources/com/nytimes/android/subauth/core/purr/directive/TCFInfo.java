package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TCFInfo {
    private final Map<String, Object> decodedInfo;
    private final boolean isValidTCF;
    private final String latestNoticesHash;
    private final String tcfNoticesHash;
    private final String tcfString;

    public TCFInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TCFInfo copy$default(TCFInfo tCFInfo, String str, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tCFInfo.tcfString;
        }
        if ((i & 2) != 0) {
            map = tCFInfo.decodedInfo;
        }
        if ((i & 4) != 0) {
            str2 = tCFInfo.tcfNoticesHash;
        }
        if ((i & 8) != 0) {
            str3 = tCFInfo.latestNoticesHash;
        }
        return tCFInfo.copy(str, map, str2, str3);
    }

    public final String component1() {
        return this.tcfString;
    }

    public final Map<String, Object> component2() {
        return this.decodedInfo;
    }

    public final String component3() {
        return this.tcfNoticesHash;
    }

    public final String component4() {
        return this.latestNoticesHash;
    }

    public final TCFInfo copy(String str, Map<String, ? extends Object> map, String str2, String str3) {
        zq3.h(map, "decodedInfo");
        return new TCFInfo(str, map, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TCFInfo)) {
            return false;
        }
        TCFInfo tCFInfo = (TCFInfo) obj;
        return zq3.c(this.tcfString, tCFInfo.tcfString) && zq3.c(this.decodedInfo, tCFInfo.decodedInfo) && zq3.c(this.tcfNoticesHash, tCFInfo.tcfNoticesHash) && zq3.c(this.latestNoticesHash, tCFInfo.latestNoticesHash);
    }

    public final Map<String, Object> getDecodedInfo() {
        return this.decodedInfo;
    }

    public final String getLatestNoticesHash() {
        return this.latestNoticesHash;
    }

    public final String getTcfNoticesHash() {
        return this.tcfNoticesHash;
    }

    public final String getTcfString() {
        return this.tcfString;
    }

    public int hashCode() {
        String str = this.tcfString;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.decodedInfo.hashCode()) * 31;
        String str2 = this.tcfNoticesHash;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.latestNoticesHash;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isValidTCF() {
        return this.isValidTCF;
    }

    public String toString() {
        return "TCFInfo(tcfString=" + this.tcfString + ", decodedInfo=" + this.decodedInfo + ", tcfNoticesHash=" + this.tcfNoticesHash + ", latestNoticesHash=" + this.latestNoticesHash + ")";
    }

    public TCFInfo(String str, Map<String, ? extends Object> map, String str2, String str3) {
        zq3.h(map, "decodedInfo");
        this.tcfString = str;
        this.decodedInfo = map;
        this.tcfNoticesHash = str2;
        this.latestNoticesHash = str3;
        this.isValidTCF = (str == null || str2 == null || str3 == null || !zq3.c(str2, str3)) ? false : true;
    }

    public /* synthetic */ TCFInfo(String str, Map map, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? t.i() : map, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
