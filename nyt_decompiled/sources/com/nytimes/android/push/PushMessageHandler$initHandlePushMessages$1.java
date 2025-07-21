package com.nytimes.android.push;

import android.app.Application;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h05;
import defpackage.ua2;
import defpackage.w05;
import defpackage.wa2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.push.PushMessageHandler$initHandlePushMessages$1", f = "PushMessageHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PushMessageHandler$initHandlePushMessages$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PushMessageHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushMessageHandler$initHandlePushMessages$1(PushMessageHandler pushMessageHandler, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pushMessageHandler;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(w05 w05Var, by0 by0Var) {
        return ((PushMessageHandler$initHandlePushMessages$1) create(w05Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PushMessageHandler$initHandlePushMessages$1 pushMessageHandler$initHandlePushMessages$1 = new PushMessageHandler$initHandlePushMessages$1(this.this$0, by0Var);
        pushMessageHandler$initHandlePushMessages$1.L$0 = obj;
        return pushMessageHandler$initHandlePushMessages$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ua2 ua2Var;
        PushClientManager pushClientManager;
        Application application;
        h05 h05Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        w05 w05Var = (w05) this.L$0;
        ua2Var = this.this$0.b;
        pushClientManager = this.this$0.c;
        Map a = w05Var.a();
        application = this.this$0.e;
        h05Var = this.this$0.d;
        ua2Var.a(new wa2(pushClientManager, a, application, h05Var));
        return ww8.a;
    }
}
