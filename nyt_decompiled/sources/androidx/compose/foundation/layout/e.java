package androidx.compose.foundation.layout;

import defpackage.hv4;
import defpackage.nv4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class e implements hv4 {
    private final ss2 b;
    private o c;

    public e(ss2 ss2Var) {
        this.b = ss2Var;
    }

    @Override // defpackage.hv4
    public void c(nv4 nv4Var) {
        o oVar = (o) nv4Var.l(WindowInsetsPaddingKt.a());
        if (zq3.c(oVar, this.c)) {
            return;
        }
        this.c = oVar;
        this.b.invoke(oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return zq3.c(((e) obj).b, this.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
