package io.embrace.android.embracesdk;

import java.util.Map;

/* loaded from: classes5.dex */
interface MomentsApi {
    void endAppStartup();

    void endAppStartup(Map<String, Object> map);

    void endMoment(String str);

    void endMoment(String str, String str2);

    void endMoment(String str, String str2, Map<String, Object> map);

    void endMoment(String str, Map<String, Object> map);

    void startMoment(String str);

    void startMoment(String str, String str2);

    void startMoment(String str, String str2, Map<String, Object> map);
}
