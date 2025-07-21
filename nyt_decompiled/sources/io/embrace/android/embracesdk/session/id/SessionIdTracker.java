package io.embrace.android.embracesdk.session.id;

import io.embrace.android.embracesdk.ndk.NdkService;

/* loaded from: classes5.dex */
public interface SessionIdTracker {
    String getActiveSessionId();

    NdkService getNdkService();

    void setActiveSessionId(String str, boolean z);

    void setNdkService(NdkService ndkService);
}
