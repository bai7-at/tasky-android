package com.nytimes.android.subauth.core.purr.model;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class UserTCFData {
    private final Map<String, Object> tcfDecodedData;
    private final String tcfNoticeVersion;
    private final String tcfString;

    public UserTCFData(String str, String str2, Map<String, ? extends Object> map) {
        zq3.h(str, "tcfString");
        zq3.h(str2, "tcfNoticeVersion");
        zq3.h(map, "tcfDecodedData");
        this.tcfString = str;
        this.tcfNoticeVersion = str2;
        this.tcfDecodedData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserTCFData copy$default(UserTCFData userTCFData, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userTCFData.tcfString;
        }
        if ((i & 2) != 0) {
            str2 = userTCFData.tcfNoticeVersion;
        }
        if ((i & 4) != 0) {
            map = userTCFData.tcfDecodedData;
        }
        return userTCFData.copy(str, str2, map);
    }

    public final String component1() {
        return this.tcfString;
    }

    public final String component2() {
        return this.tcfNoticeVersion;
    }

    public final Map<String, Object> component3() {
        return this.tcfDecodedData;
    }

    public final UserTCFData copy(String str, String str2, Map<String, ? extends Object> map) {
        zq3.h(str, "tcfString");
        zq3.h(str2, "tcfNoticeVersion");
        zq3.h(map, "tcfDecodedData");
        return new UserTCFData(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTCFData)) {
            return false;
        }
        UserTCFData userTCFData = (UserTCFData) obj;
        return zq3.c(this.tcfString, userTCFData.tcfString) && zq3.c(this.tcfNoticeVersion, userTCFData.tcfNoticeVersion) && zq3.c(this.tcfDecodedData, userTCFData.tcfDecodedData);
    }

    public final Map<String, Object> getTcfDecodedData() {
        return this.tcfDecodedData;
    }

    public final String getTcfNoticeVersion() {
        return this.tcfNoticeVersion;
    }

    public final String getTcfString() {
        return this.tcfString;
    }

    public int hashCode() {
        return (((this.tcfString.hashCode() * 31) + this.tcfNoticeVersion.hashCode()) * 31) + this.tcfDecodedData.hashCode();
    }

    public String toString() {
        return "UserTCFData(tcfString=" + this.tcfString + ", tcfNoticeVersion=" + this.tcfNoticeVersion + ", tcfDecodedData=" + this.tcfDecodedData + ")";
    }
}
