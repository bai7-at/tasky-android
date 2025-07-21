package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginWithCodeResponse {
    private final LoginWithCodeResponseData a;
    private final String b;
    private final String c;

    public LoginWithCodeResponse(@bt3(name = "legacy_response") LoginWithCodeResponseData loginWithCodeResponseData, String str, @bt3(name = "error_description") String str2) {
        this.a = loginWithCodeResponseData;
        this.b = str;
        this.c = str2;
    }

    public final LoginWithCodeResponseData a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final LoginWithCodeResponse copy(@bt3(name = "legacy_response") LoginWithCodeResponseData loginWithCodeResponseData, String str, @bt3(name = "error_description") String str2) {
        return new LoginWithCodeResponse(loginWithCodeResponseData, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithCodeResponse)) {
            return false;
        }
        LoginWithCodeResponse loginWithCodeResponse = (LoginWithCodeResponse) obj;
        return zq3.c(this.a, loginWithCodeResponse.a) && zq3.c(this.b, loginWithCodeResponse.b) && zq3.c(this.c, loginWithCodeResponse.c);
    }

    public int hashCode() {
        LoginWithCodeResponseData loginWithCodeResponseData = this.a;
        int hashCode = (loginWithCodeResponseData == null ? 0 : loginWithCodeResponseData.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LoginWithCodeResponse(data=" + this.a + ", error=" + this.b + ", errorDescription=" + this.c + ")";
    }

    public /* synthetic */ LoginWithCodeResponse(LoginWithCodeResponseData loginWithCodeResponseData, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loginWithCodeResponseData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
