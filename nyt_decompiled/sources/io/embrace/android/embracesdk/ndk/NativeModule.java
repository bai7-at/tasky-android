package io.embrace.android.embracesdk.ndk;

import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;

/* loaded from: classes5.dex */
public interface NativeModule {
    NativeThreadSamplerInstaller getNativeThreadSamplerInstaller();

    NativeThreadSamplerService getNativeThreadSamplerService();

    NdkService getNdkService();
}
