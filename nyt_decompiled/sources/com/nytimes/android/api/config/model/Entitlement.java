package com.nytimes.android.api.config.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class Entitlement {
    private final String name;
    private final boolean subscribed;

    public Entitlement(String str, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.name = str;
        this.subscribed = z;
    }

    public static /* synthetic */ Entitlement copy$default(Entitlement entitlement, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entitlement.name;
        }
        if ((i & 2) != 0) {
            z = entitlement.subscribed;
        }
        return entitlement.copy(str, z);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.subscribed;
    }

    public final Entitlement copy(String str, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return new Entitlement(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entitlement)) {
            return false;
        }
        Entitlement entitlement = (Entitlement) obj;
        return zq3.c(this.name, entitlement.name) && this.subscribed == entitlement.subscribed;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.subscribed);
    }

    public String toString() {
        return "Entitlement(name=" + this.name + ", subscribed=" + this.subscribed + ")";
    }
}
