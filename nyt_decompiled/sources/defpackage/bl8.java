package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public final class bl8 {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public bl8(String str, String str2, String str3, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, TransferTable.COLUMN_STATE);
        zq3.h(str3, "stack");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl8)) {
            return false;
        }
        bl8 bl8Var = (bl8) obj;
        return zq3.c(this.a, bl8Var.a) && zq3.c(this.b, bl8Var.b) && zq3.c(this.c, bl8Var.c) && this.d == bl8Var.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ThreadDump(name=" + this.a + ", state=" + this.b + ", stack=" + this.c + ", crashed=" + this.d + ")";
    }
}
