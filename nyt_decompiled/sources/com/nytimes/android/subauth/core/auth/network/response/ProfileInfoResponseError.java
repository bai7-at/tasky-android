package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ProfileInfoResponseError {
    private final Integer a;
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;

    public ProfileInfoResponseError(Integer num, Integer num2, String str, String str2, String str3) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        return this.d;
    }

    public final Integer b() {
        return this.b;
    }

    public final Integer c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileInfoResponseError)) {
            return false;
        }
        ProfileInfoResponseError profileInfoResponseError = (ProfileInfoResponseError) obj;
        return zq3.c(this.a, profileInfoResponseError.a) && zq3.c(this.b, profileInfoResponseError.b) && zq3.c(this.c, profileInfoResponseError.c) && zq3.c(this.d, profileInfoResponseError.d) && zq3.c(this.e, profileInfoResponseError.e);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ProfileInfoResponseError(httpCode=" + this.a + ", code=" + this.b + ", key=" + this.c + ", category=" + this.d + ", text=" + this.e + ")";
    }
}
