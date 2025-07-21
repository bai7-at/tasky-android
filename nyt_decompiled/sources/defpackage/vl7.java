package defpackage;

/* loaded from: classes.dex */
public final class vl7 implements fy1 {
    private final int a;
    private final int b;

    public vl7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fy1
    public void a(ly1 ly1Var) {
        if (ly1Var.l()) {
            ly1Var.a();
        }
        int m = uo6.m(this.a, 0, ly1Var.h());
        int m2 = uo6.m(this.b, 0, ly1Var.h());
        if (m != m2) {
            if (m < m2) {
                ly1Var.n(m, m2);
            } else {
                ly1Var.n(m2, m);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl7)) {
            return false;
        }
        vl7 vl7Var = (vl7) obj;
        return this.a == vl7Var.a && this.b == vl7Var.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
