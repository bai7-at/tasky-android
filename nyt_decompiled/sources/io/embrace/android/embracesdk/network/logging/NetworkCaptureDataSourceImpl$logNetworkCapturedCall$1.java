package io.embrace.android.embracesdk.network.logging;

import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class NetworkCaptureDataSourceImpl$logNetworkCapturedCall$1 extends FunctionReferenceImpl implements ss2 {
    NetworkCaptureDataSourceImpl$logNetworkCapturedCall$1(NetworkCaptureDataSourceImpl networkCaptureDataSourceImpl) {
        super(1, networkCaptureDataSourceImpl, NetworkCaptureDataSourceImpl.class, "toLogEventData", "toLogEventData(Lio/embrace/android/embracesdk/payload/NetworkCapturedCall;)Lio/embrace/android/embracesdk/arch/destination/LogEventData;", 0);
    }

    @Override // defpackage.ss2
    public final LogEventData invoke(NetworkCapturedCall networkCapturedCall) {
        zq3.h(networkCapturedCall, "p1");
        return ((NetworkCaptureDataSourceImpl) this.receiver).toLogEventData(networkCapturedCall);
    }
}
