package defpackage;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.e;
import defpackage.u28;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class z28 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final List e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z28 a(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            return new z28(skuDetails.j(), null, "", i.l(), i.e(u28.Companion.c(skuDetails)));
        }

        public final z28 b(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            String j = skuDetails.j();
            String str = skuDetails.j() + "-intro";
            List l = i.l();
            u28.a aVar = u28.Companion;
            return new z28(j, str, "LEGACY_SKU_DETAILS", l, i.o(aVar.a(skuDetails), aVar.c(skuDetails)));
        }

        public final z28 c(e.d dVar) {
            zq3.h(dVar, "offerDetails");
            String a = dVar.a();
            String b = dVar.b();
            String d = dVar.d();
            List c = dVar.c();
            List a2 = dVar.e().a();
            zq3.g(a2, "getPricingPhaseList(...)");
            List<e.b> list = a2;
            ArrayList arrayList = new ArrayList(i.w(list, 10));
            for (e.b bVar : list) {
                u28.a aVar = u28.Companion;
                zq3.e(bVar);
                arrayList.add(aVar.b(bVar));
            }
            return new z28(a, b, d, c, arrayList);
        }

        public final List d(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            ArrayList arrayList = new ArrayList();
            if (zq3.c(skuDetails.m(), "subs")) {
                String c = skuDetails.c();
                zq3.g(c, "getIntroductoryPrice(...)");
                if (c.length() > 0) {
                    arrayList.add(0, e(skuDetails));
                } else {
                    String b = skuDetails.b();
                    zq3.g(b, "getFreeTrialPeriod(...)");
                    if (b.length() > 0) {
                        arrayList.add(0, b(skuDetails));
                    }
                }
                arrayList.add(a(skuDetails));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        public final z28 e(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            String j = skuDetails.j();
            String str = skuDetails.j() + "-intro";
            List l = i.l();
            u28.a aVar = u28.Companion;
            return new z28(j, str, "LEGACY_SKU_DETAILS", l, i.o(aVar.d(skuDetails), aVar.c(skuDetails)));
        }

        private a() {
        }
    }

    public z28(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z28)) {
            return false;
        }
        z28 z28Var = (z28) obj;
        return zq3.c(this.a, z28Var.a) && zq3.c(this.b, z28Var.b) && zq3.c(this.c, z28Var.c) && zq3.c(this.d, z28Var.d) && zq3.c(this.e, z28Var.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "StoreFrontSubscriptionOfferDetail(basePlanId: " + this.a + ", offerId: " + this.b + ", offerIdToken: " + this.c + ", offerTags: " + this.d + ", pricingPhases: " + this.e + ")";
    }

    public /* synthetic */ z28(String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
