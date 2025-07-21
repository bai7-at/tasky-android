package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a85;
import defpackage.dv1;
import defpackage.eg0;
import defpackage.ev1;
import defpackage.fg0;
import defpackage.fm1;
import defpackage.in3;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xc5;
import defpackage.yv0;
import defpackage.zd0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl extends Modifier.c implements eg0, xc5, zd0 {
    private final fg0 n;
    private boolean r;
    private ss2 s;

    public CacheDrawModifierNodeImpl(fg0 fg0Var, ss2 ss2Var) {
        this.n = fg0Var;
        this.s = ss2Var;
        fg0Var.f(this);
    }

    private final ev1 f2() {
        if (!this.r) {
            final fg0 fg0Var = this.n;
            fg0Var.i(null);
            l.a(this, new qs2() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m66invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m66invoke() {
                    CacheDrawModifierNodeImpl.this.e2().invoke(fg0Var);
                }
            });
            if (fg0Var.d() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
            }
            this.r = true;
        }
        ev1 d = this.n.d();
        zq3.e(d);
        return d;
    }

    @Override // defpackage.eg0
    public void J0() {
        this.r = false;
        this.n.i(null);
        dv1.a(this);
    }

    @Override // defpackage.cv1
    public void V0() {
        J0();
    }

    @Override // defpackage.zd0
    public long b() {
        return in3.c(rl1.h(this, a85.a(128)).a());
    }

    public final ss2 e2() {
        return this.s;
    }

    @Override // defpackage.xc5
    public void g0() {
        J0();
    }

    public final void g2(ss2 ss2Var) {
        this.s = ss2Var;
        J0();
    }

    @Override // defpackage.zd0
    public fm1 getDensity() {
        return rl1.i(this);
    }

    @Override // defpackage.zd0
    public LayoutDirection getLayoutDirection() {
        return rl1.j(this);
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        f2().a().invoke(yv0Var);
    }
}
