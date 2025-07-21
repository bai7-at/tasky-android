package com.nytimes.android.internal.pushmessaging.fcmprovider;

import com.google.firebase.messaging.RemoteMessage;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.p82;
import defpackage.w05;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.internal.pushmessaging.fcmprovider.FCMService$onMessageReceived$1", f = "FCMService.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FCMService$onMessageReceived$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ RemoteMessage $remoteMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FCMService$onMessageReceived$1(RemoteMessage remoteMessage, by0 by0Var) {
        super(2, by0Var);
        this.$remoteMessage = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FCMService$onMessageReceived$1(this.$remoteMessage, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            RemoteMessage remoteMessage = this.$remoteMessage;
            RemoteMessage.b X0 = remoteMessage.X0();
            String d = X0 != null ? X0.d() : null;
            RemoteMessage.b X02 = remoteMessage.X0();
            String a = X02 != null ? X02.a() : null;
            Map t0 = remoteMessage.t0();
            zq3.g(t0, "getData(...)");
            w05 w05Var = new w05(d, a, t0);
            p82 p82Var = p82.a;
            this.label = 1;
            if (p82Var.b(w05Var, this) == h) {
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
        return ((FCMService$onMessageReceived$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
