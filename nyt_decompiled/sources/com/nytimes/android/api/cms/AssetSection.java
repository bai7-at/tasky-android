package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class AssetSection {

    @SerializedName("nyt_branded")
    private boolean branded;
    private String content;

    @SerializedName("display_name")
    private String displayName;

    public AssetSection(String str, String str2, boolean z) {
        this.displayName = str;
        this.content = str2;
        this.branded = z;
    }

    public static /* synthetic */ AssetSection copy$default(AssetSection assetSection, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetSection.displayName;
        }
        if ((i & 2) != 0) {
            str2 = assetSection.content;
        }
        if ((i & 4) != 0) {
            z = assetSection.branded;
        }
        return assetSection.copy(str, str2, z);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.branded;
    }

    public final AssetSection copy(String str, String str2, boolean z) {
        return new AssetSection(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSection)) {
            return false;
        }
        AssetSection assetSection = (AssetSection) obj;
        return zq3.c(this.displayName, assetSection.displayName) && zq3.c(this.content, assetSection.content) && this.branded == assetSection.branded;
    }

    public final boolean getBranded() {
        return this.branded;
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
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.branded);
    }

    public final void setBranded(boolean z) {
        this.branded = z;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public String toString() {
        return "AssetSection(displayName=" + this.displayName + ", content=" + this.content + ", branded=" + this.branded + ")";
    }

    public /* synthetic */ AssetSection(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
