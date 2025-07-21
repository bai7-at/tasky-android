package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EmailStatusResponse {
    private final EmailStatusResponseData a;

    public EmailStatusResponse(EmailStatusResponseData emailStatusResponseData) {
        zq3.h(emailStatusResponseData, "data");
        this.a = emailStatusResponseData;
    }

    public final EmailStatusResponseData a() {
        return this.a;
    }

    public final a b() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailStatusResponse) && zq3.c(this.a, ((EmailStatusResponse) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "EmailStatusResponse(data=" + this.a + ")";
    }
}
