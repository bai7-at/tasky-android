package com.iteratehq.iterate.data.remote;

import com.iteratehq.iterate.data.remote.model.ApiResponse;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qj;
import defpackage.ww8;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.iteratehq.iterate.data.remote.DefaultIterateApi$dispatchResult$2", f = "IterateApi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultIterateApi$dispatchResult$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ qj $callback;
    final /* synthetic */ Object $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIterateApi$dispatchResult$2(qj qjVar, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.$callback = qjVar;
        this.$result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultIterateApi$dispatchResult$2(this.$callback, this.$result, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        qj qjVar = this.$callback;
        if (qjVar != null) {
            Object obj2 = this.$result;
            Throwable e = Result.e(obj2);
            if (e == null) {
                ApiResponse apiResponse = (ApiResponse) obj2;
                if (apiResponse.getResults() != null) {
                    qjVar.onSuccess(apiResponse.getResults());
                } else if (apiResponse.getErrors() != null) {
                    qjVar.onError(new Exception(i.u0(apiResponse.getErrors(), "\n", null, null, 0, null, null, 62, null)));
                } else if (apiResponse.getError() != null) {
                    qjVar.onError(new Exception(apiResponse.getError().toString()));
                } else {
                    qjVar.onError(new Exception("Invalid response"));
                }
            } else {
                qjVar.onError(new Exception(e.getMessage(), e));
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultIterateApi$dispatchResult$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
