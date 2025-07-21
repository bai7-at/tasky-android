package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.SuspendAnimationKt;
import defpackage.by0;
import defpackage.cc0;
import defpackage.di;
import defpackage.fc1;
import defpackage.fi;
import defpackage.gt2;
import defpackage.qz7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", f = "LazyListState.kt", l = {504}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyListState$updateScrollDeltaForPostLookahead$2$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$updateScrollDeltaForPostLookahead$2$2(LazyListState lazyListState, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fi fiVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            fiVar = this.this$0.A;
            Float b = cc0.b(0.0f);
            qz7 i2 = di.i(0.0f, 400.0f, cc0.b(0.5f), 1, null);
            this.label = 1;
            if (SuspendAnimationKt.k(fiVar, b, i2, true, null, this, 8, null) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyListState$updateScrollDeltaForPostLookahead$2$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
