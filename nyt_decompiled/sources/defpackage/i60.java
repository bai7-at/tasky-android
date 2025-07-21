package defpackage;

/* loaded from: classes2.dex */
public final class i60 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public i60(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i60)) {
            return false;
        }
        i60 i60Var = (i60) obj;
        return this.c == i60Var.c && this.d == i60Var.d && hc5.a(this.a, i60Var.a) && hc5.a(this.b, i60Var.b);
    }

    public int hashCode() {
        return hc5.b(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
