package com.nytimes.android.subauth.credentialmanager.models;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LireSSOData {
    private final OAuthCredentials a;

    public LireSSOData(@bt3(name = "oauthCredentials") OAuthCredentials oAuthCredentials) {
        zq3.h(oAuthCredentials, "oAuthCredentials");
        this.a = oAuthCredentials;
    }

    public final OAuthCredentials a() {
        return this.a;
    }

    public final LireSSOData copy(@bt3(name = "oauthCredentials") OAuthCredentials oAuthCredentials) {
        zq3.h(oAuthCredentials, "oAuthCredentials");
        return new LireSSOData(oAuthCredentials);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LireSSOData) && zq3.c(this.a, ((LireSSOData) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "LireSSOData(oAuthCredentials=" + this.a + ")";
    }
}
