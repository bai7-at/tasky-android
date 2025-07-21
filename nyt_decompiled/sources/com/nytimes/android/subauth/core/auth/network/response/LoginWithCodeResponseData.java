package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginWithCodeResponseData {
    private final List a;
    private final NYTUserInfo b;

    public LoginWithCodeResponseData(List<NYTCodeCookie> list, @bt3(name = "user_info") NYTUserInfo nYTUserInfo) {
        zq3.h(list, "cookies");
        zq3.h(nYTUserInfo, "userInfo");
        this.a = list;
        this.b = nYTUserInfo;
    }

    public final List a() {
        return this.a;
    }

    public final NYTUserInfo b() {
        return this.b;
    }

    public final LoginWithCodeResponseData copy(List<NYTCodeCookie> list, @bt3(name = "user_info") NYTUserInfo nYTUserInfo) {
        zq3.h(list, "cookies");
        zq3.h(nYTUserInfo, "userInfo");
        return new LoginWithCodeResponseData(list, nYTUserInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithCodeResponseData)) {
            return false;
        }
        LoginWithCodeResponseData loginWithCodeResponseData = (LoginWithCodeResponseData) obj;
        return zq3.c(this.a, loginWithCodeResponseData.a) && zq3.c(this.b, loginWithCodeResponseData.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoginWithCodeResponseData(cookies=" + this.a + ", userInfo=" + this.b + ")";
    }
}
