package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bn3;
import defpackage.hn3;
import defpackage.uo6;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class h implements e.a {
    private final Alignment.b a;
    private final int b;

    public h(Alignment.b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    @Override // androidx.compose.material3.e.a
    public int a(bn3 bn3Var, long j, int i, LayoutDirection layoutDirection) {
        return i >= hn3.g(j) - (this.b * 2) ? Alignment.a.g().a(i, hn3.g(j), layoutDirection) : uo6.m(this.a.a(i, hn3.g(j), layoutDirection), this.b, (hn3.g(j) - this.b) - i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return zq3.c(this.a, hVar.a) && this.b == hVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=" + this.b + ')';
    }
}
