package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class DismissedResults {
    private final String id;

    @SerializedName("last_dismissed")
    private final String lastDismissed;

    public DismissedResults(String str, String str2) {
        this.id = str;
        this.lastDismissed = str2;
    }

    public static /* synthetic */ DismissedResults copy$default(DismissedResults dismissedResults, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dismissedResults.id;
        }
        if ((i & 2) != 0) {
            str2 = dismissedResults.lastDismissed;
        }
        return dismissedResults.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.lastDismissed;
    }

    public final DismissedResults copy(String str, String str2) {
        return new DismissedResults(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissedResults)) {
            return false;
        }
        DismissedResults dismissedResults = (DismissedResults) obj;
        return zq3.c(this.id, dismissedResults.id) && zq3.c(this.lastDismissed, dismissedResults.lastDismissed);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastDismissed() {
        return this.lastDismissed;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastDismissed;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DismissedResults(id=" + this.id + ", lastDismissed=" + this.lastDismissed + ')';
    }
}
