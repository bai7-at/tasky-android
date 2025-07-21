package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Auth {
    private final String token;

    public Auth(String str) {
        zq3.h(str, "token");
        this.token = str;
    }

    public static /* synthetic */ Auth copy$default(Auth auth, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auth.token;
        }
        return auth.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final Auth copy(String str) {
        zq3.h(str, "token");
        return new Auth(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Auth) && zq3.c(this.token, ((Auth) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "Auth(token=" + this.token + ')';
    }
}
