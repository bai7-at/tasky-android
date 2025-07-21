package com.nytimes.android.abra.models;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class AbraStoreKey {
    private final String bundleUrl;
    private final String integration;

    public AbraStoreKey(String str, String str2) {
        zq3.h(str, ParamProviderKt.PARAM_INTEGRATION);
        zq3.h(str2, "bundleUrl");
        this.integration = str;
        this.bundleUrl = str2;
    }

    public static /* synthetic */ AbraStoreKey copy$default(AbraStoreKey abraStoreKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abraStoreKey.integration;
        }
        if ((i & 2) != 0) {
            str2 = abraStoreKey.bundleUrl;
        }
        return abraStoreKey.copy(str, str2);
    }

    public final String component1() {
        return this.integration;
    }

    public final String component2() {
        return this.bundleUrl;
    }

    public final AbraStoreKey copy(String str, String str2) {
        zq3.h(str, ParamProviderKt.PARAM_INTEGRATION);
        zq3.h(str2, "bundleUrl");
        return new AbraStoreKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbraStoreKey)) {
            return false;
        }
        AbraStoreKey abraStoreKey = (AbraStoreKey) obj;
        return zq3.c(this.integration, abraStoreKey.integration) && zq3.c(this.bundleUrl, abraStoreKey.bundleUrl);
    }

    public final String getBundleUrl() {
        return this.bundleUrl;
    }

    public final String getIntegration() {
        return this.integration;
    }

    public int hashCode() {
        return (this.integration.hashCode() * 31) + this.bundleUrl.hashCode();
    }

    public String toString() {
        return "AbraStoreKey(integration=" + this.integration + ", bundleUrl=" + this.bundleUrl + ")";
    }
}
