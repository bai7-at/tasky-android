package defpackage;

import androidx.compose.ui.text.f;

/* loaded from: classes.dex */
public final class zu5 {
    private final f a;
    private final uu5 b;

    public zu5(f fVar, uu5 uu5Var) {
        this.a = fVar;
        this.b = uu5Var;
    }

    public final uu5 a() {
        return this.b;
    }

    public final f b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu5)) {
            return false;
        }
        zu5 zu5Var = (zu5) obj;
        return zq3.c(this.b, zu5Var.b) && zq3.c(this.a, zu5Var.a);
    }

    public int hashCode() {
        f fVar = this.a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        uu5 uu5Var = this.b;
        return hashCode + (uu5Var != null ? uu5Var.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public zu5(boolean z) {
        this(null, new uu5(z));
    }
}
