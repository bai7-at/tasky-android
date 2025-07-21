package com.airbnb.lottie.compose;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.y;
import com.airbnb.lottie.LottieComposition;
import defpackage.by0;
import defpackage.lh4;
import defpackage.nj3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
final class LottieAnimatableImpl implements a {
    private final sy4 a;
    private final sy4 b;
    private final sy4 c;
    private final sy4 d;
    private final sy4 e;
    private final sy4 f;
    private final sy4 g;
    private final x08 h;
    private final sy4 i;
    private final sy4 j;
    private final sy4 k;
    private final sy4 l;
    private final x08 m;
    private final x08 n;
    private final MutatorMutex r;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.a = b0.e(bool, null, 2, null);
        this.b = b0.e(1, null, 2, null);
        this.c = b0.e(1, null, 2, null);
        this.d = b0.e(bool, null, 2, null);
        this.e = b0.e(null, null, 2, null);
        this.f = b0.e(Float.valueOf(1.0f), null, 2, null);
        this.g = b0.e(bool, null, 2, null);
        this.h = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                return Float.valueOf((LottieAnimatableImpl.this.m() && LottieAnimatableImpl.this.u() % 2 == 0) ? -LottieAnimatableImpl.this.q() : LottieAnimatableImpl.this.q());
            }
        });
        this.i = b0.e(null, null, 2, null);
        Float valueOf = Float.valueOf(0.0f);
        this.j = b0.e(valueOf, null, 2, null);
        this.k = b0.e(valueOf, null, 2, null);
        this.l = b0.e(Long.MIN_VALUE, null, 2, null);
        this.m = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                float f = 0.0f;
                if (LottieAnimatableImpl.this.v() != null) {
                    if (LottieAnimatableImpl.this.q() < 0.0f) {
                        LottieAnimatableImpl.this.w();
                    } else {
                        LottieAnimatableImpl.this.w();
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.n = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                boolean z;
                float K;
                if (LottieAnimatableImpl.this.u() == LottieAnimatableImpl.this.p()) {
                    float s = LottieAnimatableImpl.this.s();
                    K = LottieAnimatableImpl.this.K();
                    if (s == K) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        });
        this.r = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(final int i, by0 by0Var) {
        return i == Integer.MAX_VALUE ? nj3.a(new ss2() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean b(long j) {
                boolean P;
                P = LottieAnimatableImpl.this.P(i, j);
                return Boolean.valueOf(P);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).longValue());
            }
        }, by0Var) : m.c(new ss2() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean b(long j) {
                boolean P;
                P = LottieAnimatableImpl.this.P(i, j);
                return Boolean.valueOf(P);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).longValue());
            }
        }, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float K() {
        return ((Number) this.m.getValue()).floatValue();
    }

    private final float L() {
        return ((Number) this.h.getValue()).floatValue();
    }

    private final float N() {
        return ((Number) this.j.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P(int i, long j) {
        LottieComposition v = v();
        if (v == null) {
            return true;
        }
        long M = M() == Long.MIN_VALUE ? 0L : j - M();
        V(j);
        w();
        w();
        float d = ((M / 1000000) / v.d()) * L();
        float N = L() < 0.0f ? 0.0f - (N() + d) : (N() + d) - 1.0f;
        if (N < 0.0f) {
            c0(uo6.l(N(), 0.0f, 1.0f) + d);
        } else {
            float f = 1.0f - 0.0f;
            int i2 = (int) (N / f);
            int i3 = i2 + 1;
            if (u() + i3 > i) {
                c0(K());
                T(i);
                return false;
            }
            T(u() + i3);
            float f2 = N - (i2 * f);
            c0(L() < 0.0f ? 1.0f - f2 : 0.0f + f2);
        }
        return true;
    }

    private final float Q(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(LottieClipSpec lottieClipSpec) {
        this.e.setValue(lottieClipSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(LottieComposition lottieComposition) {
        this.i.setValue(lottieComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i) {
        this.c.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(long j) {
        this.l.setValue(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    private void X(float f) {
        this.k.setValue(Float.valueOf(f));
    }

    private final void Y(float f) {
        this.j.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(float f) {
        this.f.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(float f) {
        Y(f);
        if (O()) {
            f = Q(f, v());
        }
        X(f);
    }

    public long M() {
        return ((Number) this.l.getValue()).longValue();
    }

    public boolean O() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.a
    public Object i(LottieComposition lottieComposition, float f, int i, boolean z, by0 by0Var) {
        Object e = MutatorMutex.e(this.r, null, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, i, z, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    @Override // com.airbnb.lottie.compose.a
    public Object l(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, by0 by0Var) {
        Object e = MutatorMutex.e(this.r, null, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    @Override // defpackage.xb4
    public boolean m() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.xb4
    public int p() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // defpackage.xb4
    public float q() {
        return ((Number) this.f.getValue()).floatValue();
    }

    @Override // defpackage.xb4
    public float s() {
        return ((Number) this.k.getValue()).floatValue();
    }

    @Override // defpackage.xb4
    public int u() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // defpackage.xb4
    public LottieComposition v() {
        return (LottieComposition) this.i.getValue();
    }

    @Override // defpackage.xb4
    public LottieClipSpec w() {
        lh4.a(this.e.getValue());
        return null;
    }

    @Override // defpackage.x08
    public Float getValue() {
        return Float.valueOf(s());
    }
}
