package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$Dot$1$1", f = "NewsQuizResult.kt", l = {276, 277, 281}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NewsQuizResultKt$Dot$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $delayMillis;
    final /* synthetic */ sy4 $isAnimationPlayed$delegate;
    final /* synthetic */ boolean $isCorrect;
    final /* synthetic */ sy4 $shouldAnimate$delegate;
    final /* synthetic */ int $startDelayMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsQuizResultKt$Dot$1$1(int i, int i2, boolean z, sy4 sy4Var, sy4 sy4Var2, by0 by0Var) {
        super(2, by0Var);
        this.$startDelayMillis = i;
        this.$delayMillis = i2;
        this.$isCorrect = z;
        this.$isAnimationPlayed$delegate = sy4Var;
        this.$shouldAnimate$delegate = sy4Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NewsQuizResultKt$Dot$1$1(this.$startDelayMillis, this.$delayMillis, this.$isCorrect, this.$isAnimationPlayed$delegate, this.$shouldAnimate$delegate, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r8)
            goto L59
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            kotlin.f.b(r8)
            goto L40
        L21:
            kotlin.f.b(r8)
            goto L34
        L25:
            kotlin.f.b(r8)
            int r8 = r7.$startDelayMillis
            long r5 = (long) r8
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
            if (r8 != r0) goto L34
            return r0
        L34:
            int r8 = r7.$delayMillis
            long r5 = (long) r8
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
            if (r8 != r0) goto L40
            return r0
        L40:
            sy4 r8 = r7.$isAnimationPlayed$delegate
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.q(r8, r4)
            boolean r8 = r7.$isCorrect
            if (r8 == 0) goto L5f
            sy4 r8 = r7.$shouldAnimate$delegate
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.r(r8, r4)
            r7.label = r2
            r1 = 100
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r1, r7)
            if (r8 != r0) goto L59
            return r0
        L59:
            sy4 r7 = r7.$shouldAnimate$delegate
            r8 = 0
            com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.r(r7, r8)
        L5f:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$Dot$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NewsQuizResultKt$Dot$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
