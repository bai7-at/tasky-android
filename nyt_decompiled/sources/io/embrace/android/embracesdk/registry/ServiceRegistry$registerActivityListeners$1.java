package io.embrace.android.embracesdk.registry;

import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class ServiceRegistry$registerActivityListeners$1 extends FunctionReferenceImpl implements ss2 {
    ServiceRegistry$registerActivityListeners$1(ProcessStateService processStateService) {
        super(1, processStateService, ProcessStateService.class, "addListener", "addListener(Lio/embrace/android/embracesdk/session/lifecycle/ProcessStateListener;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProcessStateListener) obj);
        return ww8.a;
    }

    public final void invoke(ProcessStateListener processStateListener) {
        zq3.h(processStateListener, "p1");
        ((ProcessStateService) this.receiver).addListener(processStateListener);
    }
}
