package io.embrace.android.embracesdk.ndk;

/* loaded from: classes5.dex */
public final class NdkServiceDelegate {

    public interface NdkDelegate {
        String _checkForOverwrittenHandlers();

        String _getCrashReport(String str);

        String _getErrors(String str);

        void _installSignalHandlers(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2);

        boolean _reinstallSignalHandlers();

        void _testNativeCrash_C();

        void _testNativeCrash_CPP();

        void _uninstallSignals();

        void _updateAppState(String str);

        void _updateMetaData(String str);

        void _updateSessionId(String str);
    }
}
