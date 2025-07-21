package com.nytimes.android.hybrid.model;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridSubResource {
    private final boolean isRequired;
    private final String target;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridSubResource() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HybridSubResource copy$default(HybridSubResource hybridSubResource, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hybridSubResource.target;
        }
        if ((i & 2) != 0) {
            z = hybridSubResource.isRequired;
        }
        return hybridSubResource.copy(str, z);
    }

    public final String component1() {
        return this.target;
    }

    public final boolean component2() {
        return this.isRequired;
    }

    public final HybridSubResource copy(String str, boolean z) {
        return new HybridSubResource(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridSubResource)) {
            return false;
        }
        HybridSubResource hybridSubResource = (HybridSubResource) obj;
        return zq3.c(this.target, hybridSubResource.target) && this.isRequired == hybridSubResource.isRequired;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.target;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        return "HybridSubResource(target=" + this.target + ", isRequired=" + this.isRequired + ")";
    }

    public HybridSubResource(String str, boolean z) {
        this.target = str;
        this.isRequired = z;
    }

    public /* synthetic */ HybridSubResource(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z);
    }
}
