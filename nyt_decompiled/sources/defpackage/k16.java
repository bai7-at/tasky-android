package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes.dex */
public final class k16 {
    private final String a;
    private final Long b;

    public k16(String str, Long l) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        this.a = str;
        this.b = l;
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k16)) {
            return false;
        }
        k16 k16Var = (k16) obj;
        return zq3.c(this.a, k16Var.a) && zq3.c(this.b, k16Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k16(String str, boolean z) {
        this(str, Long.valueOf(z ? 1L : 0L));
        zq3.h(str, TransferTable.COLUMN_KEY);
    }
}
