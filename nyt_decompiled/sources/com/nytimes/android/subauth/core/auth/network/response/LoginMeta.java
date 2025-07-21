package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoginMeta {
    private final List a;

    public LoginMeta(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginMeta) && zq3.c(this.a, ((LoginMeta) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "LoginMeta(errors=" + this.a + ")";
    }
}
