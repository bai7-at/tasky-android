package com.nytimes.android.fragment;

import androidx.compose.animation.core.Animatable;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.VerticalScrollStateKt$animateToolbarHeight$1", f = "VerticalScrollState.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class VerticalScrollStateKt$animateToolbarHeight$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Animatable $animatable;
    final /* synthetic */ kt2 $onNewTarget;
    final /* synthetic */ b $scrollState;
    final /* synthetic */ float $targetValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalScrollStateKt$animateToolbarHeight$1(kt2 kt2Var, b bVar, Animatable animatable, float f, by0 by0Var) {
        super(2, by0Var);
        this.$onNewTarget = kt2Var;
        this.$scrollState = bVar;
        this.$animatable = animatable;
        this.$targetValue = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new VerticalScrollStateKt$animateToolbarHeight$1(this.$onNewTarget, this.$scrollState, this.$animatable, this.$targetValue, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            kt2 kt2Var = this.$onNewTarget;
            b bVar = this.$scrollState;
            Animatable animatable = this.$animatable;
            Float b = cc0.b(this.$targetValue);
            this.label = 1;
            if (kt2Var.invoke(bVar, animatable, b, this) == h) {
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
        return ((VerticalScrollStateKt$animateToolbarHeight$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
