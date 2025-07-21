package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EmailStatusResponseAccountStatus {
    private final String a;
    private final Boolean b;

    public EmailStatusResponseAccountStatus(String str, Boolean bool) {
        zq3.h(str, "status");
        this.a = str;
        this.b = bool;
    }

    public final Boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailStatusResponseAccountStatus)) {
            return false;
        }
        EmailStatusResponseAccountStatus emailStatusResponseAccountStatus = (EmailStatusResponseAccountStatus) obj;
        return zq3.c(this.a, emailStatusResponseAccountStatus.a) && zq3.c(this.b, emailStatusResponseAccountStatus.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "EmailStatusResponseAccountStatus(status=" + this.a + ", regiLite=" + this.b + ")";
    }

    public /* synthetic */ EmailStatusResponseAccountStatus(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
