package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.bt3;
import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AllAccessSkuOverrideData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public AllAccessSkuOverrideData(@bt3(name = "start_time_interval") long j, @bt3(name = "end_time_interval") long j2, @bt3(name = "monthly_sku") String str, @bt3(name = "yearly_sku") String str2) {
        zq3.h(str, "monthlySku");
        zq3.h(str2, "yearlySku");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final AllAccessSkuOverrideData copy(@bt3(name = "start_time_interval") long j, @bt3(name = "end_time_interval") long j2, @bt3(name = "monthly_sku") String str, @bt3(name = "yearly_sku") String str2) {
        zq3.h(str, "monthlySku");
        zq3.h(str2, "yearlySku");
        return new AllAccessSkuOverrideData(j, j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAccessSkuOverrideData)) {
            return false;
        }
        AllAccessSkuOverrideData allAccessSkuOverrideData = (AllAccessSkuOverrideData) obj;
        return this.a == allAccessSkuOverrideData.a && this.b == allAccessSkuOverrideData.b && zq3.c(this.c, allAccessSkuOverrideData.c) && zq3.c(this.d, allAccessSkuOverrideData.d);
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
        return (((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AllAccessSkuOverrideData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", monthlySku=" + this.c + ", yearlySku=" + this.d + ")";
    }

    public /* synthetic */ AllAccessSkuOverrideData(long j, long j2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
