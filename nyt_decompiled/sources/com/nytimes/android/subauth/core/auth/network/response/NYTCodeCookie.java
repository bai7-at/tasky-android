package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NYTCodeCookie {
    private final String a;
    private final String b;

    public NYTCodeCookie(@bt3(name = "value") String str, @bt3(name = "name") String str2) {
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

    public final NYTCodeCookie copy(@bt3(name = "value") String str, @bt3(name = "name") String str2) {
        zq3.h(str, "value");
        zq3.h(str2, "id");
        return new NYTCodeCookie(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NYTCodeCookie)) {
            return false;
        }
        NYTCodeCookie nYTCodeCookie = (NYTCodeCookie) obj;
        return zq3.c(this.a, nYTCodeCookie.a) && zq3.c(this.b, nYTCodeCookie.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NYTCodeCookie(value=" + this.a + ", id=" + this.b + ")";
    }
}
