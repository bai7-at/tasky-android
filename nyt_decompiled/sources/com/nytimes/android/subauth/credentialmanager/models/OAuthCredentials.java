package com.nytimes.android.subauth.credentialmanager.models;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class OAuthCredentials {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public OAuthCredentials(String str, String str2, String str3, String str4) {
        zq3.h(str2, "clientId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthCredentials)) {
            return false;
        }
        OAuthCredentials oAuthCredentials = (OAuthCredentials) obj;
        return zq3.c(this.a, oAuthCredentials.a) && zq3.c(this.b, oAuthCredentials.b) && zq3.c(this.c, oAuthCredentials.c) && zq3.c(this.d, oAuthCredentials.d);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OAuthCredentials(authUri=" + this.a + ", clientId=" + this.b + ", responseType=" + this.c + ", scopes=" + this.d + ")";
    }
}
