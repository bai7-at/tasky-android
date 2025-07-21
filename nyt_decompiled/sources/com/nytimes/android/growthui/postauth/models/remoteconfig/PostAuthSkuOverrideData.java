package com.nytimes.android.growthui.postauth.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PostAuthSkuOverrideData implements ya7 {
    private final long a;
    private final long b;
    private final String c;

    public PostAuthSkuOverrideData(long j, long j2, String str) {
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
        if (!(obj instanceof PostAuthSkuOverrideData)) {
            return false;
        }
        PostAuthSkuOverrideData postAuthSkuOverrideData = (PostAuthSkuOverrideData) obj;
        return this.a == postAuthSkuOverrideData.a && this.b == postAuthSkuOverrideData.b && zq3.c(this.c, postAuthSkuOverrideData.c);
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
        return "PostAuthSkuOverrideData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", sku=" + this.c + ")";
    }

    public /* synthetic */ PostAuthSkuOverrideData(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str);
    }
}
