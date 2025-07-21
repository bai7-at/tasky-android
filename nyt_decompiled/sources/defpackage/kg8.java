package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes3.dex */
public final class kg8 implements rp2 {
    private final String a;
    private final String b;

    public kg8(String str, String str2) {
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
        if (!(obj instanceof kg8)) {
            return false;
        }
        kg8 kg8Var = (kg8) obj;
        return zq3.c(this.a, kg8Var.a) && zq3.c(this.b, kg8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TargetingParam(key=" + this.a + ", value=" + this.b + ")";
    }
}
