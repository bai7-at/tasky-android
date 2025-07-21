package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RegibundleUrgencyMessageData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;

    public RegibundleUrgencyMessageData(long j, long j2, String str, String str2, String str3) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegibundleUrgencyMessageData)) {
            return false;
        }
        RegibundleUrgencyMessageData regibundleUrgencyMessageData = (RegibundleUrgencyMessageData) obj;
        return this.a == regibundleUrgencyMessageData.a && this.b == regibundleUrgencyMessageData.b && zq3.c(this.c, regibundleUrgencyMessageData.c) && zq3.c(this.d, regibundleUrgencyMessageData.d) && zq3.c(this.e, regibundleUrgencyMessageData.e);
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
        return (((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "RegibundleUrgencyMessageData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", header=" + this.c + ", text=" + this.d + ", buttonText=" + this.e + ")";
    }

    public /* synthetic */ RegibundleUrgencyMessageData(long j, long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
