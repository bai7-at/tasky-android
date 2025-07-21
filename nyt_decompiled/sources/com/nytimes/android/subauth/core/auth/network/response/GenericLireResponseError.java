package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GenericLireResponseError {
    private final String a;
    private final Integer b;
    private final Integer c;
    private final String d;

    public GenericLireResponseError(String str, Integer num, Integer num2, @bt3(name = "text") String str2) {
        zq3.h(str2, "errorMessage");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final GenericLireResponseError copy(String str, Integer num, Integer num2, @bt3(name = "text") String str2) {
        zq3.h(str2, "errorMessage");
        return new GenericLireResponseError(str, num, num2, str2);
    }

    public final Integer d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericLireResponseError)) {
            return false;
        }
        GenericLireResponseError genericLireResponseError = (GenericLireResponseError) obj;
        return zq3.c(this.a, genericLireResponseError.a) && zq3.c(this.b, genericLireResponseError.b) && zq3.c(this.c, genericLireResponseError.c) && zq3.c(this.d, genericLireResponseError.d);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "GenericLireResponseError(category=" + this.a + ", code=" + this.b + ", httpCode=" + this.c + ", errorMessage=" + this.d + ")";
    }

    public /* synthetic */ GenericLireResponseError(String str, Integer num, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, str2);
    }
}
