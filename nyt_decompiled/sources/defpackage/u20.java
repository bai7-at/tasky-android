package defpackage;

/* loaded from: classes2.dex */
public final class u20 {
    public final int a;
    public final float b;

    public u20(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u20.class != obj.getClass()) {
            return false;
        }
        u20 u20Var = (u20) obj;
        return this.a == u20Var.a && Float.compare(u20Var.b, this.b) == 0;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
