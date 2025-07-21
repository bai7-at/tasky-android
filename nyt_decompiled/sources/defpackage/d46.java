package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.growthui.common.models.ProductType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class d46 {
    private final oh3 a;
    private final n73 b;
    private final oh3 c;
    private final String d;
    private final bd5 e;
    private final ProductType f;

    public d46(oh3 oh3Var, n73 n73Var, oh3 oh3Var2, String str, bd5 bd5Var, ProductType productType) {
        zq3.h(n73Var, "header");
        zq3.h(oh3Var2, "valueProps");
        zq3.h(str, "description");
        zq3.h(bd5Var, "offers");
        zq3.h(productType, TransferTable.COLUMN_TYPE);
        this.a = oh3Var;
        this.b = n73Var;
        this.c = oh3Var2;
        this.d = str;
        this.e = bd5Var;
        this.f = productType;
    }

    public final String a() {
        return this.d;
    }

    public final n73 b() {
        return this.b;
    }

    public final oh3 c() {
        return this.a;
    }

    public final bd5 d() {
        return this.e;
    }

    public final ProductType e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d46)) {
            return false;
        }
        d46 d46Var = (d46) obj;
        return zq3.c(this.a, d46Var.a) && zq3.c(this.b, d46Var.b) && zq3.c(this.c, d46Var.c) && zq3.c(this.d, d46Var.d) && zq3.c(this.e, d46Var.e) && this.f == d46Var.f;
    }

    public final oh3 f() {
        return this.c;
    }

    public int hashCode() {
        oh3 oh3Var = this.a;
        return ((((((((((oh3Var == null ? 0 : oh3Var.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "Product(icons=" + this.a + ", header=" + this.b + ", valueProps=" + this.c + ", description=" + this.d + ", offers=" + this.e + ", type=" + this.f + ")";
    }

    public /* synthetic */ d46(oh3 oh3Var, n73 n73Var, oh3 oh3Var2, String str, bd5 bd5Var, ProductType productType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oh3Var, n73Var, oh3Var2, (i & 8) != 0 ? "" : str, bd5Var, productType);
    }
}
