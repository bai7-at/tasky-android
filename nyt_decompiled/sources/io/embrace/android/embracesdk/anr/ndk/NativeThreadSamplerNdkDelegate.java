package io.embrace.android.embracesdk.anr.ndk;

import io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService;
import io.embrace.android.embracesdk.payload.NativeThreadAnrSample;
import java.util.List;

/* loaded from: classes5.dex */
public final class NativeThreadSamplerNdkDelegate implements EmbraceNativeThreadSamplerService.NdkDelegate {
    @Override // io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService.NdkDelegate
    public native List<NativeThreadAnrSample> finishSampling();

    @Override // io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService.NdkDelegate
    public native boolean monitorCurrentThread();

    @Override // io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService.NdkDelegate
    public native boolean setupNativeThreadSampler(boolean z);

    @Override // io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService.NdkDelegate
    public native void startSampling(int i, long j);
}
