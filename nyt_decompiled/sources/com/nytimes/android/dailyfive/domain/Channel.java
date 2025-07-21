package com.nytimes.android.dailyfive.domain;

import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Channel {
    private final String a;
    private final String b;
    private final String c;

    public Channel(String str, String str2, String str3) {
        zq3.h(str, "uri");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str3, "description");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return zq3.c(this.a, channel.a) && zq3.c(this.b, channel.b) && zq3.c(this.c, channel.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Channel(uri=" + this.a + ", name=" + this.b + ", description=" + this.c + ")";
    }
}
