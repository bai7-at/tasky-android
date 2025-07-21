package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import defpackage.bo3;
import defpackage.ci;
import defpackage.e27;
import defpackage.f27;
import defpackage.fv1;
import defpackage.gh;
import defpackage.ka3;
import defpackage.l27;
import defpackage.la3;
import defpackage.nn0;
import defpackage.nu1;
import defpackage.ou1;
import defpackage.pu1;
import defpackage.ql0;
import defpackage.sl2;
import defpackage.tl2;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class StateLayer {
    private final boolean a;
    private final x08 b;
    private final Animatable c = gh.b(0.0f, 0.0f, 2, null);
    private final List d = new ArrayList();
    private bo3 e;

    public StateLayer(boolean z, x08 x08Var) {
        this.a = z;
        this.b = x08Var;
    }

    public final void b(fv1 fv1Var, float f, long j) {
        float a = Float.isNaN(f) ? f27.a(fv1Var, this.a, fv1Var.b()) : fv1Var.f1(f);
        float floatValue = ((Number) this.c.m()).floatValue();
        if (floatValue > 0.0f) {
            long r = nn0.r(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.a) {
                fv1.K(fv1Var, r, a, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float i = zt7.i(fv1Var.b());
            float g = zt7.g(fv1Var.b());
            int b = ql0.a.b();
            zu1 i1 = fv1Var.i1();
            long b2 = i1.b();
            i1.c().t();
            i1.a().b(0.0f, 0.0f, i, g, b);
            fv1.K(fv1Var, r, a, 0L, 0.0f, null, null, 0, 124, null);
            i1.c().k();
            i1.d(b2);
        }
    }

    public final void c(bo3 bo3Var, CoroutineScope coroutineScope) {
        ci d;
        ci c;
        boolean z = bo3Var instanceof ka3;
        if (z) {
            this.d.add(bo3Var);
        } else if (bo3Var instanceof la3) {
            this.d.remove(((la3) bo3Var).a());
        } else if (bo3Var instanceof sl2) {
            this.d.add(bo3Var);
        } else if (bo3Var instanceof tl2) {
            this.d.remove(((tl2) bo3Var).a());
        } else if (bo3Var instanceof ou1) {
            this.d.add(bo3Var);
        } else if (bo3Var instanceof pu1) {
            this.d.remove(((pu1) bo3Var).a());
        } else if (!(bo3Var instanceof nu1)) {
            return;
        } else {
            this.d.remove(((nu1) bo3Var).a());
        }
        bo3 bo3Var2 = (bo3) i.y0(this.d);
        if (zq3.c(this.e, bo3Var2)) {
            return;
        }
        if (bo3Var2 != null) {
            float c2 = z ? ((e27) this.b.getValue()).c() : bo3Var instanceof sl2 ? ((e27) this.b.getValue()).b() : bo3Var instanceof ou1 ? ((e27) this.b.getValue()).a() : 0.0f;
            c = l27.c(bo3Var2);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new StateLayer$handleInteraction$1(this, c2, c, null), 3, null);
        } else {
            d = l27.d(this.e);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new StateLayer$handleInteraction$2(this, d, null), 3, null);
        }
        this.e = bo3Var2;
    }
}
