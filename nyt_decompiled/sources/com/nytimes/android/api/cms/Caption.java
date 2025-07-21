package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Caption {
    private final String full;

    @SerializedName("hide_caption_hp")
    private final boolean shouldHideCaption;

    /* JADX WARN: Multi-variable type inference failed */
    public Caption() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Caption copy$default(Caption caption, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = caption.full;
        }
        if ((i & 2) != 0) {
            z = caption.shouldHideCaption;
        }
        return caption.copy(str, z);
    }

    public final String component1() {
        return this.full;
    }

    public final boolean component2() {
        return this.shouldHideCaption;
    }

    public final Caption copy(String str, boolean z) {
        return new Caption(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Caption)) {
            return false;
        }
        Caption caption = (Caption) obj;
        return zq3.c(this.full, caption.full) && this.shouldHideCaption == caption.shouldHideCaption;
    }

    public final String getFull() {
        return this.full;
    }

    public final boolean getShouldHideCaption() {
        return this.shouldHideCaption;
    }

    public int hashCode() {
        String str = this.full;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.shouldHideCaption);
    }

    public String toString() {
        return "Caption(full=" + this.full + ", shouldHideCaption=" + this.shouldHideCaption + ")";
    }

    public Caption(String str, boolean z) {
        this.full = str;
        this.shouldHideCaption = z;
    }

    public /* synthetic */ Caption(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
