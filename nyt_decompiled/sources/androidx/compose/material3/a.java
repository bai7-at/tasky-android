package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bn3;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class a implements e.a {
    private final Alignment.b a;
    private final Alignment.b b;
    private final int c;

    public a(Alignment.b bVar, Alignment.b bVar2, int i) {
        this.a = bVar;
        this.b = bVar2;
        this.c = i;
    }

    @Override // androidx.compose.material3.e.a
    public int a(bn3 bn3Var, long j, int i, LayoutDirection layoutDirection) {
        int a = this.b.a(0, bn3Var.i(), layoutDirection);
        int i2 = -this.a.a(0, i, layoutDirection);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i3 = this.c;
        if (layoutDirection != layoutDirection2) {
            i3 = -i3;
        }
        return bn3Var.d() + a + i2 + i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && this.c == aVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
