package io.embrace.android.embracesdk.anr.ndk;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceNativeThreadSamplerService$onThreadBlockedInterval$1 extends FunctionReferenceImpl implements qs2 {
    EmbraceNativeThreadSamplerService$onThreadBlockedInterval$1(EmbraceNativeThreadSamplerService embraceNativeThreadSamplerService) {
        super(0, embraceNativeThreadSamplerService, EmbraceNativeThreadSamplerService.class, "fetchIntervals", "fetchIntervals()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m862invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m862invoke() {
        ((EmbraceNativeThreadSamplerService) this.receiver).fetchIntervals();
    }
}
