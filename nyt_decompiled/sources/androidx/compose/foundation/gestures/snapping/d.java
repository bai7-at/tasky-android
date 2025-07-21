package androidx.compose.foundation.gestures.snapping;

import defpackage.by0;
import defpackage.gi;
import defpackage.oc1;
import defpackage.qc7;
import defpackage.ss2;

/* loaded from: classes.dex */
final class d implements b {
    private final oc1 a;

    public d(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(qc7 qc7Var, Object obj, Object obj2, ss2 ss2Var, by0 by0Var) {
        return b(qc7Var, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), ss2Var, by0Var);
    }

    public Object b(qc7 qc7Var, float f, float f2, ss2 ss2Var, by0 by0Var) {
        Object f3;
        f3 = SnapFlingBehaviorKt.f(qc7Var, f, gi.c(0.0f, f2, 0L, 0L, false, 28, null), this.a, ss2Var, by0Var);
        return f3 == kotlin.coroutines.intrinsics.a.h() ? f3 : (a) f3;
    }
}
