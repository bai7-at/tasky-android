package defpackage;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.e;
import defpackage.z28;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class v28 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final t28 e;
    private final String f;
    private final String g;
    private final boolean h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v28 a(e eVar) {
            List l;
            zq3.h(eVar, "productDetails");
            String b = eVar.b();
            String a = eVar.a();
            String d = eVar.d();
            List f = eVar.f();
            if (f != null) {
                List<e.d> list = f;
                ArrayList arrayList = new ArrayList(i.w(list, 10));
                for (e.d dVar : list) {
                    z28.a aVar = z28.Companion;
                    zq3.e(dVar);
                    arrayList.add(aVar.c(dVar));
                }
                l = arrayList;
            } else {
                l = i.l();
            }
            e.a c = eVar.c();
            return new v28(b, a, d, l, c != null ? t28.Companion.a(c) : null, eVar.g(), eVar.e(), false, 128, null);
        }

        public final v28 b(SkuDetails skuDetails) {
            zq3.h(skuDetails, "details");
            String l = skuDetails.l();
            String j = skuDetails.j();
            String a = skuDetails.a();
            List d = z28.Companion.d(skuDetails);
            if (d == null) {
                d = i.l();
            }
            return new v28(l, a, j, d, t28.Companion.b(skuDetails), skuDetails.l(), skuDetails.m(), true);
        }

        private a() {
        }
    }

    public v28(String str, String str2, String str3, List list, t28 t28Var, String str4, String str5, boolean z) {
        zq3.h(list, "subscriptionOfferDetails");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = t28Var;
        this.f = str4;
        this.g = str5;
        this.h = z;
    }

    public final v28 a() {
        z28 z28Var;
        List r = i.r(new u28(1, "week", "$1.00", 1L, "USD", 2));
        List e = e();
        List b = (e == null || (z28Var = (z28) i.k0(e)) == null) ? null : z28Var.b();
        if (b == null) {
            b = i.l();
        }
        List F0 = i.F0(r, b);
        return new v28(c(), b(), d(), i.F0(i.e(new z28(d(), d() + "-intro", "INVALID_TOKEN", null, F0, 8, null)), e()), null, f(), g(), false);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public List e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v28)) {
            return false;
        }
        v28 v28Var = (v28) obj;
        return zq3.c(this.a, v28Var.a) && zq3.c(this.b, v28Var.b) && zq3.c(this.c, v28Var.c) && zq3.c(this.d, v28Var.d) && zq3.c(this.e, v28Var.e) && zq3.c(this.f, v28Var.f) && zq3.c(this.g, v28Var.g) && this.h == v28Var.h;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d.hashCode()) * 31;
        t28 t28Var = this.e;
        int hashCode4 = (hashCode3 + (t28Var == null ? 0 : t28Var.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.h);
    }

    public String toString() {
        return "StoreFrontProductDetails(sku: " + d() + ", title: " + f() + ", name: " + c() + ", subscriptionOfferDetails: " + e() + ", type: " + g() + ")";
    }

    public /* synthetic */ v28(String str, String str2, String str3, List list, t28 t28Var, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, list, (i & 16) != 0 ? null : t28Var, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z);
    }
}
