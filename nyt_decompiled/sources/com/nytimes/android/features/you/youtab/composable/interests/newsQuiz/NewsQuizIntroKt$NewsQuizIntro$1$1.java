package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizIntroKt$NewsQuizIntro$1$1", f = "NewsQuizIntro.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NewsQuizIntroKt$NewsQuizIntro$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $sendBeginNewsQuizImpression;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsQuizIntroKt$NewsQuizIntro$1$1(qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$sendBeginNewsQuizImpression = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NewsQuizIntroKt$NewsQuizIntro$1$1(this.$sendBeginNewsQuizImpression, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$sendBeginNewsQuizImpression.mo865invoke();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NewsQuizIntroKt$NewsQuizIntro$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
