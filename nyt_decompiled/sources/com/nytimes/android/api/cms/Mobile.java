package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Mobile {
    private final boolean embedded;

    @SerializedName("include_in_compatible_apps")
    private final boolean includeInCompatibleApps;
    private final String url;

    public Mobile(boolean z, boolean z2, String str) {
        this.embedded = z;
        this.includeInCompatibleApps = z2;
        this.url = str;
    }

    public static /* synthetic */ Mobile copy$default(Mobile mobile, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mobile.embedded;
        }
        if ((i & 2) != 0) {
            z2 = mobile.includeInCompatibleApps;
        }
        if ((i & 4) != 0) {
            str = mobile.url;
        }
        return mobile.copy(z, z2, str);
    }

    public final boolean component1() {
        return this.embedded;
    }

    public final boolean component2() {
        return this.includeInCompatibleApps;
    }

    public final String component3() {
        return this.url;
    }

    public final Mobile copy(boolean z, boolean z2, String str) {
        return new Mobile(z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mobile)) {
            return false;
        }
        Mobile mobile = (Mobile) obj;
        return this.embedded == mobile.embedded && this.includeInCompatibleApps == mobile.includeInCompatibleApps && zq3.c(this.url, mobile.url);
    }

    public final boolean getEmbedded() {
        return this.embedded;
    }

    public final boolean getIncludeInCompatibleApps() {
        return this.includeInCompatibleApps;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.embedded) * 31) + Boolean.hashCode(this.includeInCompatibleApps)) * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Mobile(embedded=" + this.embedded + ", includeInCompatibleApps=" + this.includeInCompatibleApps + ", url=" + this.url + ")";
    }

    public /* synthetic */ Mobile(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, str);
    }
}
