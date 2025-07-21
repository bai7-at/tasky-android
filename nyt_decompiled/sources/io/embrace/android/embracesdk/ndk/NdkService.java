package io.embrace.android.embracesdk.ndk;

import io.embrace.android.embracesdk.payload.NativeCrashData;
import java.util.Map;

/* loaded from: classes5.dex */
public interface NdkService extends NativeCrashService {
    NativeCrashData getNativeCrash();

    Map<String, String> getSymbolsForCurrentArch();

    String getUnityCrashId();

    void onSessionPropertiesUpdate(Map<String, String> map);

    void onUserInfoUpdate();

    void updateSessionId(String str);
}
