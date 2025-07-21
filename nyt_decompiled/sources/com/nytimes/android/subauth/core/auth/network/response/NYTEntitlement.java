package com.nytimes.android.subauth.core.auth.network.response;

import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NYTEntitlement {
    private final String a;

    public NYTEntitlement(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NYTEntitlement) && zq3.c(this.a, ((NYTEntitlement) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "NYTEntitlement(name=" + this.a + ")";
    }
}
