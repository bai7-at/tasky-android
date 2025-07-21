package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import com.comscore.streaming.ContentFeedType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$AnswerIndicator$1$1", f = "NewsQuizResult.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NewsQuizResultKt$AnswerIndicator$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<Boolean> $answers;
    final /* synthetic */ int $dotAnimDelayMillis;
    final /* synthetic */ int $startDelayMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsQuizResultKt$AnswerIndicator$1$1(int i, List list, int i2, by0 by0Var) {
        super(2, by0Var);
        this.$startDelayMillis = i;
        this.$answers = list;
        this.$dotAnimDelayMillis = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NewsQuizResultKt$AnswerIndicator$1$1(this.$startDelayMillis, this.$answers, this.$dotAnimDelayMillis, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            long size = this.$startDelayMillis + (this.$answers.size() * this.$dotAnimDelayMillis) + ContentFeedType.OTHER;
            this.label = 1;
            if (DelayKt.delay(size, this) == h) {
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
        return ((NewsQuizResultKt$AnswerIndicator$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
