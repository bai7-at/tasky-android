package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes4.dex */
public final class pj7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public pj7(String str, String str2, String str3, String str4) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        zq3.h(str2, "debugInfo");
        zq3.h(str3, "emailTitle");
        zq3.h(str4, "emailDestination");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj7)) {
            return false;
        }
        pj7 pj7Var = (pj7) obj;
        return zq3.c(this.a, pj7Var.a) && zq3.c(this.b, pj7Var.b) && zq3.c(this.c, pj7Var.c) && zq3.c(this.d, pj7Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SendEmail(type=" + this.a + ", debugInfo=" + this.b + ", emailTitle=" + this.c + ", emailDestination=" + this.d + ")";
    }
}
