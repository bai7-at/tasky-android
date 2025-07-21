package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.b0;
import defpackage.by0;
import defpackage.cg4;
import defpackage.f27;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.gh;
import defpackage.hd5;
import defpackage.nn0;
import defpackage.ql0;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class RippleAnimation {
    private fd5 a;
    private final float b;
    private final boolean c;
    private Float d;
    private Float e;
    private fd5 f;
    private final Animatable g;
    private final Animatable h;
    private final Animatable i;
    private final CompletableDeferred j;
    private final sy4 k;
    private final sy4 l;

    public /* synthetic */ RippleAnimation(fd5 fd5Var, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fd5Var, f, z);
    }

    private final Object f(by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeIn$2(this, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    private final Object g(by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeOut$2(this, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    private final boolean i() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final void k(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    private final void l(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r7)
            goto L71
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r6 = (androidx.compose.material.ripple.RippleAnimation) r6
            kotlin.f.b(r7)
            goto L65
        L3f:
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r6 = (androidx.compose.material.ripple.RippleAnimation) r6
            kotlin.f.b(r7)
            goto L55
        L47:
            kotlin.f.b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r6.l(r5)
            kotlinx.coroutines.CompletableDeferred r7 = r6.j
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L71
            return r1
        L71:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.d(by0):java.lang.Object");
    }

    public final void e(fv1 fv1Var, long j) {
        if (this.d == null) {
            this.d = Float.valueOf(f27.b(fv1Var.b()));
        }
        if (this.e == null) {
            this.e = Float.isNaN(this.b) ? Float.valueOf(f27.a(fv1Var, this.c, fv1Var.b())) : Float.valueOf(fv1Var.f1(this.b));
        }
        if (this.a == null) {
            this.a = fd5.d(fv1Var.t1());
        }
        if (this.f == null) {
            this.f = fd5.d(hd5.a(zt7.i(fv1Var.b()) / 2.0f, zt7.g(fv1Var.b()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? ((Number) this.g.m()).floatValue() : 1.0f;
        Float f = this.d;
        zq3.e(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.e;
        zq3.e(f2);
        float a = cg4.a(floatValue2, f2.floatValue(), ((Number) this.h.m()).floatValue());
        fd5 fd5Var = this.a;
        zq3.e(fd5Var);
        float o = fd5.o(fd5Var.x());
        fd5 fd5Var2 = this.f;
        zq3.e(fd5Var2);
        float a2 = cg4.a(o, fd5.o(fd5Var2.x()), ((Number) this.i.m()).floatValue());
        fd5 fd5Var3 = this.a;
        zq3.e(fd5Var3);
        float p = fd5.p(fd5Var3.x());
        fd5 fd5Var4 = this.f;
        zq3.e(fd5Var4);
        long a3 = hd5.a(a2, cg4.a(p, fd5.p(fd5Var4.x()), ((Number) this.i.m()).floatValue()));
        long r = nn0.r(j, nn0.u(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.c) {
            fv1.K(fv1Var, r, a, a3, 0.0f, null, null, 0, 120, null);
            return;
        }
        float i = zt7.i(fv1Var.b());
        float g = zt7.g(fv1Var.b());
        int b = ql0.a.b();
        zu1 i1 = fv1Var.i1();
        long b2 = i1.b();
        i1.c().t();
        i1.a().b(0.0f, 0.0f, i, g, b);
        fv1.K(fv1Var, r, a, a3, 0.0f, null, null, 0, 120, null);
        i1.c().k();
        i1.d(b2);
    }

    public final void h() {
        k(true);
        this.j.complete(ww8.a);
    }

    private RippleAnimation(fd5 fd5Var, float f, boolean z) {
        this.a = fd5Var;
        this.b = f;
        this.c = z;
        this.g = gh.b(0.0f, 0.0f, 2, null);
        this.h = gh.b(0.0f, 0.0f, 2, null);
        this.i = gh.b(0.0f, 0.0f, 2, null);
        this.j = CompletableDeferredKt.CompletableDeferred((Job) null);
        Boolean bool = Boolean.FALSE;
        this.k = b0.e(bool, null, 2, null);
        this.l = b0.e(bool, null, 2, null);
    }
}
