package androidx.compose.foundation.gestures.snapping;

import defpackage.by0;
import defpackage.ci;
import defpackage.gi;
import defpackage.qc7;
import defpackage.ss2;

/* loaded from: classes.dex */
final class f implements b {
    private final ci a;

    public f(ci ciVar) {
        this.a = ciVar;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(qc7 qc7Var, Object obj, Object obj2, ss2 ss2Var, by0 by0Var) {
        return b(qc7Var, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), ss2Var, by0Var);
    }

    public Object b(qc7 qc7Var, float f, float f2, ss2 ss2Var, by0 by0Var) {
        Object h;
        h = SnapFlingBehaviorKt.h(qc7Var, Math.abs(f) * Math.signum(f2), f, gi.c(0.0f, f2, 0L, 0L, false, 28, null), this.a, ss2Var, by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : (a) h;
    }
}
