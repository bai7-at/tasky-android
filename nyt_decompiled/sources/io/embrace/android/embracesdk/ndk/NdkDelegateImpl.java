package io.embrace.android.embracesdk.ndk;

import io.embrace.android.embracesdk.ndk.NdkServiceDelegate;

/* loaded from: classes5.dex */
public final class NdkDelegateImpl implements NdkServiceDelegate.NdkDelegate {
    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native String _checkForOverwrittenHandlers();

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native String _getCrashReport(String str);

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native String _getErrors(String str);

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _installSignalHandlers(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2);

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native boolean _reinstallSignalHandlers();

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _testNativeCrash_C();

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _testNativeCrash_CPP();

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _uninstallSignals();

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _updateAppState(String str);

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _updateMetaData(String str);

    @Override // io.embrace.android.embracesdk.ndk.NdkServiceDelegate.NdkDelegate
    public native void _updateSessionId(String str);
}
