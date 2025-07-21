package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.ci;
import defpackage.jd;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.su1;
import defpackage.sy4;
import defpackage.t26;
import defpackage.uo6;
import defpackage.vu1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yx4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class AnchoredDraggableState {
    public static final a p = new a(null);
    private final ss2 a;
    private final qs2 b;
    private final ci c;
    private final ss2 d;
    private final InternalMutatorMutex e;
    private final vu1 f;
    private final sy4 g;
    private final x08 h;
    private final x08 i;
    private final yx4 j;
    private final x08 k;
    private final yx4 l;
    private final sy4 m;
    private final sy4 n;
    private final jd o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements jd {
        b() {
        }

        @Override // defpackage.jd
        public void a(float f, float f2) {
            AnchoredDraggableState.this.E(f);
            AnchoredDraggableState.this.D(f2);
        }
    }

    public AnchoredDraggableState(Object obj, ss2 ss2Var, qs2 qs2Var, ci ciVar, ss2 ss2Var2) {
        k h;
        this.a = ss2Var;
        this.b = qs2Var;
        this.c = ciVar;
        this.d = ss2Var2;
        this.e = new InternalMutatorMutex();
        this.f = new AnchoredDraggableState$draggableState$1(this);
        this.g = b0.e(obj, null, 2, null);
        this.h = y.d(new qs2() { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Object s;
                s = AnchoredDraggableState.this.s();
                if (s != null) {
                    return s;
                }
                AnchoredDraggableState anchoredDraggableState = AnchoredDraggableState.this;
                float v = anchoredDraggableState.v();
                return !Float.isNaN(v) ? anchoredDraggableState.l(v, anchoredDraggableState.r(), 0.0f) : anchoredDraggableState.r();
            }
        });
        this.i = y.d(new qs2() { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Object s;
                s = AnchoredDraggableState.this.s();
                if (s != null) {
                    return s;
                }
                AnchoredDraggableState anchoredDraggableState = AnchoredDraggableState.this;
                float v = anchoredDraggableState.v();
                return !Float.isNaN(v) ? anchoredDraggableState.m(v, anchoredDraggableState.r()) : anchoredDraggableState.r();
            }
        });
        this.j = t26.a(Float.NaN);
        this.k = y.e(y.q(), new qs2() { // from class: androidx.compose.material.AnchoredDraggableState$progress$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                float e = AnchoredDraggableState.this.n().e(AnchoredDraggableState.this.r());
                float e2 = AnchoredDraggableState.this.n().e(AnchoredDraggableState.this.p()) - e;
                float abs = Math.abs(e2);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float z = (AnchoredDraggableState.this.z() - e) / e2;
                    if (z < 1.0E-6f) {
                        f = 0.0f;
                    } else if (z <= 0.999999f) {
                        f = z;
                    }
                }
                return Float.valueOf(f);
            }
        });
        this.l = t26.a(0.0f);
        this.m = b0.e(null, null, 2, null);
        h = AnchoredDraggableKt.h();
        this.n = b0.e(h, null, 2, null);
        this.o = new b();
    }

    private final void A(su1 su1Var) {
        this.n.setValue(su1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Object obj) {
        this.g.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Object obj) {
        this.m.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(float f) {
        this.l.r(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(float f) {
        this.j.r(f);
    }

    private final boolean G(final Object obj) {
        return this.e.e(new qs2() { // from class: androidx.compose.material.AnchoredDraggableState$trySnapTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m31invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
                jd jdVar;
                jdVar = AnchoredDraggableState.this.o;
                AnchoredDraggableState anchoredDraggableState = AnchoredDraggableState.this;
                Object obj2 = obj;
                float e = anchoredDraggableState.n().e(obj2);
                if (!Float.isNaN(e)) {
                    jd.b(jdVar, e, 0.0f, 2, null);
                    anchoredDraggableState.C(null);
                }
                anchoredDraggableState.B(obj2);
            }
        });
    }

    public static /* synthetic */ void I(AnchoredDraggableState anchoredDraggableState, su1 su1Var, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            if (Float.isNaN(anchoredDraggableState.v())) {
                obj = anchoredDraggableState.w();
            } else {
                obj = su1Var.b(anchoredDraggableState.v());
                if (obj == null) {
                    obj = anchoredDraggableState.w();
                }
            }
        }
        anchoredDraggableState.H(su1Var, obj);
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, kt2 kt2Var, by0 by0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(obj, mutatePriority, kt2Var, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(float f, Object obj, float f2) {
        Object a2;
        su1 n = n();
        float e = n.e(obj);
        float floatValue = ((Number) this.b.mo865invoke()).floatValue();
        if (e == f || Float.isNaN(e)) {
            return obj;
        }
        if (e < f) {
            if (f2 >= floatValue) {
                Object a3 = n.a(f, true);
                zq3.e(a3);
                return a3;
            }
            a2 = n.a(f, true);
            zq3.e(a2);
            if (f < Math.abs(e + Math.abs(((Number) this.a.invoke(Float.valueOf(Math.abs(n.e(a2) - e)))).floatValue()))) {
                return obj;
            }
        } else {
            if (f2 <= (-floatValue)) {
                Object a4 = n.a(f, false);
                zq3.e(a4);
                return a4;
            }
            a2 = n.a(f, false);
            zq3.e(a2);
            float abs = Math.abs(e - Math.abs(((Number) this.a.invoke(Float.valueOf(Math.abs(e - n.e(a2))))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return obj;
                }
            } else if (f > abs) {
                return obj;
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(float f, Object obj) {
        Object a2;
        su1 n = n();
        float e = n.e(obj);
        if (e == f || Float.isNaN(e)) {
            return obj;
        }
        if (e < f) {
            a2 = n.a(f, true);
            if (a2 == null) {
                return obj;
            }
        } else {
            a2 = n.a(f, false);
            if (a2 == null) {
                return obj;
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s() {
        return this.m.getValue();
    }

    public final Object F(float f, by0 by0Var) {
        Object r = r();
        Object l = l(z(), r, f);
        if (((Boolean) this.d.invoke(l)).booleanValue()) {
            Object f2 = AnchoredDraggableKt.f(this, l, f, by0Var);
            return f2 == kotlin.coroutines.intrinsics.a.h() ? f2 : ww8.a;
        }
        Object f3 = AnchoredDraggableKt.f(this, r, f, by0Var);
        return f3 == kotlin.coroutines.intrinsics.a.h() ? f3 : ww8.a;
    }

    public final void H(su1 su1Var, Object obj) {
        if (zq3.c(n(), su1Var)) {
            return;
        }
        A(su1Var);
        if (G(obj)) {
            return;
        }
        C(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(androidx.compose.foundation.MutatePriority r7, defpackage.it2 r8, defpackage.by0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.AnchoredDraggableState r6 = (androidx.compose.material.AnchoredDraggableState) r6
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L4f
        L2f:
            r7 = move-exception
            goto L86
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.f.b(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.e     // Catch: java.lang.Throwable -> L2f
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L2f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.label = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L4f
            return r1
        L4f:
            su1 r7 = r6.n()
            float r8 = r6.v()
            java.lang.Object r7 = r7.b(r8)
            if (r7 == 0) goto L83
            float r8 = r6.v()
            su1 r9 = r6.n()
            float r9 = r9.e(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L83
            ss2 r8 = r6.d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            r6.B(r7)
        L83:
            ww8 r6 = defpackage.ww8.a
            return r6
        L86:
            su1 r8 = r6.n()
            float r9 = r6.v()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto Lba
            float r9 = r6.v()
            su1 r0 = r6.n()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lba
            ss2 r9 = r6.d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lba
            r6.B(r8)
        Lba:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.i(androidx.compose.foundation.MutatePriority, it2, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r7, androidx.compose.foundation.MutatePriority r8, defpackage.kt2 r9, defpackage.by0 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.AnchoredDraggableState r6 = (androidx.compose.material.AnchoredDraggableState) r6
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L59
        L30:
            r7 = move-exception
            goto L91
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.f.b(r10)
            su1 r10 = r6.n()
            boolean r10 = r10.c(r7)
            if (r10 == 0) goto Lc9
            androidx.compose.material.InternalMutatorMutex r10 = r6.e     // Catch: java.lang.Throwable -> L30
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L30
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L30
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L30
            r0.label = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L59
            return r1
        L59:
            r6.C(r5)
            su1 r7 = r6.n()
            float r8 = r6.v()
            java.lang.Object r7 = r7.b(r8)
            if (r7 == 0) goto Lcc
            float r8 = r6.v()
            su1 r9 = r6.n()
            float r9 = r9.e(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Lcc
            ss2 r8 = r6.d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lcc
            r6.B(r7)
            goto Lcc
        L91:
            r6.C(r5)
            su1 r8 = r6.n()
            float r9 = r6.v()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto Lc8
            float r9 = r6.v()
            su1 r10 = r6.n()
            float r10 = r10.e(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lc8
            ss2 r9 = r6.d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc8
            r6.B(r8)
        Lc8:
            throw r7
        Lc9:
            r6.B(r7)
        Lcc:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.j(java.lang.Object, androidx.compose.foundation.MutatePriority, kt2, by0):java.lang.Object");
    }

    public final su1 n() {
        return (su1) this.n.getValue();
    }

    public final ci o() {
        return this.c;
    }

    public final Object p() {
        return this.i.getValue();
    }

    public final ss2 q() {
        return this.d;
    }

    public final Object r() {
        return this.g.getValue();
    }

    public final vu1 t() {
        return this.f;
    }

    public final float u() {
        return this.l.a();
    }

    public final float v() {
        return this.j.a();
    }

    public final Object w() {
        return this.h.getValue();
    }

    public final boolean x() {
        return s() != null;
    }

    public final float y(float f) {
        return uo6.l((Float.isNaN(v()) ? 0.0f : v()) + f, n().d(), n().f());
    }

    public final float z() {
        if (Float.isNaN(v())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return v();
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, su1 su1Var, ss2 ss2Var, qs2 qs2Var, ci ciVar, ss2 ss2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, su1Var, ss2Var, qs2Var, ciVar, (i & 32) != 0 ? new ss2() { // from class: androidx.compose.material.AnchoredDraggableState.2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : ss2Var2);
    }

    public AnchoredDraggableState(Object obj, su1 su1Var, ss2 ss2Var, qs2 qs2Var, ci ciVar, ss2 ss2Var2) {
        this(obj, ss2Var, qs2Var, ciVar, ss2Var2);
        A(su1Var);
        G(obj);
    }
}
