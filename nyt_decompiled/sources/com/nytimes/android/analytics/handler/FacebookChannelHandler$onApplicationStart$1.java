package com.nytimes.android.analytics.handler;

import android.app.Application;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.analytics.handler.FacebookChannelHandler$onApplicationStart$1", f = "FacebookChannelHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FacebookChannelHandler$onApplicationStart$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Application $application;
    int label;
    final /* synthetic */ FacebookChannelHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FacebookChannelHandler$onApplicationStart$1(FacebookChannelHandler facebookChannelHandler, Application application, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = facebookChannelHandler;
        this.$application = application;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((FacebookChannelHandler$onApplicationStart$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FacebookChannelHandler$onApplicationStart$1(this.this$0, this.$application, by0Var);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.q(this.$application);
        return ww8.a;
    }
}
