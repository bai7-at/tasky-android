package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class LegacyCollectionMobile {
    private final boolean embedded;

    @SerializedName("include_in_compatible_apps")
    private final boolean includeInCompatibleApps;
    private final String url;

    public LegacyCollectionMobile(boolean z, boolean z2, String str) {
        this.embedded = z;
        this.includeInCompatibleApps = z2;
        this.url = str;
    }

    public static /* synthetic */ LegacyCollectionMobile copy$default(LegacyCollectionMobile legacyCollectionMobile, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = legacyCollectionMobile.embedded;
        }
        if ((i & 2) != 0) {
            z2 = legacyCollectionMobile.includeInCompatibleApps;
        }
        if ((i & 4) != 0) {
            str = legacyCollectionMobile.url;
        }
        return legacyCollectionMobile.copy(z, z2, str);
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

    public final LegacyCollectionMobile copy(boolean z, boolean z2, String str) {
        return new LegacyCollectionMobile(z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyCollectionMobile)) {
            return false;
        }
        LegacyCollectionMobile legacyCollectionMobile = (LegacyCollectionMobile) obj;
        return this.embedded == legacyCollectionMobile.embedded && this.includeInCompatibleApps == legacyCollectionMobile.includeInCompatibleApps && zq3.c(this.url, legacyCollectionMobile.url);
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
        return "LegacyCollectionMobile(embedded=" + this.embedded + ", includeInCompatibleApps=" + this.includeInCompatibleApps + ", url=" + this.url + ")";
    }

    public /* synthetic */ LegacyCollectionMobile(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, str);
    }
}
