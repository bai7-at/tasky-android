package io.embrace.android.embracesdk.anr.detection;

import defpackage.qs2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class TargetThreadHandler$start$1 extends FunctionReferenceImpl implements qs2 {
    TargetThreadHandler$start$1(TargetThreadHandler targetThreadHandler) {
        super(0, targetThreadHandler, TargetThreadHandler.class, "onIdleThread", "onIdleThread$embrace_android_sdk_release()Z", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        return Boolean.valueOf(m861invoke());
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final boolean m861invoke() {
        return ((TargetThreadHandler) this.receiver).onIdleThread$embrace_android_sdk_release();
    }
}
