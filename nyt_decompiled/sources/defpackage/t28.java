package defpackage;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class t28 {
    public static final a Companion = new a(null);
    private final String a;
    private final Long b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t28 a(e.a aVar) {
            zq3.h(aVar, "oneTimePurchaseOfferDetails");
            return new t28(aVar.a(), Long.valueOf(aVar.b()), aVar.c());
        }

        public final t28 b(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            if (zq3.c(skuDetails.m(), "inapp")) {
                return new t28(skuDetails.g(), Long.valueOf(skuDetails.h()), skuDetails.i());
            }
            return null;
        }

        private a() {
        }
    }

    public t28(String str, Long l, String str2) {
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t28)) {
            return false;
        }
        t28 t28Var = (t28) obj;
        return zq3.c(this.a, t28Var.a) && zq3.c(this.b, t28Var.b) && zq3.c(this.c, t28Var.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StoreFrontOneTimePurchaseOfferDetails(formattedPrice: " + this.a + ", priceAmountMicros: " + this.b + ", priceCurrencyCode: " + this.c + ")";
    }
}
