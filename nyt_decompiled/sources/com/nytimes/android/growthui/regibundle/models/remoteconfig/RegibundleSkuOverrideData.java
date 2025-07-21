package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RegibundleSkuOverrideData implements ya7 {
    private final long a;
    private final long b;
    private final String c;

    public RegibundleSkuOverrideData(long j, long j2, String str) {
        zq3.h(str, "sku");
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegibundleSkuOverrideData)) {
            return false;
        }
        RegibundleSkuOverrideData regibundleSkuOverrideData = (RegibundleSkuOverrideData) obj;
        return this.a == regibundleSkuOverrideData.a && this.b == regibundleSkuOverrideData.b && zq3.c(this.c, regibundleSkuOverrideData.c);
    }

    @Override // defpackage.ya7
    public long getEndTimeInterval() {
        return this.b;
    }

    @Override // defpackage.ya7
    public long getStartTimeInterval() {
        return this.a;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "RegibundleSkuOverrideData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", sku=" + this.c + ")";
    }

    public /* synthetic */ RegibundleSkuOverrideData(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str);
    }
}
