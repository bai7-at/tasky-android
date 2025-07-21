package com.nytimes.subauth.ui.login;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q54;
import defpackage.ww8;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.login.SubauthLoginViewModel$onBackPressed$2", f = "SubauthLoginViewModel.kt", l = {NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 1001}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthLoginViewModel$onBackPressed$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubauthLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginViewModel$onBackPressed$2(SubauthLoginViewModel subauthLoginViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthLoginViewModel$onBackPressed$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.h;
            q54.a aVar = q54.a.a;
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == h) {
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
        SubauthLIREFlowAnalyticsManager subauthLIREFlowAnalyticsManager = this.this$0.j;
        this.label = 2;
        if (subauthLIREFlowAnalyticsManager.s(false, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthLoginViewModel$onBackPressed$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
