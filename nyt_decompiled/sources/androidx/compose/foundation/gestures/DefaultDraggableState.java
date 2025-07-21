package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.by0;
import defpackage.gt2;
import defpackage.qu1;
import defpackage.ss2;
import defpackage.vu1;
import defpackage.ww8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
final class DefaultDraggableState implements vu1 {
    private final ss2 a;
    private final qu1 b = new a();
    private final MutatorMutex c = new MutatorMutex();

    public static final class a implements qu1 {
        a() {
        }

        @Override // defpackage.qu1
        public void c(float f) {
            DefaultDraggableState.this.e().invoke(Float.valueOf(f));
        }
    }

    public DefaultDraggableState(ss2 ss2Var) {
        this.a = ss2Var;
    }

    @Override // defpackage.vu1
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultDraggableState$drag$2(this, mutatePriority, gt2Var, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    public final ss2 e() {
        return this.a;
    }
}
