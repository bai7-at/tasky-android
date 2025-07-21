package androidx.compose.material3;

import defpackage.by0;
import defpackage.ru1;
import defpackage.ss2;
import defpackage.tu1;
import defpackage.ww8;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class AnchoredDraggableKt {
    public static final ru1 a(ss2 ss2Var) {
        tu1 tu1Var = new tu1();
        ss2Var.invoke(tu1Var);
        return new c(tu1Var.b());
    }

    public static final Object d(AnchoredDraggableState anchoredDraggableState, Object obj, float f, by0 by0Var) {
        Object k = AnchoredDraggableState.k(anchoredDraggableState, obj, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), by0Var, 2, null);
        return k == kotlin.coroutines.intrinsics.a.h() ? k : ww8.a;
    }

    public static /* synthetic */ Object e(AnchoredDraggableState anchoredDraggableState, Object obj, float f, by0 by0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.v();
        }
        return d(anchoredDraggableState, obj, f, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c f() {
        return new c(t.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.qs2 r4, defpackage.gt2 r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            androidx.compose.material3.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableKt.g(qs2, gt2, by0):java.lang.Object");
    }
}
