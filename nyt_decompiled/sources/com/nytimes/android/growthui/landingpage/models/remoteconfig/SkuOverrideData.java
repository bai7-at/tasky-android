package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class SkuOverrideData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public SkuOverrideData(long j, long j2, String str, String str2, String str3, String str4) {
        zq3.h(str, "monthlyAdaIdentifier");
        zq3.h(str2, "yearlyAdaIdentifier");
        zq3.h(str3, "monthlyGamesIdentifier");
        zq3.h(str4, "yearlyGamesIdentifier");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuOverrideData)) {
            return false;
        }
        SkuOverrideData skuOverrideData = (SkuOverrideData) obj;
        return this.a == skuOverrideData.a && this.b == skuOverrideData.b && zq3.c(this.c, skuOverrideData.c) && zq3.c(this.d, skuOverrideData.d) && zq3.c(this.e, skuOverrideData.e) && zq3.c(this.f, skuOverrideData.f);
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
        return (((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SkuOverrideData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", monthlyAdaIdentifier=" + this.c + ", yearlyAdaIdentifier=" + this.d + ", monthlyGamesIdentifier=" + this.e + ", yearlyGamesIdentifier=" + this.f + ")";
    }

    public /* synthetic */ SkuOverrideData(long j, long j2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}
