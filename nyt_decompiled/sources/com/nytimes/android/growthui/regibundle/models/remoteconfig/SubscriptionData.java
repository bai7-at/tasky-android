package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class SubscriptionData {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;

    public SubscriptionData(String str, String str2, String str3, int i, String str4) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        zq3.h(str4, "sku");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionData)) {
            return false;
        }
        SubscriptionData subscriptionData = (SubscriptionData) obj;
        return zq3.c(this.a, subscriptionData.a) && zq3.c(this.b, subscriptionData.b) && zq3.c(this.c, subscriptionData.c) && this.d == subscriptionData.d && zq3.c(this.e, subscriptionData.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "SubscriptionData(header=" + this.a + ", text=" + this.b + ", buttonText=" + this.c + ", hoursBetweenRecurrence=" + this.d + ", sku=" + this.e + ")";
    }

    public /* synthetic */ SubscriptionData(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4);
    }
}
