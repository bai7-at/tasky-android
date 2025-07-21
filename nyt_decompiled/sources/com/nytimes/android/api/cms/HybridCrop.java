package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class HybridCrop {
    private final int minViewportWidth;
    private final String target;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridCrop() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HybridCrop copy$default(HybridCrop hybridCrop, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hybridCrop.target;
        }
        if ((i2 & 2) != 0) {
            i = hybridCrop.minViewportWidth;
        }
        return hybridCrop.copy(str, i);
    }

    public final String component1() {
        return this.target;
    }

    public final int component2() {
        return this.minViewportWidth;
    }

    public final HybridCrop copy(String str, int i) {
        return new HybridCrop(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridCrop)) {
            return false;
        }
        HybridCrop hybridCrop = (HybridCrop) obj;
        return zq3.c(this.target, hybridCrop.target) && this.minViewportWidth == hybridCrop.minViewportWidth;
    }

    public final int getMinViewportWidth() {
        return this.minViewportWidth;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.target;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.minViewportWidth);
    }

    public String toString() {
        return "HybridCrop(target=" + this.target + ", minViewportWidth=" + this.minViewportWidth + ")";
    }

    public HybridCrop(String str, int i) {
        this.target = str;
        this.minViewportWidth = i;
    }

    public /* synthetic */ HybridCrop(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
