package defpackage;

/* loaded from: classes.dex */
public final class zl7 implements fy1 {
    private final int a;
    private final int b;

    public zl7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fy1
    public void a(ly1 ly1Var) {
        int m = uo6.m(this.a, 0, ly1Var.h());
        int m2 = uo6.m(this.b, 0, ly1Var.h());
        if (m < m2) {
            ly1Var.p(m, m2);
        } else {
            ly1Var.p(m2, m);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl7)) {
            return false;
        }
        zl7 zl7Var = (zl7) obj;
        return this.a == zl7Var.a && this.b == zl7Var.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
