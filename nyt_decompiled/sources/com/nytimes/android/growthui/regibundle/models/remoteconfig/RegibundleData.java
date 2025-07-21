package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RegibundleData {
    private final String a;
    private final RegistrationData b;
    private final SubscriptionData c;
    private final List d;
    private final List e;

    public RegibundleData(String str, RegistrationData registrationData, SubscriptionData subscriptionData, List list, List list2) {
        zq3.h(str, "loginText");
        zq3.h(registrationData, "registration");
        zq3.h(subscriptionData, "subscription");
        this.a = str;
        this.b = registrationData;
        this.c = subscriptionData;
        this.d = list;
        this.e = list2;
    }

    public final List a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final RegistrationData c() {
        return this.b;
    }

    public final SubscriptionData d() {
        return this.c;
    }

    public final List e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegibundleData)) {
            return false;
        }
        RegibundleData regibundleData = (RegibundleData) obj;
        return zq3.c(this.a, regibundleData.a) && zq3.c(this.b, regibundleData.b) && zq3.c(this.c, regibundleData.c) && zq3.c(this.d, regibundleData.d) && zq3.c(this.e, regibundleData.e);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "RegibundleData(loginText=" + this.a + ", registration=" + this.b + ", subscription=" + this.c + ", subscriptionUrgencyMessages=" + this.d + ", automatedSkuChanges=" + this.e + ")";
    }

    public /* synthetic */ RegibundleData(String str, RegistrationData registrationData, SubscriptionData subscriptionData, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new RegistrationData(null, null, null, 7, null) : registrationData, (i & 4) != 0 ? new SubscriptionData(null, null, null, 0, null, 31, null) : subscriptionData, (i & 8) != 0 ? i.l() : list, (i & 16) != 0 ? i.l() : list2);
    }
}
