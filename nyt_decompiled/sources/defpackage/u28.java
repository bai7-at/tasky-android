package defpackage;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class u28 {
    public static final a Companion = new a(null);
    private final Integer a;
    private final String b;
    private final String c;
    private final Long d;
    private final String e;
    private final Integer f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u28 a(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            return new u28(Integer.valueOf(skuDetails.e()), skuDetails.b(), "free", Long.valueOf(skuDetails.h()), skuDetails.i(), 2);
        }

        public final u28 b(e.b bVar) {
            zq3.h(bVar, "pricingPhase");
            return new u28(Integer.valueOf(bVar.a()), bVar.b(), bVar.c(), Long.valueOf(bVar.d()), bVar.e(), Integer.valueOf(bVar.f()));
        }

        public final u28 c(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            return new u28(0, skuDetails.k(), skuDetails.g(), Long.valueOf(skuDetails.h()), skuDetails.i(), 1);
        }

        public final u28 d(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            return new u28(Integer.valueOf(skuDetails.e()), skuDetails.f(), skuDetails.c(), Long.valueOf(skuDetails.d()), skuDetails.i(), 2);
        }

        private a() {
        }
    }

    public u28(Integer num, String str, String str2, Long l, String str3, Integer num2) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = str3;
        this.f = num2;
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u28)) {
            return false;
        }
        u28 u28Var = (u28) obj;
        return zq3.c(this.a, u28Var.a) && zq3.c(this.b, u28Var.b) && zq3.c(this.c, u28Var.c) && zq3.c(this.d, u28Var.d) && zq3.c(this.e, u28Var.e) && zq3.c(this.f, u28Var.f);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "StoreFrontPricingPhase(billingCycleCount: " + this.a + ", billingPeriod: " + this.b + ", formattedPrice: " + this.c + ", priceAmountMicros: " + this.d + ", priceCurrencyCode: " + this.e + ", recurrenceMode: " + this.f + ")";
    }
}
