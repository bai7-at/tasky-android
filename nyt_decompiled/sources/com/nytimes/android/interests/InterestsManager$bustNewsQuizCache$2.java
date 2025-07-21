package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yj;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$2", f = "InterestsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$bustNewsQuizCache$2 extends SuspendLambda implements gt2 {
    int label;

    InterestsManager$bustNewsQuizCache$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yj yjVar, by0 by0Var) {
        return ((InterestsManager$bustNewsQuizCache$2) create(yjVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$bustNewsQuizCache$2(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
