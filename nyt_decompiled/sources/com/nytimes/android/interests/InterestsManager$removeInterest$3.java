package com.nytimes.android.interests;

import com.nytimes.android.interests.db.a;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$removeInterest$3", f = "InterestsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$removeInterest$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ a $interest;
    final /* synthetic */ qs2 $onError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$removeInterest$3(qs2 qs2Var, a aVar, by0 by0Var) {
        super(2, by0Var);
        this.$onError = qs2Var;
        this.$interest = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$removeInterest$3(this.$onError, this.$interest, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onError.mo865invoke();
        NYTLogger.A("Unable to remove interests %s", cc0.c(this.$interest.d()));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(Throwable th, by0 by0Var) {
        return ((InterestsManager$removeInterest$3) create(th, by0Var)).invokeSuspend(ww8.a);
    }
}
