package defpackage;

/* loaded from: classes2.dex */
public class bl4 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public bl4(Object obj) {
        this(obj, -1L);
    }

    public bl4 a(Object obj) {
        return this.a.equals(obj) ? this : new bl4(obj, this.b, this.c, this.d, this.e);
    }

    public boolean b() {
        return this.b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl4)) {
            return false;
        }
        bl4 bl4Var = (bl4) obj;
        return this.a.equals(bl4Var.a) && this.b == bl4Var.b && this.c == bl4Var.c && this.d == bl4Var.d && this.e == bl4Var.e;
    }

    public int hashCode() {
        return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public bl4(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public bl4(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public bl4(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    protected bl4(bl4 bl4Var) {
        this.a = bl4Var.a;
        this.b = bl4Var.b;
        this.c = bl4Var.c;
        this.d = bl4Var.d;
        this.e = bl4Var.e;
    }

    private bl4(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
