package com.nytimes.android.analytics.handler;

import android.app.Application;
import com.facebook.appevents.AppEventsLogger;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.purr.PurrTrackerTypeWrapper;
import defpackage.gc;
import defpackage.k92;
import defpackage.p86;
import defpackage.w92;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class FacebookChannelHandler extends gc {
    private final p86 f;
    private final AtomicReference g;
    private final AtomicBoolean h;
    private final String i;
    private final Channel j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookChannelHandler(p86 p86Var, CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        zq3.h(p86Var, "purrAnalyticsHelper");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.f = p86Var;
        this.g = new AtomicReference();
        this.h = new AtomicBoolean(false);
        this.i = "facebook handler";
        this.j = Channel.Facebook;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Application application) {
        if (!s() && this.h.compareAndSet(false, true)) {
            w92.L(application);
            u(application);
        }
    }

    private final void u(Application application) {
        this.g.getAndSet(AppEventsLogger.b.g(application));
    }

    @Override // defpackage.hj0
    public Channel b() {
        return this.j;
    }

    @Override // defpackage.hj0
    public void e(Application application) {
        zq3.h(application, "application");
        q(application);
        FlowKt.launchIn(FlowKt.onEach(this.f.a(PurrTrackerTypeWrapper.CONTROLLER), new FacebookChannelHandler$onApplicationStart$1(this, application, null)), a());
    }

    public final boolean s() {
        return !this.f.b(PurrTrackerTypeWrapper.CONTROLLER);
    }

    @Override // defpackage.hj0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(k92 k92Var) {
        AppEventsLogger appEventsLogger;
        zq3.h(k92Var, "event");
        if (s() || (appEventsLogger = (AppEventsLogger) this.g.get()) == null) {
            return;
        }
        appEventsLogger.c(k92Var.c(Channel.Facebook), i(k92Var));
    }
}
