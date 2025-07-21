package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.b0;
import defpackage.by0;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc7;
import defpackage.ww8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
final class DefaultScrollableState implements tc7 {
    private final ss2 a;
    private final qc7 b = new a();
    private final MutatorMutex c = new MutatorMutex();
    private final sy4 d = b0.e(Boolean.FALSE, null, 2, null);

    public static final class a implements qc7 {
        a() {
        }

        @Override // defpackage.qc7
        public float a(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            return ((Number) DefaultScrollableState.this.j().invoke(Float.valueOf(f))).floatValue();
        }
    }

    public DefaultScrollableState(ss2 ss2Var) {
        this.a = ss2Var;
    }

    @Override // defpackage.tc7
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultScrollableState$scroll$2(this, mutatePriority, gt2Var, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    @Override // defpackage.tc7
    public boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.tc7
    public float f(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    public final ss2 j() {
        return this.a;
    }
}
