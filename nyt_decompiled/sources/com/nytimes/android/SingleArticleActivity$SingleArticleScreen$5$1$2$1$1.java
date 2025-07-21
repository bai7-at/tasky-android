package com.nytimes.android;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.theathletic.AthleticViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$5$1$2$1$1", f = "SingleArticleActivity.kt", l = {359}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$SingleArticleScreen$5$1$2$1$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$SingleArticleScreen$5$1$2$1$1(SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleArticleActivity;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((SingleArticleActivity$SingleArticleScreen$5$1$2$1$1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleArticleActivity$SingleArticleScreen$5$1$2$1$1 singleArticleActivity$SingleArticleScreen$5$1$2$1$1 = new SingleArticleActivity$SingleArticleScreen$5$1$2$1$1(this.this$0, by0Var);
        singleArticleActivity$SingleArticleScreen$5$1$2$1$1.L$0 = obj;
        return singleArticleActivity$SingleArticleScreen$5$1$2$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AthleticViewModel Y0;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
            Y0 = this.this$0.Y0();
            this.label = 1;
            if (Y0.n(eT2CoroutineScope, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
