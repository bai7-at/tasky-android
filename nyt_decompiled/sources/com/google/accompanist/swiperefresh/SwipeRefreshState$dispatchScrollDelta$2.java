package com.google.accompanist.swiperefresh;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$dispatchScrollDelta$2", f = "SwipeRefresh.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwipeRefreshState$dispatchScrollDelta$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ float $delta;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshState$dispatchScrollDelta$2(SwipeRefreshState swipeRefreshState, float f, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = swipeRefreshState;
        this.$delta = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SwipeRefreshState$dispatchScrollDelta$2(this.this$0, this.$delta, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SwipeRefreshState$dispatchScrollDelta$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Animatable animatable2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            animatable = this.this$0.a;
            animatable2 = this.this$0.a;
            Float b = cc0.b(((Number) animatable2.m()).floatValue() + this.$delta);
            this.label = 1;
            if (animatable.t(b, this) == h) {
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
}
