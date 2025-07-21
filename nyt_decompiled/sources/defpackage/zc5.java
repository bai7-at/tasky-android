package defpackage;

import com.nytimes.android.growthui.common.models.ProductType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zc5 {
    private final String a;
    private final pb8 b;
    private final String c;
    private final boolean d;
    private final ProductType e;

    public zc5(String str, pb8 pb8Var, String str2, boolean z, ProductType productType) {
        zq3.h(str, "badge");
        zq3.h(pb8Var, "price");
        zq3.h(str2, "sku");
        this.a = str;
        this.b = pb8Var;
        this.c = str2;
        this.d = z;
        this.e = productType;
    }

    public static /* synthetic */ zc5 b(zc5 zc5Var, String str, pb8 pb8Var, String str2, boolean z, ProductType productType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zc5Var.a;
        }
        if ((i & 2) != 0) {
            pb8Var = zc5Var.b;
        }
        pb8 pb8Var2 = pb8Var;
        if ((i & 4) != 0) {
            str2 = zc5Var.c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            z = zc5Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            productType = zc5Var.e;
        }
        return zc5Var.a(str, pb8Var2, str3, z2, productType);
    }

    public final zc5 a(String str, pb8 pb8Var, String str2, boolean z, ProductType productType) {
        zq3.h(str, "badge");
        zq3.h(pb8Var, "price");
        zq3.h(str2, "sku");
        return new zc5(str, pb8Var, str2, z, productType);
    }

    public final String c() {
        return this.a;
    }

    public final pb8 d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc5)) {
            return false;
        }
        zc5 zc5Var = (zc5) obj;
        return zq3.c(this.a, zc5Var.a) && zq3.c(this.b, zc5Var.b) && zq3.c(this.c, zc5Var.c) && this.d == zc5Var.d && this.e == zc5Var.e;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
        ProductType productType = this.e;
        return hashCode + (productType == null ? 0 : productType.hashCode());
    }

    public String toString() {
        return "OfferDetails(badge=" + this.a + ", price=" + this.b + ", sku=" + this.c + ", isScheduledSale=" + this.d + ", productType=" + this.e + ")";
    }

    public /* synthetic */ zc5(String str, pb8 pb8Var, String str2, boolean z, ProductType productType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, pb8Var, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : productType);
    }
}
