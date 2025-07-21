package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class DisplayedResults {
    private final String id;

    @SerializedName("last_displayed")
    private final String lastDisplayed;

    public DisplayedResults(String str, String str2) {
        this.id = str;
        this.lastDisplayed = str2;
    }

    public static /* synthetic */ DisplayedResults copy$default(DisplayedResults displayedResults, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayedResults.id;
        }
        if ((i & 2) != 0) {
            str2 = displayedResults.lastDisplayed;
        }
        return displayedResults.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.lastDisplayed;
    }

    public final DisplayedResults copy(String str, String str2) {
        return new DisplayedResults(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayedResults)) {
            return false;
        }
        DisplayedResults displayedResults = (DisplayedResults) obj;
        return zq3.c(this.id, displayedResults.id) && zq3.c(this.lastDisplayed, displayedResults.lastDisplayed);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastDisplayed() {
        return this.lastDisplayed;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastDisplayed;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DisplayedResults(id=" + this.id + ", lastDisplayed=" + this.lastDisplayed + ')';
    }
}
