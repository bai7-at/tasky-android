package com.nytimes.android.latestfeed.feed.rx;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ub2;
import defpackage.ww8;
import io.reactivex.Single;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.latestfeed.feed.rx.FeedParseFunc$apply$2$1", f = "FeedParseFunc.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedParseFunc$apply$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ub2 $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedParseFunc$apply$2$1(ub2 ub2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_run = ub2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedParseFunc$apply$2$1(this.$this_run, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Single a = this.$this_run.a();
            this.label = 1;
            if (RxAwaitKt.await(a, this) == h) {
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
        return ((FeedParseFunc$apply$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
