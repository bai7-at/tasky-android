package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginResponse {
    private final LoginResponseData a;
    private final LoginMeta b;

    public LoginResponse(LoginResponseData loginResponseData, LoginMeta loginMeta) {
        this.a = loginResponseData;
        this.b = loginMeta;
    }

    public final LoginResponse a(LoginResponseData loginResponseData, LoginMeta loginMeta) {
        return new LoginResponse(loginResponseData, loginMeta);
    }

    public final String b() {
        LoginResponseData loginResponseData = this.a;
        if (loginResponseData != null) {
            return loginResponseData.c();
        }
        return null;
    }

    public final LoginResponseData c() {
        return this.a;
    }

    public final String d() {
        NYTUserInfo e;
        LoginResponseData loginResponseData = this.a;
        if (loginResponseData == null || (e = loginResponseData.e()) == null) {
            return null;
        }
        return e.a();
    }

    public final LoginError e() {
        List a;
        LoginMeta loginMeta = this.b;
        if (loginMeta == null || (a = loginMeta.a()) == null) {
            return null;
        }
        return (LoginError) i.m0(a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        return zq3.c(this.a, loginResponse.a) && zq3.c(this.b, loginResponse.b);
    }

    public final LoginMeta f() {
        return this.b;
    }

    public final String g() {
        List d;
        Object obj;
        LoginResponseData loginResponseData = this.a;
        if (loginResponseData == null || (d = loginResponseData.d()) == null) {
            return null;
        }
        Iterator it2 = d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((NYTCookie) obj).a(), "NYT-MPS")) {
                break;
            }
        }
        NYTCookie nYTCookie = (NYTCookie) obj;
        if (nYTCookie != null) {
            return nYTCookie.b();
        }
        return null;
    }

    public final String h() {
        List d;
        Object obj;
        LoginResponseData loginResponseData = this.a;
        if (loginResponseData == null || (d = loginResponseData.d()) == null) {
            return null;
        }
        Iterator it2 = d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((NYTCookie) obj).a(), "NYT-S")) {
                break;
            }
        }
        NYTCookie nYTCookie = (NYTCookie) obj;
        if (nYTCookie != null) {
            return nYTCookie.b();
        }
        return null;
    }

    public int hashCode() {
        LoginResponseData loginResponseData = this.a;
        int hashCode = (loginResponseData == null ? 0 : loginResponseData.hashCode()) * 31;
        LoginMeta loginMeta = this.b;
        return hashCode + (loginMeta != null ? loginMeta.hashCode() : 0);
    }

    public String toString() {
        return "LoginResponse(data=" + this.a + ", meta=" + this.b + ")";
    }

    public /* synthetic */ LoginResponse(LoginResponseData loginResponseData, LoginMeta loginMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loginResponseData, (i & 2) != 0 ? null : loginMeta);
    }
}
