package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.growthui.common.models.ProductType;

/* loaded from: classes4.dex */
public final class f46 {
    private final ProductType a;
    private final String b;

    public f46(ProductType productType, String str) {
        zq3.h(productType, TransferTable.COLUMN_TYPE);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = productType;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ProductType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f46)) {
            return false;
        }
        f46 f46Var = (f46) obj;
        return this.a == f46Var.a && zq3.c(this.b, f46Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProductTab(type=" + this.a + ", name=" + this.b + ")";
    }
}
