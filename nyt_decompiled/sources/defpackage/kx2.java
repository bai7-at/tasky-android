package defpackage;

import androidx.paging.s;

/* loaded from: classes.dex */
public final class kx2 {
    private final int a;
    private final s b;

    public kx2(int i, s sVar) {
        zq3.h(sVar, "hint");
        this.a = i;
        this.b = sVar;
    }

    public final int a() {
        return this.a;
    }

    public final s b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx2)) {
            return false;
        }
        kx2 kx2Var = (kx2) obj;
        return this.a == kx2Var.a && zq3.c(this.b, kx2Var.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
