package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.Alignment;
import defpackage.bn3;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class b implements e.b {
    private final Alignment.c a;
    private final Alignment.c b;
    private final int c;

    public b(Alignment.c cVar, Alignment.c cVar2, int i) {
        this.a = cVar;
        this.b = cVar2;
        this.c = i;
    }

    @Override // androidx.compose.material3.e.b
    public int a(bn3 bn3Var, long j, int i) {
        int a = this.b.a(0, bn3Var.c());
        return bn3Var.g() + a + (-this.a.a(0, i)) + this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && this.c == bVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
