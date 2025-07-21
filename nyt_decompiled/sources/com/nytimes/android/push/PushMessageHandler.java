package com.nytimes.android.push;

import android.app.Application;
import defpackage.h05;
import defpackage.o82;
import defpackage.ua2;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PushMessageHandler {
    private final o82 a;
    private final ua2 b;
    private final PushClientManager c;
    private final h05 d;
    private final Application e;
    private final CoroutineScope f;

    public PushMessageHandler(o82 o82Var, ua2 ua2Var, PushClientManager pushClientManager, h05 h05Var, Application application, CoroutineScope coroutineScope) {
        zq3.h(o82Var, "fcmPushMessageProvider");
        zq3.h(ua2Var, "fcmBroadcastProcessor");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(h05Var, "nytJobScheduler");
        zq3.h(application, "application");
        zq3.h(coroutineScope, "applicationScope");
        this.a = o82Var;
        this.b = ua2Var;
        this.c = pushClientManager;
        this.d = h05Var;
        this.e = application;
        this.f = coroutineScope;
    }

    public final void e() {
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.a.a(), new PushMessageHandler$initHandlePushMessages$1(this, null)), new PushMessageHandler$initHandlePushMessages$2(null)), this.f);
    }
}
