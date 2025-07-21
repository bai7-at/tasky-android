package com.nytimes.android.internal.pushmessaging.fcmprovider;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.r82;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.internal.pushmessaging.fcmprovider.FCMService$onNewToken$1", f = "FCMService.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FCMService$onNewToken$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ FCMService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FCMService$onNewToken$1(FCMService fCMService, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fCMService;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FCMService$onNewToken$1(this.this$0, this.$token, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            r82 l = this.this$0.l();
            zq3.f(l, "null cannot be cast to non-null type com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl");
            String str = this.$token;
            this.label = 1;
            if (((FCMTokenProviderImpl) l).d(str, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FCMService$onNewToken$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
