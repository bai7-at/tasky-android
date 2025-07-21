package io.embrace.android.embracesdk.network.logging;

import io.embrace.android.embracesdk.config.remote.NetworkCaptureRuleRemoteConfig;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import java.util.Set;

/* loaded from: classes5.dex */
public interface NetworkCaptureService {

    public static final class DefaultImpls {
        public static /* synthetic */ void logNetworkCapturedData$default(NetworkCaptureService networkCaptureService, String str, String str2, int i, long j, long j2, NetworkCaptureData networkCaptureData, String str3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNetworkCapturedData");
            }
            networkCaptureService.logNetworkCapturedData(str, str2, i, j, j2, networkCaptureData, (i2 & 64) != 0 ? null : str3);
        }
    }

    Set<NetworkCaptureRuleRemoteConfig> getNetworkCaptureRules(String str, String str2);

    void logNetworkCapturedData(String str, String str2, int i, long j, long j2, NetworkCaptureData networkCaptureData, String str3);
}
