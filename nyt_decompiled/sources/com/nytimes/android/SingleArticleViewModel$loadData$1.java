package com.nytimes.android;

import com.nytimes.android.SingleArticleViewModel;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.m;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.SingleArticleViewModel$loadData$1", f = "SingleArticleViewModel.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleViewModel$loadData$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SingleArticleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleViewModel$loadData$1(SingleArticleViewModel singleArticleViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleArticleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleArticleViewModel$loadData$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                mutableStateFlow2 = this.this$0.h;
                SingleArticleViewModel singleArticleViewModel = this.this$0;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, SingleArticleViewModel.a.b((SingleArticleViewModel.a) value2, DownloadState.Companion.b(((SingleArticleViewModel.a) singleArticleViewModel.getState().getValue()).c().a()), false, null, 6, null)));
                SingleArticleViewModel singleArticleViewModel2 = this.this$0;
                this.label = 1;
                obj = singleArticleViewModel2.r(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            m mVar = (m) obj;
            DownloadState dVar = mVar instanceof m.f ? new DownloadState.d(mVar) : new DownloadState.e(mVar);
            mutableStateFlow3 = this.this$0.h;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, SingleArticleViewModel.a.b((SingleArticleViewModel.a) value3, dVar, false, null, 6, null)));
            this.this$0.w(!(mVar instanceof m.g));
        } catch (Exception e) {
            mutableStateFlow = this.this$0.h;
            SingleArticleViewModel singleArticleViewModel3 = this.this$0;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, SingleArticleViewModel.a.b((SingleArticleViewModel.a) value, DownloadState.Companion.a(((SingleArticleViewModel.a) singleArticleViewModel3.getState().getValue()).c().a(), e), false, null, 6, null)));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleArticleViewModel$loadData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
