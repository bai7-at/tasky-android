package androidx.compose.foundation.gestures;

import defpackage.c26;
import defpackage.fm1;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
final class PressGestureScopeImpl implements c26, fm1 {
    private final /* synthetic */ fm1 a;
    private boolean b;
    private boolean c;
    private final Mutex d = MutexKt.Mutex(false);

    public PressGestureScopeImpl(fm1 fm1Var) {
        this.a = fm1Var;
    }

    @Override // defpackage.an2
    public long A(float f) {
        return this.a.A(f);
    }

    @Override // defpackage.fm1
    public long B(long j) {
        return this.a.B(j);
    }

    @Override // defpackage.an2
    public float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.fm1
    public long Q(float f) {
        return this.a.Q(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.c26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r5
            kotlin.f.b(r6)
            goto L4e
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.f.b(r6)
            boolean r6 = r5.b
            if (r6 != 0) goto L53
            boolean r6 = r5.c
            if (r6 != 0) goto L53
            kotlinx.coroutines.sync.Mutex r6 = r5.d
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            kotlinx.coroutines.sync.Mutex r6 = r5.d
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r6, r3, r4, r3)
        L53:
            boolean r5 = r5.b
            java.lang.Boolean r5 = defpackage.cc0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.U(by0):java.lang.Object");
    }

    @Override // defpackage.fm1
    public float X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.an2
    public float c1() {
        return this.a.c1();
    }

    public final void d() {
        this.c = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    public final void e() {
        this.b = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r4
            kotlin.f.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            kotlinx.coroutines.sync.Mutex r5 = r4.d
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r5 = 0
            r4.b = r5
            r4.c = r5
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.f(by0):java.lang.Object");
    }

    @Override // defpackage.fm1
    public float f1(float f) {
        return this.a.f1(f);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.fm1
    public int k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.fm1
    public int l0(float f) {
        return this.a.l0(f);
    }

    @Override // defpackage.fm1
    public float t0(long j) {
        return this.a.t0(j);
    }

    @Override // defpackage.fm1
    public float v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.fm1
    public long v1(long j) {
        return this.a.v1(j);
    }
}
