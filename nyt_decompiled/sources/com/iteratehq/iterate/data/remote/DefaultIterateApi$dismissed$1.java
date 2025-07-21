package com.iteratehq.iterate.data.remote;

import com.iteratehq.iterate.model.Survey;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;

@fc1(c = "com.iteratehq.iterate.data.remote.DefaultIterateApi$dismissed$1", f = "IterateApi.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultIterateApi$dismissed$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Survey $survey;
    int label;
    final /* synthetic */ DefaultIterateApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIterateApi$dismissed$1(Survey survey, DefaultIterateApi defaultIterateApi, by0 by0Var) {
        super(1, by0Var);
        this.$survey = survey;
        this.this$0 = defaultIterateApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new DefaultIterateApi$dismissed$1(this.$survey, this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((DefaultIterateApi$dismissed$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            String str = "/surveys/" + this.$survey.getId() + "/dismiss";
            DefaultIterateApi defaultIterateApi = this.this$0;
            Method method = Method.POST;
            Object obj2 = new Object();
            coroutineContext = defaultIterateApi.c;
            DefaultIterateApi$dismissed$1$invokeSuspend$$inlined$httpRequest$1 defaultIterateApi$dismissed$1$invokeSuspend$$inlined$httpRequest$1 = new DefaultIterateApi$dismissed$1$invokeSuspend$$inlined$httpRequest$1(defaultIterateApi, str, obj2, method, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineContext, defaultIterateApi$dismissed$1$invokeSuspend$$inlined$httpRequest$1, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        zq3.g(obj, "private suspend inline f…        }\n        }\n    }");
        return obj;
    }
}
