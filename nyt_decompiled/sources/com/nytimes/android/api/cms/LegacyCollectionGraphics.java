package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class LegacyCollectionGraphics {

    @SerializedName("minimum_width")
    private final int minWidth;
    private final LegacyCollectionMobile mobile;

    public LegacyCollectionGraphics(LegacyCollectionMobile legacyCollectionMobile, int i) {
        this.mobile = legacyCollectionMobile;
        this.minWidth = i;
    }

    public static /* synthetic */ LegacyCollectionGraphics copy$default(LegacyCollectionGraphics legacyCollectionGraphics, LegacyCollectionMobile legacyCollectionMobile, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            legacyCollectionMobile = legacyCollectionGraphics.mobile;
        }
        if ((i2 & 2) != 0) {
            i = legacyCollectionGraphics.minWidth;
        }
        return legacyCollectionGraphics.copy(legacyCollectionMobile, i);
    }

    public final LegacyCollectionMobile component1() {
        return this.mobile;
    }

    public final int component2() {
        return this.minWidth;
    }

    public final LegacyCollectionGraphics copy(LegacyCollectionMobile legacyCollectionMobile, int i) {
        return new LegacyCollectionGraphics(legacyCollectionMobile, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyCollectionGraphics)) {
            return false;
        }
        LegacyCollectionGraphics legacyCollectionGraphics = (LegacyCollectionGraphics) obj;
        return zq3.c(this.mobile, legacyCollectionGraphics.mobile) && this.minWidth == legacyCollectionGraphics.minWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final LegacyCollectionMobile getMobile() {
        return this.mobile;
    }

    public int hashCode() {
        LegacyCollectionMobile legacyCollectionMobile = this.mobile;
        return ((legacyCollectionMobile == null ? 0 : legacyCollectionMobile.hashCode()) * 31) + Integer.hashCode(this.minWidth);
    }

    public String toString() {
        return "LegacyCollectionGraphics(mobile=" + this.mobile + ", minWidth=" + this.minWidth + ")";
    }

    public /* synthetic */ LegacyCollectionGraphics(LegacyCollectionMobile legacyCollectionMobile, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyCollectionMobile, (i2 & 2) != 0 ? 0 : i);
    }
}
