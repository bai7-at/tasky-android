package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$2", f = "SingleArticleActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$SingleArticleScreen$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$SingleArticleScreen$2(SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleArticleActivity;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Map map, by0 by0Var) {
        return ((SingleArticleActivity$SingleArticleScreen$2) create(map, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleArticleActivity$SingleArticleScreen$2 singleArticleActivity$SingleArticleScreen$2 = new SingleArticleActivity$SingleArticleScreen$2(this.this$0, by0Var);
        singleArticleActivity$SingleArticleScreen$2.L$0 = obj;
        return singleArticleActivity$SingleArticleScreen$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleArticleViewModel q1;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        Map map = (Map) this.L$0;
        q1 = this.this$0.q1();
        q1.i().setValue(map);
        return ww8.a;
    }
}
