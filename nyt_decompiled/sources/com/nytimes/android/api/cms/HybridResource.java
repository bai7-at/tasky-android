package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class HybridResource {
    private final String target;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridResource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HybridResource copy$default(HybridResource hybridResource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hybridResource.target;
        }
        return hybridResource.copy(str);
    }

    public final String component1() {
        return this.target;
    }

    public final HybridResource copy(String str) {
        return new HybridResource(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HybridResource) && zq3.c(this.target, ((HybridResource) obj).target);
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.target;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean isRequired() {
        return true;
    }

    public String toString() {
        return "HybridResource(target=" + this.target + ")";
    }

    public HybridResource(String str) {
        this.target = str;
    }

    public /* synthetic */ HybridResource(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
