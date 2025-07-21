package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

@fc1(c = "com.nytimes.android.SingleArticleActivity$CharmBraceletBottomBar$2", f = "SingleArticleActivity.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$CharmBraceletBottomBar$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$CharmBraceletBottomBar$2(SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleArticleActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleArticleActivity$CharmBraceletBottomBar$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.label = 1;
            if (HandlerDispatcherKt.awaitFrame(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.this$0.Y();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleArticleActivity$CharmBraceletBottomBar$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
