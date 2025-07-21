package com.nytimes.android.hybrid.model;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridImageCrop implements Comparable<HybridImageCrop> {
    private final int minViewportWidth;
    private final String target;

    public HybridImageCrop(String str, int i) {
        zq3.h(str, "target");
        this.target = str;
        this.minViewportWidth = i;
    }

    public static /* synthetic */ HybridImageCrop copy$default(HybridImageCrop hybridImageCrop, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hybridImageCrop.target;
        }
        if ((i2 & 2) != 0) {
            i = hybridImageCrop.minViewportWidth;
        }
        return hybridImageCrop.copy(str, i);
    }

    public final String component1() {
        return this.target;
    }

    public final int component2() {
        return this.minViewportWidth;
    }

    public final HybridImageCrop copy(String str, int i) {
        zq3.h(str, "target");
        return new HybridImageCrop(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridImageCrop)) {
            return false;
        }
        HybridImageCrop hybridImageCrop = (HybridImageCrop) obj;
        return zq3.c(this.target, hybridImageCrop.target) && this.minViewportWidth == hybridImageCrop.minViewportWidth;
    }

    public final int getMinViewportWidth() {
        return this.minViewportWidth;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (this.target.hashCode() * 31) + Integer.hashCode(this.minViewportWidth);
    }

    public String toString() {
        return "HybridImageCrop(target=" + this.target + ", minViewportWidth=" + this.minViewportWidth + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(HybridImageCrop hybridImageCrop) {
        zq3.h(hybridImageCrop, "other");
        return Integer.compare(this.minViewportWidth, hybridImageCrop.minViewportWidth);
    }

    public /* synthetic */ HybridImageCrop(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
