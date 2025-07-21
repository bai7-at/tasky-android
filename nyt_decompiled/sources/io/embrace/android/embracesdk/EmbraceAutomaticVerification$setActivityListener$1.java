package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceAutomaticVerification$setActivityListener$1 extends MutablePropertyReference0Impl {
    EmbraceAutomaticVerification$setActivityListener$1(EmbraceAutomaticVerification embraceAutomaticVerification) {
        super(embraceAutomaticVerification, EmbraceAutomaticVerification.class, "activityLifecycleTracker", "getActivityLifecycleTracker$embrace_android_sdk_release()Lio/embrace/android/embracesdk/session/lifecycle/ActivityTracker;", 0);
    }

    @Override // defpackage.jv3
    public Object get() {
        return ((EmbraceAutomaticVerification) this.receiver).getActivityLifecycleTracker$embrace_android_sdk_release();
    }

    public void set(Object obj) {
        ((EmbraceAutomaticVerification) this.receiver).setActivityLifecycleTracker$embrace_android_sdk_release((ActivityTracker) obj);
    }
}
