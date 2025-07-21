package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class UrgencyMessageData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public UrgencyMessageData(long j, long j2, String str, String str2) {
        zq3.h(str, "headline");
        zq3.h(str2, "subHeadline");
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrgencyMessageData)) {
            return false;
        }
        UrgencyMessageData urgencyMessageData = (UrgencyMessageData) obj;
        return this.a == urgencyMessageData.a && this.b == urgencyMessageData.b && zq3.c(this.c, urgencyMessageData.c) && zq3.c(this.d, urgencyMessageData.d);
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
        return "UrgencyMessageData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", headline=" + this.c + ", subHeadline=" + this.d + ")";
    }

    public /* synthetic */ UrgencyMessageData(long j, long j2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
