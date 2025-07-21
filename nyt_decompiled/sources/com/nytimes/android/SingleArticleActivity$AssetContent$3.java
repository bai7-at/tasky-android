package com.nytimes.android;

import com.nytimes.android.m;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.SingleArticleActivity$AssetContent$3", f = "SingleArticleActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$AssetContent$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ m $content;
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$AssetContent$3(m mVar, SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.$content = mVar;
        this.this$0 = singleArticleActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleArticleActivity$AssetContent$3(this.$content, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        m mVar = this.$content;
        if (mVar instanceof m.e) {
            this.this$0.w1(((m.e) mVar).a());
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleArticleActivity$AssetContent$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
