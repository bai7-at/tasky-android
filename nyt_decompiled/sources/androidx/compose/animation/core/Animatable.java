package androidx.compose.animation.core;

import androidx.compose.runtime.b0;
import defpackage.by0;
import defpackage.ci;
import defpackage.fi;
import defpackage.gh;
import defpackage.hu8;
import defpackage.ii;
import defpackage.ji;
import defpackage.ki;
import defpackage.mi;
import defpackage.qz7;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yh;
import defpackage.zh;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class Animatable {
    private final hu8 a;
    private final Object b;
    private final String c;
    private final fi d;
    private final sy4 e;
    private final sy4 f;
    private final MutatorMutex g;
    private final qz7 h;
    private final mi i;
    private final mi j;
    private mi k;
    private mi l;

    public Animatable(Object obj, hu8 hu8Var, Object obj2, String str) {
        this.a = hu8Var;
        this.b = obj2;
        this.c = str;
        this.d = new fi(hu8Var, obj, null, 0L, 0L, false, 60, null);
        this.e = b0.e(Boolean.FALSE, null, 2, null);
        this.f = b0.e(obj, null, 2, null);
        this.g = new MutatorMutex();
        this.h = new qz7(0.0f, 0.0f, obj2, 3, null);
        mi o = o();
        mi miVar = o instanceof ii ? gh.e : o instanceof ji ? gh.f : o instanceof ki ? gh.g : gh.h;
        zq3.f(miVar, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.i = miVar;
        mi o2 = o();
        mi miVar2 = o2 instanceof ii ? gh.a : o2 instanceof ji ? gh.b : o2 instanceof ki ? gh.c : gh.d;
        zq3.f(miVar2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.j = miVar2;
        this.k = miVar;
        this.l = miVar2;
    }

    public static /* synthetic */ Object f(Animatable animatable, Object obj, ci ciVar, Object obj2, ss2 ss2Var, by0 by0Var, int i, Object obj3) {
        if ((i & 2) != 0) {
            ciVar = animatable.h;
        }
        ci ciVar2 = ciVar;
        if ((i & 4) != 0) {
            obj2 = animatable.n();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            ss2Var = null;
        }
        return animatable.e(obj, ciVar2, obj4, ss2Var, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Object obj) {
        if (zq3.c(this.k, this.i) && zq3.c(this.l, this.j)) {
            return obj;
        }
        mi miVar = (mi) this.a.a().invoke(obj);
        int b = miVar.b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (miVar.a(i) < this.k.a(i) || miVar.a(i) > this.l.a(i)) {
                miVar.e(i, uo6.l(miVar.a(i), this.k.a(i), this.l.a(i)));
                z = true;
            }
        }
        return z ? this.a.b().invoke(miVar) : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        fi fiVar = this.d;
        fiVar.A().d();
        fiVar.D(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(yh yhVar, Object obj, ss2 ss2Var, by0 by0Var) {
        return MutatorMutex.e(this.g, null, new Animatable$runAnimation$2(this, obj, yhVar, this.d.n(), ss2Var, null), by0Var, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Object obj) {
        this.f.setValue(obj);
    }

    public final Object e(Object obj, ci ciVar, Object obj2, ss2 ss2Var, by0 by0Var) {
        return q(zh.a(ciVar, this.a, m(), obj, obj2), obj2, ss2Var, by0Var);
    }

    public final x08 g() {
        return this.d;
    }

    public final fi j() {
        return this.d;
    }

    public final Object k() {
        return this.f.getValue();
    }

    public final hu8 l() {
        return this.a;
    }

    public final Object m() {
        return this.d.getValue();
    }

    public final Object n() {
        return this.a.b().invoke(o());
    }

    public final mi o() {
        return this.d.A();
    }

    public final boolean p() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final Object t(Object obj, by0 by0Var) {
        Object e = MutatorMutex.e(this.g, null, new Animatable$snapTo$2(this, obj, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    public final Object u(by0 by0Var) {
        Object e = MutatorMutex.e(this.g, null, new Animatable$stop$2(this, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    public /* synthetic */ Animatable(Object obj, hu8 hu8Var, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, hu8Var, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }
}
