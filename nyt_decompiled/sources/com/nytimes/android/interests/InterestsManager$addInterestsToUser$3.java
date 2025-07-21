package com.nytimes.android.interests;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$addInterestsToUser$3", f = "InterestsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$addInterestsToUser$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $onError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$addInterestsToUser$3(qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$onError = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$addInterestsToUser$3(this.$onError, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onError.mo865invoke();
        NYTLogger.A("Unable to add interests", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(Throwable th, by0 by0Var) {
        return ((InterestsManager$addInterestsToUser$3) create(th, by0Var)).invokeSuspend(ww8.a);
    }
}
