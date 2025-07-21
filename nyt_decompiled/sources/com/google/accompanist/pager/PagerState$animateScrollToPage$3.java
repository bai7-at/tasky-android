package com.google.accompanist.pager;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.google.accompanist.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements gt2 {
    int label;

    PagerState$animateScrollToPage$3(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((PagerState$animateScrollToPage$3) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PagerState$animateScrollToPage$3(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
