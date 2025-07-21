package com.nytimes.android.growthui.paywall.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PaywallData {
    private final String a;
    private final List b;
    private final String c;
    private final String d;
    private final List e;

    public PaywallData(String str, List list, String str2, String str3, List list2) {
        zq3.h(str, "topperText");
        zq3.h(str2, "header");
        zq3.h(str3, "buttonText");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = list2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return zq3.c(this.a, paywallData.a) && zq3.c(this.b, paywallData.b) && zq3.c(this.c, paywallData.c) && zq3.c(this.d, paywallData.d) && zq3.c(this.e, paywallData.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        List list2 = this.e;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "PaywallData(topperText=" + this.a + ", icons=" + this.b + ", header=" + this.c + ", buttonText=" + this.d + ", paywallUrgencyMessages=" + this.e + ")";
    }

    public /* synthetic */ PaywallData(String str, List list, String str2, String str3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? i.l() : list2);
    }
}
