package io.embrace.android.embracesdk.event;

import io.embrace.android.embracesdk.internal.StartupEventInfo;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface EventService extends Closeable {
    void endEvent(String str);

    void endEvent(String str, String str2);

    void endEvent(String str, String str2, Map<String, ? extends Object> map);

    void endEvent(String str, Map<String, ? extends Object> map);

    List<String> findEventIdsForSession();

    List<String> getActiveEventIds();

    StartupEventInfo getStartupMomentInfo();

    void sendStartupMoment();

    void setProcessStartedByNotification();

    void startEvent(String str);

    void startEvent(String str, String str2);

    void startEvent(String str, String str2, Map<String, ? extends Object> map);

    void startEvent(String str, String str2, Map<String, ? extends Object> map, Long l);
}
