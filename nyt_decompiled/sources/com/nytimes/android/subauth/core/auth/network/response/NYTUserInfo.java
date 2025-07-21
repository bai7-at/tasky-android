package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NYTUserInfo {
    private final String a;
    private final long b;

    public NYTUserInfo(String str, long j) {
        zq3.h(str, "email");
        this.a = str;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NYTUserInfo)) {
            return false;
        }
        NYTUserInfo nYTUserInfo = (NYTUserInfo) obj;
        return zq3.c(this.a, nYTUserInfo.a) && this.b == nYTUserInfo.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "NYTUserInfo(email=" + this.a + ", userId=" + this.b + ")";
    }
}
