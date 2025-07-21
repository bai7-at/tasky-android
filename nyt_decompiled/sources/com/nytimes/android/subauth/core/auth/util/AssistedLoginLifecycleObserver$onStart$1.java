package com.nytimes.android.subauth.core.auth.util;

import defpackage.by0;
import defpackage.cu;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.subauth.core.auth.util.AssistedLoginLifecycleObserver$onStart$1", f = "AssistedLoginLifecycleObserver.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssistedLoginLifecycleObserver$onStart$1 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ AssistedLoginLifecycleObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssistedLoginLifecycleObserver$onStart$1(AssistedLoginLifecycleObserver assistedLoginLifecycleObserver, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assistedLoginLifecycleObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssistedLoginLifecycleObserver$onStart$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableStateFlow = this.this$0.h;
            mutableStateFlow.setValue(cu.a.a);
            mutableStateFlow2 = this.this$0.h;
            AssistedLoginLifecycleObserver assistedLoginLifecycleObserver = this.this$0;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            Object f = assistedLoginLifecycleObserver.f(this);
            if (f == h) {
                return h;
            }
            obj = f;
            mutableStateFlow3 = mutableStateFlow2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow3 = (MutableStateFlow) this.L$0;
            f.b(obj);
        }
        mutableStateFlow3.setValue(obj);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssistedLoginLifecycleObserver$onStart$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
