package defpackage;

import androidx.compose.ui.Alignment;

/* loaded from: classes.dex */
public final class fj0 {
    private final Alignment a;
    private final ss2 b;
    private final ph2 c;
    private final boolean d;

    public fj0(Alignment alignment, ss2 ss2Var, ph2 ph2Var, boolean z) {
        this.a = alignment;
        this.b = ss2Var;
        this.c = ph2Var;
        this.d = z;
    }

    public final Alignment a() {
        return this.a;
    }

    public final ph2 b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final ss2 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj;
        return zq3.c(this.a, fj0Var.a) && zq3.c(this.b, fj0Var.b) && zq3.c(this.c, fj0Var.c) && this.d == fj0Var.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}
