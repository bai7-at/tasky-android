package com.iteratehq.iterate.data.remote;

import com.iteratehq.iterate.data.remote.model.ApiResponse;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qj;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.iteratehq.iterate.data.remote.DefaultIterateApi$executeAsync$1", f = "IterateApi.kt", l = {136, 138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultIterateApi$executeAsync$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $apiCall;
    final /* synthetic */ qj $callback;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultIterateApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultIterateApi$executeAsync$1(DefaultIterateApi defaultIterateApi, qj qjVar, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultIterateApi;
        this.$callback = qjVar;
        this.$apiCall = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DefaultIterateApi$executeAsync$1 defaultIterateApi$executeAsync$1 = new DefaultIterateApi$executeAsync$1(this.this$0, this.$callback, this.$apiCall, by0Var);
        defaultIterateApi$executeAsync$1.L$0 = obj;
        return defaultIterateApi$executeAsync$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object e;
        Object h = a.h();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.a aVar = Result.a;
            b = Result.b(f.a(th));
        }
        if (i == 0) {
            f.b(obj);
            ss2 ss2Var = this.$apiCall;
            Result.a aVar2 = Result.a;
            this.label = 1;
            obj = ss2Var.invoke(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b = Result.b((ApiResponse) obj);
        DefaultIterateApi defaultIterateApi = this.this$0;
        qj qjVar = this.$callback;
        this.label = 2;
        e = defaultIterateApi.e(b, qjVar, this);
        if (e == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultIterateApi$executeAsync$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
