package com.nytimes.android.subauth.core.purr.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class TcfPreferenceData {
    private final CurrentTCFNoticeData currentNoticeData;
    private final UserTCFData userTCFData;

    public TcfPreferenceData(CurrentTCFNoticeData currentTCFNoticeData, UserTCFData userTCFData) {
        zq3.h(currentTCFNoticeData, "currentNoticeData");
        this.currentNoticeData = currentTCFNoticeData;
        this.userTCFData = userTCFData;
    }

    public static /* synthetic */ TcfPreferenceData copy$default(TcfPreferenceData tcfPreferenceData, CurrentTCFNoticeData currentTCFNoticeData, UserTCFData userTCFData, int i, Object obj) {
        if ((i & 1) != 0) {
            currentTCFNoticeData = tcfPreferenceData.currentNoticeData;
        }
        if ((i & 2) != 0) {
            userTCFData = tcfPreferenceData.userTCFData;
        }
        return tcfPreferenceData.copy(currentTCFNoticeData, userTCFData);
    }

    public final CurrentTCFNoticeData component1() {
        return this.currentNoticeData;
    }

    public final UserTCFData component2() {
        return this.userTCFData;
    }

    public final TcfPreferenceData copy(CurrentTCFNoticeData currentTCFNoticeData, UserTCFData userTCFData) {
        zq3.h(currentTCFNoticeData, "currentNoticeData");
        return new TcfPreferenceData(currentTCFNoticeData, userTCFData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TcfPreferenceData)) {
            return false;
        }
        TcfPreferenceData tcfPreferenceData = (TcfPreferenceData) obj;
        return zq3.c(this.currentNoticeData, tcfPreferenceData.currentNoticeData) && zq3.c(this.userTCFData, tcfPreferenceData.userTCFData);
    }

    public final CurrentTCFNoticeData getCurrentNoticeData() {
        return this.currentNoticeData;
    }

    public final UserTCFData getUserTCFData() {
        return this.userTCFData;
    }

    public int hashCode() {
        int hashCode = this.currentNoticeData.hashCode() * 31;
        UserTCFData userTCFData = this.userTCFData;
        return hashCode + (userTCFData == null ? 0 : userTCFData.hashCode());
    }

    public String toString() {
        return "TcfPreferenceData(currentNoticeData=" + this.currentNoticeData + ", userTCFData=" + this.userTCFData + ")";
    }
}
