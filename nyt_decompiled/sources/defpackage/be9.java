package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes4.dex */
public final class be9 extends zd9 {
    private final String d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be9(String str, String str2) {
        super(str, str2);
        zq3.h(str, "redirectUrl");
        zq3.h(str2, TransferTable.COLUMN_STATE);
        this.d = str;
        this.e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be9)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        return zq3.c(this.d, be9Var.d) && zq3.c(this.e, be9Var.e);
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        return "MismatchedState(redirectUrl=" + this.d + ", state=" + this.e + ")";
    }
}
