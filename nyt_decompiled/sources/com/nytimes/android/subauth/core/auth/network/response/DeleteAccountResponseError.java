package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DeleteAccountResponseError {
    private final String a;
    private final int b;
    private final int c;
    private final String d;

    public DeleteAccountResponseError(String str, int i, int i2, String str2) {
        zq3.h(str, "category");
        zq3.h(str2, "text");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAccountResponseError)) {
            return false;
        }
        DeleteAccountResponseError deleteAccountResponseError = (DeleteAccountResponseError) obj;
        return zq3.c(this.a, deleteAccountResponseError.a) && this.b == deleteAccountResponseError.b && this.c == deleteAccountResponseError.c && zq3.c(this.d, deleteAccountResponseError.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DeleteAccountResponseError(category=" + this.a + ", code=" + this.b + ", httpCode=" + this.c + ", text=" + this.d + ")";
    }
}
