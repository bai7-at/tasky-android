package com.nytimes.android.subauth.core.purr.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class QueryPrivacyDirectivesResult {
    private final PrivacyDirectives privacyDirectives;
    private final TcfPreferenceData tcfPreferenceData;

    public QueryPrivacyDirectivesResult(PrivacyDirectives privacyDirectives, TcfPreferenceData tcfPreferenceData) {
        zq3.h(privacyDirectives, "privacyDirectives");
        zq3.h(tcfPreferenceData, "tcfPreferenceData");
        this.privacyDirectives = privacyDirectives;
        this.tcfPreferenceData = tcfPreferenceData;
    }

    public static /* synthetic */ QueryPrivacyDirectivesResult copy$default(QueryPrivacyDirectivesResult queryPrivacyDirectivesResult, PrivacyDirectives privacyDirectives, TcfPreferenceData tcfPreferenceData, int i, Object obj) {
        if ((i & 1) != 0) {
            privacyDirectives = queryPrivacyDirectivesResult.privacyDirectives;
        }
        if ((i & 2) != 0) {
            tcfPreferenceData = queryPrivacyDirectivesResult.tcfPreferenceData;
        }
        return queryPrivacyDirectivesResult.copy(privacyDirectives, tcfPreferenceData);
    }

    public final PrivacyDirectives component1() {
        return this.privacyDirectives;
    }

    public final TcfPreferenceData component2() {
        return this.tcfPreferenceData;
    }

    public final QueryPrivacyDirectivesResult copy(PrivacyDirectives privacyDirectives, TcfPreferenceData tcfPreferenceData) {
        zq3.h(privacyDirectives, "privacyDirectives");
        zq3.h(tcfPreferenceData, "tcfPreferenceData");
        return new QueryPrivacyDirectivesResult(privacyDirectives, tcfPreferenceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPrivacyDirectivesResult)) {
            return false;
        }
        QueryPrivacyDirectivesResult queryPrivacyDirectivesResult = (QueryPrivacyDirectivesResult) obj;
        return zq3.c(this.privacyDirectives, queryPrivacyDirectivesResult.privacyDirectives) && zq3.c(this.tcfPreferenceData, queryPrivacyDirectivesResult.tcfPreferenceData);
    }

    public final PrivacyDirectives getPrivacyDirectives() {
        return this.privacyDirectives;
    }

    public final TcfPreferenceData getTcfPreferenceData() {
        return this.tcfPreferenceData;
    }

    public int hashCode() {
        return (this.privacyDirectives.hashCode() * 31) + this.tcfPreferenceData.hashCode();
    }

    public String toString() {
        return "QueryPrivacyDirectivesResult(privacyDirectives=" + this.privacyDirectives + ", tcfPreferenceData=" + this.tcfPreferenceData + ")";
    }
}
