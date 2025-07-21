package com.nytimes.android.ribbon.destinations.greatreads;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher$store$2", f = "GreatReadsFetcher.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GreatReadsFetcher$store$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ GreatReadsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GreatReadsFetcher$store$2(GreatReadsFetcher greatReadsFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = greatReadsFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GreatReadsFetcher$store$2(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((GreatReadsFetcher$store$2) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            GreatReadsFetcher greatReadsFetcher = this.this$0;
            this.label = 1;
            obj = greatReadsFetcher.c(this);
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
