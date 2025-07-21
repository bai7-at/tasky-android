package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceAutomaticVerification$setActivityListener$2 extends MutablePropertyReference0Impl {
    EmbraceAutomaticVerification$setActivityListener$2(EmbraceAutomaticVerification embraceAutomaticVerification) {
        super(embraceAutomaticVerification, EmbraceAutomaticVerification.class, "processStateService", "getProcessStateService$embrace_android_sdk_release()Lio/embrace/android/embracesdk/session/lifecycle/ProcessStateService;", 0);
    }

    @Override // defpackage.jv3
    public Object get() {
        return ((EmbraceAutomaticVerification) this.receiver).getProcessStateService$embrace_android_sdk_release();
    }

    public void set(Object obj) {
        ((EmbraceAutomaticVerification) this.receiver).setProcessStateService$embrace_android_sdk_release((ProcessStateService) obj);
    }
}
