package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class VerifyEmailWithCodeResponse {
    private final VerifyEmailWithCodeResponseData a;
    private final GenericLireResponseMeta b;

    public VerifyEmailWithCodeResponse(VerifyEmailWithCodeResponseData verifyEmailWithCodeResponseData, GenericLireResponseMeta genericLireResponseMeta) {
        this.a = verifyEmailWithCodeResponseData;
        this.b = genericLireResponseMeta;
    }

    public final VerifyEmailWithCodeResponseData a() {
        return this.a;
    }

    public final GenericLireResponseMeta b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailWithCodeResponse)) {
            return false;
        }
        VerifyEmailWithCodeResponse verifyEmailWithCodeResponse = (VerifyEmailWithCodeResponse) obj;
        return zq3.c(this.a, verifyEmailWithCodeResponse.a) && zq3.c(this.b, verifyEmailWithCodeResponse.b);
    }

    public int hashCode() {
        VerifyEmailWithCodeResponseData verifyEmailWithCodeResponseData = this.a;
        int hashCode = (verifyEmailWithCodeResponseData == null ? 0 : verifyEmailWithCodeResponseData.hashCode()) * 31;
        GenericLireResponseMeta genericLireResponseMeta = this.b;
        return hashCode + (genericLireResponseMeta != null ? genericLireResponseMeta.hashCode() : 0);
    }

    public String toString() {
        return "VerifyEmailWithCodeResponse(data=" + this.a + ", meta=" + this.b + ")";
    }

    public /* synthetic */ VerifyEmailWithCodeResponse(VerifyEmailWithCodeResponseData verifyEmailWithCodeResponseData, GenericLireResponseMeta genericLireResponseMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : verifyEmailWithCodeResponseData, (i & 2) != 0 ? null : genericLireResponseMeta);
    }
}
