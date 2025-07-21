package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginResponseData {
    public static final a Companion = new a(null);
    private final String a;
    private final List b;
    private final NYTUserInfo c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LoginResponseData(String str, List list, NYTUserInfo nYTUserInfo) {
        this.a = str;
        this.b = list;
        this.c = nYTUserInfo;
    }

    public static /* synthetic */ LoginResponseData b(LoginResponseData loginResponseData, String str, List list, NYTUserInfo nYTUserInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginResponseData.a;
        }
        if ((i & 2) != 0) {
            list = loginResponseData.b;
        }
        if ((i & 4) != 0) {
            nYTUserInfo = loginResponseData.c;
        }
        return loginResponseData.a(str, list, nYTUserInfo);
    }

    public final LoginResponseData a(String str, List list, NYTUserInfo nYTUserInfo) {
        return new LoginResponseData(str, list, nYTUserInfo);
    }

    public final String c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public final NYTUserInfo e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResponseData)) {
            return false;
        }
        LoginResponseData loginResponseData = (LoginResponseData) obj;
        return zq3.c(this.a, loginResponseData.a) && zq3.c(this.b, loginResponseData.b) && zq3.c(this.c, loginResponseData.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NYTUserInfo nYTUserInfo = this.c;
        return hashCode2 + (nYTUserInfo != null ? nYTUserInfo.hashCode() : 0);
    }

    public String toString() {
        return "LoginResponseData(action=" + this.a + ", cookies=" + this.b + ", userInfo=" + this.c + ")";
    }
}
