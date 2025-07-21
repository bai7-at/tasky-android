package com.nytimes.android.entitlements.subauth;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookieSingle$1", f = "SubauthUserClientImpl.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserClientImpl$getMeterServiceCookieSingle$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubauthUserClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserClientImpl$getMeterServiceCookieSingle$1(SubauthUserClientImpl subauthUserClientImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subauthUserClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthUserClientImpl$getMeterServiceCookieSingle$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SubauthUserClientImpl subauthUserClientImpl = this.this$0;
            this.label = 1;
            obj = subauthUserClientImpl.i(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthUserClientImpl$getMeterServiceCookieSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
