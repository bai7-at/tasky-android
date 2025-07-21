package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginWithCodeError {
    private final String a;
    private final String b;

    public LoginWithCodeError(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithCodeError)) {
            return false;
        }
        LoginWithCodeError loginWithCodeError = (LoginWithCodeError) obj;
        return zq3.c(this.a, loginWithCodeError.a) && zq3.c(this.b, loginWithCodeError.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LoginWithCodeError(error=" + this.a + ", errorDescription=" + this.b + ")";
    }

    public /* synthetic */ LoginWithCodeError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
