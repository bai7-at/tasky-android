package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NYTCookie {
    private final String a;
    private final String b;

    public NYTCookie(@bt3(name = "cipheredValue") String str, @bt3(name = "name") String str2) {
        zq3.h(str, "value");
        zq3.h(str2, "id");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final NYTCookie copy(@bt3(name = "cipheredValue") String str, @bt3(name = "name") String str2) {
        zq3.h(str, "value");
        zq3.h(str2, "id");
        return new NYTCookie(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NYTCookie)) {
            return false;
        }
        NYTCookie nYTCookie = (NYTCookie) obj;
        return zq3.c(this.a, nYTCookie.a) && zq3.c(this.b, nYTCookie.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NYTCookie(value=" + this.a + ", id=" + this.b + ")";
    }
}
