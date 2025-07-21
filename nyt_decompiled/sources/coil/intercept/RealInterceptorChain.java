package coil.intercept;

import defpackage.au7;
import defpackage.d42;
import defpackage.vg3;
import defpackage.xa5;
import defpackage.yo3;
import java.util.List;

/* loaded from: classes.dex */
public final class RealInterceptorChain implements yo3.a {
    private final vg3 a;
    private final List b;
    private final int c;
    private final vg3 d;
    private final au7 e;
    private final d42 f;
    private final boolean g;

    public RealInterceptorChain(vg3 vg3Var, List list, int i, vg3 vg3Var2, au7 au7Var, d42 d42Var, boolean z) {
        this.a = vg3Var;
        this.b = list;
        this.c = i;
        this.d = vg3Var2;
        this.e = au7Var;
        this.f = d42Var;
        this.g = z;
    }

    private final void b(vg3 vg3Var, yo3 yo3Var) {
        if (vg3Var.l() != this.a.l()) {
            throw new IllegalStateException(("Interceptor '" + yo3Var + "' cannot modify the request's context.").toString());
        }
        if (vg3Var.m() == xa5.a) {
            throw new IllegalStateException(("Interceptor '" + yo3Var + "' cannot set the request's data to null.").toString());
        }
        if (vg3Var.M() != this.a.M()) {
            throw new IllegalStateException(("Interceptor '" + yo3Var + "' cannot modify the request's target.").toString());
        }
        if (vg3Var.z() != this.a.z()) {
            throw new IllegalStateException(("Interceptor '" + yo3Var + "' cannot modify the request's lifecycle.").toString());
        }
        if (vg3Var.K() == this.a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + yo3Var + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final RealInterceptorChain d(int i, vg3 vg3Var, au7 au7Var) {
        return new RealInterceptorChain(this.a, this.b, i, vg3Var, au7Var, this.f, this.g);
    }

    static /* synthetic */ RealInterceptorChain e(RealInterceptorChain realInterceptorChain, int i, vg3 vg3Var, au7 au7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        if ((i2 & 2) != 0) {
            vg3Var = realInterceptorChain.c();
        }
        if ((i2 & 4) != 0) {
            au7Var = realInterceptorChain.a();
        }
        return realInterceptorChain.d(i, vg3Var, au7Var);
    }

    @Override // yo3.a
    public au7 a() {
        return this.e;
    }

    @Override // yo3.a
    public vg3 c() {
        return this.d;
    }

    public final d42 f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.vg3 r12, defpackage.by0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r13
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.L$1
            yo3 r11 = (defpackage.yo3) r11
            java.lang.Object r12 = r0.L$0
            coil.intercept.RealInterceptorChain r12 = (coil.intercept.RealInterceptorChain) r12
            kotlin.f.b(r13)
            r10 = r13
            r13 = r11
            r11 = r12
            r12 = r10
            goto L74
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.f.b(r13)
            int r13 = r11.c
            if (r13 <= 0) goto L50
            java.util.List r2 = r11.b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            yo3 r13 = (defpackage.yo3) r13
            r11.b(r12, r13)
        L50:
            java.util.List r13 = r11.b
            int r2 = r11.c
            java.lang.Object r13 = r13.get(r2)
            yo3 r13 = (defpackage.yo3) r13
            int r2 = r11.c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            coil.intercept.RealInterceptorChain r12 = e(r4, r5, r6, r7, r8, r9)
            r0.L$0 = r11
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L74
            return r1
        L74:
            xg3 r12 = (defpackage.xg3) r12
            vg3 r0 = r12.b()
            r11.b(r0, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.h(vg3, by0):java.lang.Object");
    }
}
