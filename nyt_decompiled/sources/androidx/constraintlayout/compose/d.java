package androidx.constraintlayout.compose;

import defpackage.hz3;
import defpackage.ss2;
import defpackage.wu0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class d implements hz3 {
    private final wu0 a;
    private final ss2 b;
    private final Object c;

    public d(wu0 wu0Var, ss2 ss2Var) {
        zq3.h(wu0Var, "ref");
        zq3.h(ss2Var, "constrain");
        this.a = wu0Var;
        this.b = ss2Var;
        this.c = wu0Var.c();
    }

    @Override // defpackage.hz3
    public Object L0() {
        return this.c;
    }

    public final ss2 a() {
        return this.b;
    }

    public final wu0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (zq3.c(this.a.c(), dVar.a.c()) && zq3.c(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a.c().hashCode() * 31) + this.b.hashCode();
    }
}
