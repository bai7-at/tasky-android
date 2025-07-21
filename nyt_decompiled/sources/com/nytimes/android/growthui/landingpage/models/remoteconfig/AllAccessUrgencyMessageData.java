package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.bt3;
import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AllAccessUrgencyMessageData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public AllAccessUrgencyMessageData(@bt3(name = "start_time_interval") long j, @bt3(name = "end_time_interval") long j2, @bt3(name = "text") String str, @bt3(name = "sub_headline_text") String str2) {
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

    public final AllAccessUrgencyMessageData copy(@bt3(name = "start_time_interval") long j, @bt3(name = "end_time_interval") long j2, @bt3(name = "text") String str, @bt3(name = "sub_headline_text") String str2) {
        zq3.h(str, "headline");
        zq3.h(str2, "subHeadline");
        return new AllAccessUrgencyMessageData(j, j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAccessUrgencyMessageData)) {
            return false;
        }
        AllAccessUrgencyMessageData allAccessUrgencyMessageData = (AllAccessUrgencyMessageData) obj;
        return this.a == allAccessUrgencyMessageData.a && this.b == allAccessUrgencyMessageData.b && zq3.c(this.c, allAccessUrgencyMessageData.c) && zq3.c(this.d, allAccessUrgencyMessageData.d);
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
        return "AllAccessUrgencyMessageData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", headline=" + this.c + ", subHeadline=" + this.d + ")";
    }

    public /* synthetic */ AllAccessUrgencyMessageData(long j, long j2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
