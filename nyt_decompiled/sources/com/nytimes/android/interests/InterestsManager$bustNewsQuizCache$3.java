package com.nytimes.android.interests;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$bustNewsQuizCache$3", f = "InterestsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$bustNewsQuizCache$3 extends SuspendLambda implements gt2 {
    int label;

    InterestsManager$bustNewsQuizCache$3(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$bustNewsQuizCache$3(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.A("Unable to clear NewsQuiz server cache", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(Throwable th, by0 by0Var) {
        return ((InterestsManager$bustNewsQuizCache$3) create(th, by0Var)).invokeSuspend(ww8.a);
    }
}
