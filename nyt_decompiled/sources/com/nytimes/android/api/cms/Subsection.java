package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Subsection {
    private final String content;

    @SerializedName("display_name")
    private final String displayName;

    public Subsection(String str, String str2) {
        this.displayName = str;
        this.content = str2;
    }

    public static /* synthetic */ Subsection copy$default(Subsection subsection, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subsection.displayName;
        }
        if ((i & 2) != 0) {
            str2 = subsection.content;
        }
        return subsection.copy(str, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.content;
    }

    public final Subsection copy(String str, String str2) {
        return new Subsection(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subsection)) {
            return false;
        }
        Subsection subsection = (Subsection) obj;
        return zq3.c(this.displayName, subsection.displayName) && zq3.c(this.content, subsection.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Subsection(displayName=" + this.displayName + ", content=" + this.content + ")";
    }
}
