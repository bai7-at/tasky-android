package com.nytimes.android.features.home.domain;

import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.features.home.data.GraphQLIdRetriever;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.home.domain.HomeUseCase$retrieveData$1", f = "HomeUseCase.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeUseCase$retrieveData$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ ParallelDownloadStrategy $strategy;
    int label;
    final /* synthetic */ HomeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeUseCase$retrieveData$1(HomeUseCase homeUseCase, ParallelDownloadStrategy parallelDownloadStrategy, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = homeUseCase;
        this.$strategy = parallelDownloadStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new HomeUseCase$retrieveData$1(this.this$0, this.$strategy, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((HomeUseCase$retrieveData$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GraphQLIdRetriever graphQLIdRetriever;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            graphQLIdRetriever = this.this$0.d;
            ParallelDownloadStrategy parallelDownloadStrategy = this.$strategy;
            this.label = 1;
            obj = graphQLIdRetriever.a(parallelDownloadStrategy, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
