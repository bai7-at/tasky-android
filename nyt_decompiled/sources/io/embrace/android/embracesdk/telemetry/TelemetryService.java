package io.embrace.android.embracesdk.telemetry;

import java.util.Map;

/* loaded from: classes5.dex */
public interface TelemetryService {
    Map<String, String> getAndClearTelemetryAttributes();

    void logStorageTelemetry(Map<String, String> map);

    void onPublicApiCalled(String str);
}
