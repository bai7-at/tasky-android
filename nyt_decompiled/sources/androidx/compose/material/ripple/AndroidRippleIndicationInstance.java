package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b0;
import defpackage.dg4;
import defpackage.e26;
import defpackage.e27;
import defpackage.f27;
import defpackage.g27;
import defpackage.k27;
import defpackage.nn0;
import defpackage.ov6;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.wd;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zt7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends c implements ov6 {
    private final boolean b;
    private final float c;
    private final x08 d;
    private final x08 e;
    private final ViewGroup f;
    private g27 g;
    private final sy4 h;
    private final sy4 i;
    private long j;
    private int k;
    private final qs2 l;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, x08 x08Var, x08 x08Var2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, x08Var, x08Var2, viewGroup);
    }

    private final void k() {
        g27 g27Var = this.g;
        if (g27Var != null) {
            g27Var.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final g27 m() {
        g27 g27Var = this.g;
        if (g27Var != null) {
            zq3.e(g27Var);
            return g27Var;
        }
        int childCount = this.f.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = this.f.getChildAt(i);
            if (childAt instanceof g27) {
                this.g = (g27) childAt;
                break;
            }
            i++;
        }
        if (this.g == null) {
            g27 g27Var2 = new g27(this.f.getContext());
            this.f.addView(g27Var2);
            this.g = g27Var2;
        }
        g27 g27Var3 = this.g;
        zq3.e(g27Var3);
        return g27Var3;
    }

    private final k27 n() {
        return (k27) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    private final void q(k27 k27Var) {
        this.h.setValue(k27Var);
    }

    @Override // defpackage.fj3
    public void a(yv0 yv0Var) {
        this.j = yv0Var.b();
        this.k = Float.isNaN(this.c) ? dg4.d(f27.a(yv0Var, this.b, yv0Var.b())) : yv0Var.l0(this.c);
        long B = ((nn0) this.d.getValue()).B();
        float d = ((e27) this.e.getValue()).d();
        yv0Var.A1();
        f(yv0Var, this.c, B);
        ph0 c = yv0Var.i1().c();
        l();
        k27 n = n();
        if (n != null) {
            n.f(yv0Var.b(), this.k, B, d);
            n.draw(wd.d(c));
        }
    }

    @Override // androidx.compose.material.ripple.c
    public void b(e26 e26Var, CoroutineScope coroutineScope) {
        k27 b = m().b(this);
        b.b(e26Var, this.b, this.j, this.k, ((nn0) this.d.getValue()).B(), ((e27) this.e.getValue()).d(), this.l);
        q(b);
    }

    @Override // defpackage.ov6
    public void c() {
    }

    @Override // defpackage.ov6
    public void d() {
        k();
    }

    @Override // defpackage.ov6
    public void e() {
        k();
    }

    @Override // androidx.compose.material.ripple.c
    public void g(e26 e26Var) {
        k27 n = n();
        if (n != null) {
            n.e();
        }
    }

    public final void o() {
        q(null);
    }

    private AndroidRippleIndicationInstance(boolean z, float f, x08 x08Var, x08 x08Var2, ViewGroup viewGroup) {
        super(z, x08Var2);
        this.b = z;
        this.c = f;
        this.d = x08Var;
        this.e = x08Var2;
        this.f = viewGroup;
        this.h = b0.e(null, null, 2, null);
        this.i = b0.e(Boolean.TRUE, null, 2, null);
        this.j = zt7.b.b();
        this.k = -1;
        this.l = new qs2() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m46invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m46invoke() {
                boolean l;
                AndroidRippleIndicationInstance androidRippleIndicationInstance = AndroidRippleIndicationInstance.this;
                l = androidRippleIndicationInstance.l();
                androidRippleIndicationInstance.p(!l);
            }
        };
    }
}
