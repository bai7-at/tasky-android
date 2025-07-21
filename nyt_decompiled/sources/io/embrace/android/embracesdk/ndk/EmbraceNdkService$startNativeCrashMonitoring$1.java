package io.embrace.android.embracesdk.ndk;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceNdkService$startNativeCrashMonitoring$1 extends FunctionReferenceImpl implements qs2 {
    EmbraceNdkService$startNativeCrashMonitoring$1(EmbraceNdkService embraceNdkService) {
        super(0, embraceNdkService, EmbraceNdkService.class, "checkSignalHandlersOverwritten", "checkSignalHandlersOverwritten()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        invoke();
        return ww8.a;
    }

    public final void invoke() {
        ((EmbraceNdkService) this.receiver).checkSignalHandlersOverwritten();
    }
}
