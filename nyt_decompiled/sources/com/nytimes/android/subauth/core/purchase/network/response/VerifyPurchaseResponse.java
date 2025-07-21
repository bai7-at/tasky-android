package com.nytimes.android.subauth.core.purchase.network.response;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class VerifyPurchaseResponse {
    private final VerifyPurchaseData a;
    private final VerifyPurchaseMetadata b;

    public VerifyPurchaseResponse(VerifyPurchaseData verifyPurchaseData, VerifyPurchaseMetadata verifyPurchaseMetadata) {
        zq3.h(verifyPurchaseData, "data");
        zq3.h(verifyPurchaseMetadata, "meta");
        this.a = verifyPurchaseData;
        this.b = verifyPurchaseMetadata;
    }

    public final VerifyPurchaseData a() {
        return this.a;
    }

    public final VerifyPurchaseMetadata b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPurchaseResponse)) {
            return false;
        }
        VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) obj;
        return zq3.c(this.a, verifyPurchaseResponse.a) && zq3.c(this.b, verifyPurchaseResponse.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseResponse(data=" + this.a + ", meta=" + this.b + ")";
    }
}
