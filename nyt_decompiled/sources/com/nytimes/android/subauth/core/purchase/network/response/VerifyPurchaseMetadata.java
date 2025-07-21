package com.nytimes.android.subauth.core.purchase.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class VerifyPurchaseMetadata {
    private final Integer a;
    private final String b;

    public VerifyPurchaseMetadata(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPurchaseMetadata)) {
            return false;
        }
        VerifyPurchaseMetadata verifyPurchaseMetadata = (VerifyPurchaseMetadata) obj;
        return zq3.c(this.a, verifyPurchaseMetadata.a) && zq3.c(this.b, verifyPurchaseMetadata.b);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VerifyPurchaseMetadata(code=" + this.a + ", msg=" + this.b + ")";
    }

    public /* synthetic */ VerifyPurchaseMetadata(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
