package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes4.dex */
public final class ae9 extends zd9 {
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae9(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str, str2);
        zq3.h(str, "redirectUrl");
        zq3.h(str2, TransferTable.COLUMN_STATE);
        zq3.h(str3, "error");
        zq3.h(str4, "errorCode");
        zq3.h(str5, "errorDescription");
        zq3.h(str6, "errorReason");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae9)) {
            return false;
        }
        ae9 ae9Var = (ae9) obj;
        return zq3.c(this.d, ae9Var.d) && zq3.c(this.e, ae9Var.e) && zq3.c(this.f, ae9Var.f) && zq3.c(this.g, ae9Var.g) && zq3.c(this.h, ae9Var.h) && zq3.c(this.i, ae9Var.i);
    }

    public int hashCode() {
        return (((((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "DeeplinkResponseError(redirectUrl=" + this.d + ", state=" + this.e + ", error=" + this.f + ", errorCode=" + this.g + ", errorDescription=" + this.h + ", errorReason=" + this.i + ")";
    }
}
