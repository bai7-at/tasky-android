package com.nytimes.android.internal.pushmessaging.fcmprovider;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl$listenForFirebaseToken$1$1", f = "FCMTokenProviderImpl.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FCMTokenProviderImpl$listenForFirebaseToken$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ FCMTokenProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FCMTokenProviderImpl$listenForFirebaseToken$1$1(FCMTokenProviderImpl fCMTokenProviderImpl, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fCMTokenProviderImpl;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FCMTokenProviderImpl$listenForFirebaseToken$1$1(this.this$0, this.$token, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow e;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            e = this.this$0.e();
            String str = this.$token;
            this.label = 1;
            if (e.emit(str, this) == h) {
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
        return ((FCMTokenProviderImpl$listenForFirebaseToken$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
