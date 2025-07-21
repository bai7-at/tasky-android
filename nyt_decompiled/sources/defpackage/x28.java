package defpackage;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class x28 {
    public static final a Companion = new a(null);
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final double f;
    private final String g;
    private final long h;
    private final boolean i;
    private final int j;
    private final String k;
    private final boolean l;
    private final String m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ x28 b(a aVar, Purchase purchase, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return aVar.a(purchase, str);
        }

        public final x28 a(Purchase purchase, String str) {
            zq3.h(purchase, "<this>");
            ArrayList i = purchase.i();
            zq3.g(i, "getSkus(...)");
            String str2 = (String) i.m0(i);
            if (str2 == null) {
                List d = purchase.d();
                zq3.g(d, "getProducts(...)");
                str2 = (String) i.k0(d);
            }
            zq3.e(str2);
            int i2 = purchase.k() ? 1 : 2;
            String g = purchase.g();
            zq3.g(g, "getPurchaseToken(...)");
            String c = purchase.c();
            zq3.g(c, "getPackageName(...)");
            String a = purchase.a();
            if (a == null) {
                a = "";
            }
            String str3 = str == null ? "" : str;
            long f = purchase.f();
            boolean k = purchase.k();
            int e = purchase.e();
            String h = purchase.h();
            zq3.g(h, "getSignature(...)");
            boolean j = purchase.j();
            String b = purchase.b();
            zq3.g(b, "getOriginalJson(...)");
            return new x28(str2, i2, g, c, a, 0.0d, str3, f, k, e, h, j, b);
        }

        private a() {
        }
    }

    public x28(String str, int i, String str2, String str3, String str4, double d, String str5, long j, boolean z, int i2, String str6, boolean z2, String str7) {
        zq3.h(str, "sku");
        zq3.h(str2, "receipt");
        zq3.h(str3, "packageName");
        zq3.h(str4, "orderId");
        zq3.h(str5, "currency");
        zq3.h(str6, "signature");
        zq3.h(str7, "originalJson");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = d;
        this.g = str5;
        this.h = j;
        this.i = z;
        this.j = i2;
        this.k = str6;
        this.l = z2;
        this.m = str7;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.m;
    }

    public final String d() {
        return this.d;
    }

    public final double e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x28)) {
            return false;
        }
        x28 x28Var = (x28) obj;
        return zq3.c(this.a, x28Var.a) && this.b == x28Var.b && zq3.c(this.c, x28Var.c) && zq3.c(this.d, x28Var.d) && zq3.c(this.e, x28Var.e) && Double.compare(this.f, x28Var.f) == 0 && zq3.c(this.g, x28Var.g) && this.h == x28Var.h && this.i == x28Var.i && this.j == x28Var.j && zq3.c(this.k, x28Var.k) && this.l == x28Var.l && zq3.c(this.m, x28Var.m);
    }

    public final long f() {
        return this.h;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Double.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + Long.hashCode(this.h)) * 31) + Boolean.hashCode(this.i)) * 31) + Integer.hashCode(this.j)) * 31) + this.k.hashCode()) * 31) + Boolean.hashCode(this.l)) * 31) + this.m.hashCode();
    }

    public final int i() {
        return this.b;
    }

    public final boolean j() {
        return this.i;
    }

    public String toString() {
        return "StoreFrontPurchaseResponse(sku=" + this.a + ", type=" + this.b + ", receipt=" + this.c + ", packageName=" + this.d + ", orderId=" + this.e + ", price=" + this.f + ", currency=" + this.g + ", purchaseTime=" + this.h + ", isAutoRenewing=" + this.i + ", purchaseState=" + this.j + ", signature=" + this.k + ", isAcknowledged=" + this.l + ", originalJson=" + this.m + ")";
    }
}
