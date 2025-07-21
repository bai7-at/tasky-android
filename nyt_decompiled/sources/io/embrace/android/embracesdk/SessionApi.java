package io.embrace.android.embracesdk;

import java.util.Map;

/* loaded from: classes5.dex */
public interface SessionApi {
    boolean addSessionProperty(String str, String str2, boolean z);

    void endSession();

    void endSession(boolean z);

    Map<String, String> getSessionProperties();

    boolean removeSessionProperty(String str);
}
