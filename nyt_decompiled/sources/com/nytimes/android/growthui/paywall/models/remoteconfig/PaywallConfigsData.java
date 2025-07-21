package com.nytimes.android.growthui.paywall.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PaywallConfigsData {
    private final PaywallData a;
    private final Map b;

    public PaywallConfigsData(PaywallData paywallData, Map map) {
        zq3.h(paywallData, "config");
        this.a = paywallData;
        this.b = map;
    }

    public final PaywallData a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallConfigsData)) {
            return false;
        }
        PaywallConfigsData paywallConfigsData = (PaywallConfigsData) obj;
        return zq3.c(this.a, paywallConfigsData.a) && zq3.c(this.b, paywallConfigsData.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "PaywallConfigsData(config=" + this.a + ", variants=" + this.b + ")";
    }

    public /* synthetic */ PaywallConfigsData(PaywallData paywallData, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PaywallData(null, null, null, null, null, 31, null) : paywallData, (i & 2) != 0 ? null : map);
    }
}
