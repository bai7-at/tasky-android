package com.nytimes.android.growthui.paywall.models.remoteconfig;

import defpackage.et3;
import defpackage.ya7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PaywallUrgencyMessageData implements ya7 {
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;

    public PaywallUrgencyMessageData(long j, long j2, String str, String str2, String str3) {
        zq3.h(str2, "header");
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
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallUrgencyMessageData)) {
            return false;
        }
        PaywallUrgencyMessageData paywallUrgencyMessageData = (PaywallUrgencyMessageData) obj;
        return this.a == paywallUrgencyMessageData.a && this.b == paywallUrgencyMessageData.b && zq3.c(this.c, paywallUrgencyMessageData.c) && zq3.c(this.d, paywallUrgencyMessageData.d) && zq3.c(this.e, paywallUrgencyMessageData.e);
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
        int hashCode = ((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        String str = this.c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PaywallUrgencyMessageData(startTimeInterval=" + this.a + ", endTimeInterval=" + this.b + ", topperText=" + this.c + ", header=" + this.d + ", buttonText=" + this.e + ")";
    }

    public /* synthetic */ PaywallUrgencyMessageData(long j, long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
