package io.embrace.android.embracesdk.registry;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class ServiceRegistry$registerActivityLifecycleListeners$1 extends FunctionReferenceImpl implements ss2 {
    ServiceRegistry$registerActivityLifecycleListeners$1(ActivityTracker activityTracker) {
        super(1, activityTracker, ActivityTracker.class, "addListener", "addListener(Lio/embrace/android/embracesdk/session/lifecycle/ActivityLifecycleListener;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActivityLifecycleListener) obj);
        return ww8.a;
    }

    public final void invoke(ActivityLifecycleListener activityLifecycleListener) {
        zq3.h(activityLifecycleListener, "p1");
        ((ActivityTracker) this.receiver).addListener(activityLifecycleListener);
    }
}
