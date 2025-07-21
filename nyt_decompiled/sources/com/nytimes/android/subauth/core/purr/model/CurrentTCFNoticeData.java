package com.nytimes.android.subauth.core.purr.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class CurrentTCFNoticeData {
    private final String acceptAllTCFString;
    private final String currentNoticeVersionHash;
    private final String rejectAllTCFString;

    public CurrentTCFNoticeData(String str, String str2, String str3) {
        zq3.h(str, "acceptAllTCFString");
        zq3.h(str2, "rejectAllTCFString");
        zq3.h(str3, "currentNoticeVersionHash");
        this.acceptAllTCFString = str;
        this.rejectAllTCFString = str2;
        this.currentNoticeVersionHash = str3;
    }

    public static /* synthetic */ CurrentTCFNoticeData copy$default(CurrentTCFNoticeData currentTCFNoticeData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentTCFNoticeData.acceptAllTCFString;
        }
        if ((i & 2) != 0) {
            str2 = currentTCFNoticeData.rejectAllTCFString;
        }
        if ((i & 4) != 0) {
            str3 = currentTCFNoticeData.currentNoticeVersionHash;
        }
        return currentTCFNoticeData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.acceptAllTCFString;
    }

    public final String component2() {
        return this.rejectAllTCFString;
    }

    public final String component3() {
        return this.currentNoticeVersionHash;
    }

    public final CurrentTCFNoticeData copy(String str, String str2, String str3) {
        zq3.h(str, "acceptAllTCFString");
        zq3.h(str2, "rejectAllTCFString");
        zq3.h(str3, "currentNoticeVersionHash");
        return new CurrentTCFNoticeData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentTCFNoticeData)) {
            return false;
        }
        CurrentTCFNoticeData currentTCFNoticeData = (CurrentTCFNoticeData) obj;
        return zq3.c(this.acceptAllTCFString, currentTCFNoticeData.acceptAllTCFString) && zq3.c(this.rejectAllTCFString, currentTCFNoticeData.rejectAllTCFString) && zq3.c(this.currentNoticeVersionHash, currentTCFNoticeData.currentNoticeVersionHash);
    }

    public final String getAcceptAllTCFString() {
        return this.acceptAllTCFString;
    }

    public final String getCurrentNoticeVersionHash() {
        return this.currentNoticeVersionHash;
    }

    public final String getRejectAllTCFString() {
        return this.rejectAllTCFString;
    }

    public int hashCode() {
        return (((this.acceptAllTCFString.hashCode() * 31) + this.rejectAllTCFString.hashCode()) * 31) + this.currentNoticeVersionHash.hashCode();
    }

    public String toString() {
        return "CurrentTCFNoticeData(acceptAllTCFString=" + this.acceptAllTCFString + ", rejectAllTCFString=" + this.rejectAllTCFString + ", currentNoticeVersionHash=" + this.currentNoticeVersionHash + ")";
    }
}
