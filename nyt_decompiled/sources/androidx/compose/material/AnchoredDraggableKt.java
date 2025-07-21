package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import defpackage.by0;
import defpackage.dy4;
import defpackage.ss2;
import defpackage.su1;
import defpackage.uu1;
import defpackage.ww8;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class AnchoredDraggableKt {
    public static final su1 a(ss2 ss2Var) {
        uu1 uu1Var = new uu1();
        ss2Var.invoke(uu1Var);
        return new k(uu1Var.b());
    }

    public static final Modifier d(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, dy4 dy4Var, boolean z3) {
        Modifier j;
        j = DraggableKt.j(modifier, anchoredDraggableState.t(), orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : dy4Var, (r20 & 16) != 0 ? false : z3, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), (r20 & 128) != 0 ? false : z2);
        return j;
    }

    public static /* synthetic */ Modifier e(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, dy4 dy4Var, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            dy4Var = null;
        }
        dy4 dy4Var2 = dy4Var;
        if ((i & 32) != 0) {
            z3 = anchoredDraggableState.x();
        }
        return d(modifier, anchoredDraggableState, orientation, z4, z5, dy4Var2, z3);
    }

    public static final Object f(AnchoredDraggableState anchoredDraggableState, Object obj, float f, by0 by0Var) {
        Object k = AnchoredDraggableState.k(anchoredDraggableState, obj, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), by0Var, 2, null);
        return k == kotlin.coroutines.intrinsics.a.h() ? k : ww8.a;
    }

    public static /* synthetic */ Object g(AnchoredDraggableState anchoredDraggableState, Object obj, float f, by0 by0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.u();
        }
        return f(anchoredDraggableState, obj, f, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h() {
        return new k(t.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.qs2 r4, defpackage.gt2 r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            androidx.compose.material.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.i(qs2, gt2, by0):java.lang.Object");
    }
}
