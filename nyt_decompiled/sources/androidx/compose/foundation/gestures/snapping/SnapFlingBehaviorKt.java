package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.comscore.streaming.WindowState;
import defpackage.bi;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cz7;
import defpackage.di;
import defpackage.dw7;
import defpackage.fm1;
import defpackage.oc1;
import defpackage.qc7;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.xx1;

/* loaded from: classes.dex */
public abstract class SnapFlingBehaviorKt {
    private static final float a = bu1.g(WindowState.NORMAL);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(final defpackage.qc7 r5, final float r6, defpackage.fi r7, defpackage.oc1 r8, final defpackage.ss2 r9, defpackage.by0 r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref$FloatRef) r5
            java.lang.Object r7 = r0.L$0
            fi r7 = (defpackage.fi) r7
            kotlin.f.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.f.b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.t()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.h(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            androidx.compose.foundation.gestures.snapping.a r8 = new androidx.compose.foundation.gestures.snapping.a
            float r5 = r5.element
            float r6 = r6 - r5
            java.lang.Float r5 = defpackage.cc0.b(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f(qc7, float, fi, oc1, ss2, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(bi biVar, qc7 qc7Var, ss2 ss2Var, float f) {
        float a2 = qc7Var.a(f);
        ss2Var.invoke(Float.valueOf(a2));
        if (Math.abs(f - a2) > 0.5f) {
            biVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(final defpackage.qc7 r12, float r13, final float r14, defpackage.fi r15, defpackage.ci r16, final defpackage.ss2 r17, defpackage.by0 r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.Ref$FloatRef r3 = (kotlin.jvm.internal.Ref$FloatRef) r3
            java.lang.Object r4 = r7.L$0
            fi r4 = (defpackage.fi) r4
            kotlin.f.b(r0)
            r10 = r2
            r0 = r4
            goto L90
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.f.b(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            java.lang.Object r2 = r15.t()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = defpackage.cc0.b(r13)
            java.lang.Object r2 = r15.t()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r5 = r2 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>()
            r9 = r15
            r7.L$0 = r9
            r7.L$1 = r0
            r10 = r13
            r7.F$0 = r10
            r7.F$1 = r8
            r7.label = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.j(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r3 = r0
            r1 = r8
            r0 = r9
        L90:
            java.lang.Object r2 = r0.t()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = l(r2, r1)
            androidx.compose.foundation.gestures.snapping.a r11 = new androidx.compose.foundation.gestures.snapping.a
            float r1 = r3.element
            float r10 = r10 - r1
            java.lang.Float r10 = defpackage.cc0.b(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            fi r0 = defpackage.gi.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.h(qc7, float, float, fi, ci, ss2, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(qc7 qc7Var, float f, float f2, b bVar, ss2 ss2Var, by0 by0Var) {
        return bVar.a(qc7Var, cc0.b(f), cc0.b(f2), ss2Var, by0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r4)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float j(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.c$a r0 = androidx.compose.foundation.gestures.snapping.c.a
            int r1 = r0.a()
            boolean r1 = androidx.compose.foundation.gestures.snapping.c.e(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1a
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            goto L24
        L1a:
            int r1 = r0.b()
            boolean r1 = androidx.compose.foundation.gestures.snapping.c.e(r3, r1)
            if (r1 == 0) goto L26
        L24:
            r4 = r5
            goto L32
        L26:
            int r5 = r0.c()
            boolean r3 = androidx.compose.foundation.gestures.snapping.c.e(r3, r5)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r4 = r2
        L32:
            boolean r3 = k(r4)
            if (r3 == 0) goto L39
            r2 = r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.j(int, float, float):float");
    }

    private static final boolean k(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? uo6.h(f, f2) : uo6.c(f, f2);
    }

    public static final float m() {
        return a;
    }

    public static final SnapFlingBehavior n(dw7 dw7Var, Composer composer, int i) {
        composer.z(-473984552);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:284)");
        }
        Object obj = (fm1) composer.m(CompositionLocalsKt.e());
        oc1 b = cz7.b(composer, 0);
        composer.z(1618982084);
        boolean S = composer.S(obj) | composer.S(dw7Var) | composer.S(b);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new SnapFlingBehavior(dw7Var, di.k(0, 0, xx1.d(), 3, null), b, di.i(0.0f, 400.0f, null, 5, null));
            composer.q(A);
        }
        composer.R();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return snapFlingBehavior;
    }
}
