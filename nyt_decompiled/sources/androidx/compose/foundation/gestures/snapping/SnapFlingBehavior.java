package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.ScrollableKt;
import defpackage.by0;
import defpackage.ci;
import defpackage.dw7;
import defpackage.oc1;
import defpackage.qc1;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zv4;

/* loaded from: classes.dex */
public final class SnapFlingBehavior implements qk2 {
    private final dw7 a;
    private final ci b;
    private final oc1 c;
    private final ci d;
    private zv4 e = ScrollableKt.g();

    public SnapFlingBehavior(dw7 dw7Var, ci ciVar, oc1 oc1Var, ci ciVar2) {
        this.a = dw7Var;
        this.b = ciVar;
        this.c = oc1Var;
        this.d = ciVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.qc7 r11, float r12, defpackage.ss2 r13, defpackage.by0 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r10 = r0.L$0
            r13 = r10
            ss2 r13 = (defpackage.ss2) r13
            kotlin.f.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.f.b(r14)
            zv4 r14 = r10.e
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.a) r14
            r10 = 0
            java.lang.Float r10 = defpackage.cc0.b(r10)
            r13.invoke(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.f(qc7, float, ss2, by0):java.lang.Object");
    }

    private final boolean g(float f, float f2) {
        return Math.abs(qc1.a(this.c, 0.0f, f2)) >= Math.abs(f);
    }

    private final Object i(qc7 qc7Var, float f, float f2, ss2 ss2Var, by0 by0Var) {
        Object i;
        i = SnapFlingBehaviorKt.i(qc7Var, f, f2, g(f, f2) ? new d(this.c) : new f(this.b), ss2Var, by0Var);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.qc7 r18, float r19, float r20, defpackage.ss2 r21, defpackage.by0 r22) {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r2 = r17
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r3 = r7.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.f.b(r0)
            goto L73
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.f.b(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            fi r0 = defpackage.gi.c(r8, r9, r10, r12, r14, r15, r16)
            goto L79
        L60:
            r7.label = r4
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.i(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L73
            return r1
        L73:
            androidx.compose.foundation.gestures.snapping.a r0 = (androidx.compose.foundation.gestures.snapping.a) r0
            fi r0 = r0.c()
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.j(qc7, float, float, ss2, by0):java.lang.Object");
    }

    @Override // defpackage.qk2
    public Object a(qc7 qc7Var, float f, by0 by0Var) {
        return h(qc7Var, f, new ss2() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$2
            public final void b(float f2) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).floatValue());
                return ww8.a;
            }
        }, by0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        return zq3.c(snapFlingBehavior.d, this.d) && zq3.c(snapFlingBehavior.c, this.c) && zq3.c(snapFlingBehavior.b, this.b) && zq3.c(snapFlingBehavior.a, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.qc7 r5, float r6, defpackage.ss2 r7, defpackage.by0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r8)
            r0.label = r3
            java.lang.Object r8 = r4.f(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.a r8 = (androidx.compose.foundation.gestures.snapping.a) r8
            java.lang.Object r4 = r8.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            fi r5 = r8.b()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r4 = r5.t()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L5d:
            java.lang.Float r4 = defpackage.cc0.b(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.h(qc7, float, ss2, by0):java.lang.Object");
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }
}
