package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Interactivegraphics {

    @SerializedName("minimum_width")
    private final int minWidth;
    private final Mobile mobile;

    public Interactivegraphics(Mobile mobile, int i) {
        this.mobile = mobile;
        this.minWidth = i;
    }

    public static /* synthetic */ Interactivegraphics copy$default(Interactivegraphics interactivegraphics, Mobile mobile, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mobile = interactivegraphics.mobile;
        }
        if ((i2 & 2) != 0) {
            i = interactivegraphics.minWidth;
        }
        return interactivegraphics.copy(mobile, i);
    }

    public final Mobile component1() {
        return this.mobile;
    }

    public final int component2() {
        return this.minWidth;
    }

    public final Interactivegraphics copy(Mobile mobile, int i) {
        return new Interactivegraphics(mobile, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Interactivegraphics)) {
            return false;
        }
        Interactivegraphics interactivegraphics = (Interactivegraphics) obj;
        return zq3.c(this.mobile, interactivegraphics.mobile) && this.minWidth == interactivegraphics.minWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final Mobile getMobile() {
        return this.mobile;
    }

    public int hashCode() {
        Mobile mobile = this.mobile;
        return ((mobile == null ? 0 : mobile.hashCode()) * 31) + Integer.hashCode(this.minWidth);
    }

    public String toString() {
        return "Interactivegraphics(mobile=" + this.mobile + ", minWidth=" + this.minWidth + ")";
    }

    public /* synthetic */ Interactivegraphics(Mobile mobile, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobile, (i2 & 2) != 0 ? 0 : i);
    }
}
