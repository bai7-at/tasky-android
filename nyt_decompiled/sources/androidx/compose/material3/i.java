package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.Alignment;
import defpackage.bn3;
import defpackage.hn3;
import defpackage.uo6;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class i implements e.b {
    private final Alignment.c a;
    private final int b;

    public i(Alignment.c cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    @Override // androidx.compose.material3.e.b
    public int a(bn3 bn3Var, long j, int i) {
        return i >= hn3.f(j) - (this.b * 2) ? Alignment.a.i().a(i, hn3.f(j)) : uo6.m(this.a.a(i, hn3.f(j)), this.b, (hn3.f(j) - this.b) - i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return zq3.c(this.a, iVar.a) && this.b == iVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Vertical(alignment=" + this.a + ", margin=" + this.b + ')';
    }
}
