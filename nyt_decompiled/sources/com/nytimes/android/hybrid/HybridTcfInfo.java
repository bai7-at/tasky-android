package com.nytimes.android.hybrid;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridTcfInfo {
    private final String a;
    private final boolean b;

    public HybridTcfInfo(@bt3(name = "fides_string") String str, @bt3(name = "fides_disable_banner") boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final HybridTcfInfo copy(@bt3(name = "fides_string") String str, @bt3(name = "fides_disable_banner") boolean z) {
        return new HybridTcfInfo(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridTcfInfo)) {
            return false;
        }
        HybridTcfInfo hybridTcfInfo = (HybridTcfInfo) obj;
        return zq3.c(this.a, hybridTcfInfo.a) && this.b == hybridTcfInfo.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "HybridTcfInfo(tcString=" + this.a + ", shouldFidesDisableBanner=" + this.b + ")";
    }

    public /* synthetic */ HybridTcfInfo(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
