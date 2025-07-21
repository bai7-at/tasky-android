package com.nytimes.android;

import com.nytimes.android.link.share.GiftShareViewModel;
import defpackage.by0;
import defpackage.cy4;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.SingleArticleActivity$SingleArticleScreen$3", f = "SingleArticleActivity.kt", l = {324}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$SingleArticleScreen$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ cy4 $giftShareRemaining;
    Object L$0;
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$SingleArticleScreen$3(cy4 cy4Var, SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.$giftShareRemaining = cy4Var;
        this.this$0 = singleArticleActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleArticleActivity$SingleArticleScreen$3(this.$giftShareRemaining, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GiftShareViewModel b1;
        cy4 cy4Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            cy4 cy4Var2 = this.$giftShareRemaining;
            b1 = this.this$0.b1();
            this.L$0 = cy4Var2;
            this.label = 1;
            Object f = b1.f(this);
            if (f == h) {
                return h;
            }
            obj = f;
            cy4Var = cy4Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cy4Var = (cy4) this.L$0;
            kotlin.f.b(obj);
        }
        cy4Var.f(((Number) obj).intValue());
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleArticleActivity$SingleArticleScreen$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
