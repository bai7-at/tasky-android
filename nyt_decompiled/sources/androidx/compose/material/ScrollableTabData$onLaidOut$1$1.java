package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import defpackage.by0;
import defpackage.ci;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {479}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ ScrollableTabData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = scrollableTabData;
        this.$calculatedOffset = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollState scrollState;
        ci ciVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            scrollState = this.this$0.a;
            int i2 = this.$calculatedOffset;
            ciVar = TabRowKt.b;
            this.label = 1;
            if (scrollState.k(i2, ciVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ScrollableTabData$onLaidOut$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
