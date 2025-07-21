package com.skydoves.balloon.compose;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.skydoves.balloon.compose.BalloonKt$Balloon$3$1", f = "Balloon.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BalloonKt$Balloon$3$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ BalloonComposeView $balloonComposeView;
    final /* synthetic */ ss2 $onBalloonWindowInitialized;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalloonKt$Balloon$3$1(ss2 ss2Var, BalloonComposeView balloonComposeView, by0 by0Var) {
        super(2, by0Var);
        this.$onBalloonWindowInitialized = ss2Var;
        this.$balloonComposeView = balloonComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BalloonKt$Balloon$3$1(this.$onBalloonWindowInitialized, this.$balloonComposeView, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onBalloonWindowInitialized.invoke(this.$balloonComposeView);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BalloonKt$Balloon$3$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
