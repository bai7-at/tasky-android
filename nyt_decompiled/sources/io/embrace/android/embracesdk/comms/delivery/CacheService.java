package io.embrace.android.embracesdk.comms.delivery;

import defpackage.ss2;
import io.embrace.android.embracesdk.payload.SessionMessage;
import java.util.List;

/* loaded from: classes5.dex */
public interface CacheService {
    <T> void cacheObject(String str, T t, Class<T> cls);

    void cachePayload(String str, ss2 ss2Var);

    boolean deleteFile(String str);

    <T> T loadObject(String str, Class<T> cls);

    List<PendingApiCall> loadOldPendingApiCalls(String str);

    ss2 loadPayload(String str);

    List<String> normalizeCacheAndGetSessionFileIds();

    void transformSession(String str, ss2 ss2Var);

    void writeSession(String str, SessionMessage sessionMessage);
}
