package com.nytimes.android.features.you.youtab.composable.interests.flashback;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.flashback.FlashbackInterestKt$FlashbackInterest$1$1", f = "FlashbackInterest.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlashbackInterestKt$FlashbackInterest$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $reloadFlashbackScore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashbackInterestKt$FlashbackInterest$1$1(qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$reloadFlashbackScore = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FlashbackInterestKt$FlashbackInterest$1$1(this.$reloadFlashbackScore, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$reloadFlashbackScore.mo865invoke();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FlashbackInterestKt$FlashbackInterest$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
