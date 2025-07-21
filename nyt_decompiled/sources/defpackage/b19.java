package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes4.dex */
public final class b19 {
    private final String a;
    private final String b;

    public b19(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b19)) {
            return false;
        }
        b19 b19Var = (b19) obj;
        return zq3.c(this.a, b19Var.a) && zq3.c(this.b, b19Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "UserProperty(key=" + this.a + ", value=" + this.b + ")";
    }
}
