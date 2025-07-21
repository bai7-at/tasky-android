package io.embrace.android.embracesdk.session.orchestrator;

import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;

/* loaded from: classes5.dex */
public interface SessionOrchestrator extends ProcessStateListener {

    public static final class DefaultImpls {
        public static void onBackground(SessionOrchestrator sessionOrchestrator, long j) {
            ProcessStateListener.DefaultImpls.onBackground(sessionOrchestrator, j);
        }

        public static void onForeground(SessionOrchestrator sessionOrchestrator, boolean z, long j) {
            ProcessStateListener.DefaultImpls.onForeground(sessionOrchestrator, z, j);
        }
    }

    void endSessionWithCrash(String str);

    void endSessionWithManual(boolean z);

    void reportBackgroundActivityStateChange();
}
