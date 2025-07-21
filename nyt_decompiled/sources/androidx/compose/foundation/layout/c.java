package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import defpackage.ac0;
import defpackage.bc0;
import defpackage.bu1;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class c implements bc0, ac0 {
    private final fm1 a;
    private final long b;
    private final /* synthetic */ BoxScopeInstance c;

    public /* synthetic */ c(fm1 fm1Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(fm1Var, j);
    }

    @Override // defpackage.bc0
    public float a() {
        return fv0.j(b()) ? this.a.v(fv0.n(b())) : bu1.b.b();
    }

    @Override // defpackage.bc0
    public long b() {
        return this.b;
    }

    @Override // defpackage.ac0
    public Modifier c(Modifier modifier, Alignment alignment) {
        return this.c.c(modifier, alignment);
    }

    @Override // defpackage.bc0
    public float d() {
        return fv0.i(b()) ? this.a.v(fv0.m(b())) : bu1.b.b();
    }

    @Override // defpackage.ac0
    public Modifier e(Modifier modifier) {
        return this.c.e(modifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return zq3.c(this.a, cVar.a) && fv0.g(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + fv0.q(this.b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) fv0.s(this.b)) + ')';
    }

    private c(fm1 fm1Var, long j) {
        this.a = fm1Var;
        this.b = j;
        this.c = BoxScopeInstance.a;
    }
}
