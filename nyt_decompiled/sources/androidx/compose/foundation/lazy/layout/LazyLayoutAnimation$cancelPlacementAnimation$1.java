package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.vm3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1", f = "LazyLayoutAnimation.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyLayoutAnimation$cancelPlacementAnimation$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutAnimation$cancelPlacementAnimation$1(LazyLayoutAnimation lazyLayoutAnimation, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lazyLayoutAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyLayoutAnimation$cancelPlacementAnimation$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            animatable = this.this$0.g;
            vm3 b = vm3.b(vm3.b.a());
            this.label = 1;
            if (animatable.t(b, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.this$0.v(vm3.b.a());
        this.this$0.u(false);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyLayoutAnimation$cancelPlacementAnimation$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
