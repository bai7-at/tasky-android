package io.embrace.android.embracesdk.anr.detection;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class LivenessCheckScheduler$scheduleRegularHeartbeats$runnable$1 extends FunctionReferenceImpl implements qs2 {
    LivenessCheckScheduler$scheduleRegularHeartbeats$runnable$1(LivenessCheckScheduler livenessCheckScheduler) {
        super(0, livenessCheckScheduler, LivenessCheckScheduler.class, "checkHeartbeat", "checkHeartbeat$embrace_android_sdk_release()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m860invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m860invoke() {
        ((LivenessCheckScheduler) this.receiver).checkHeartbeat$embrace_android_sdk_release();
    }
}
