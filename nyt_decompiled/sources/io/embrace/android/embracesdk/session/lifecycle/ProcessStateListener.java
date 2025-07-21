package io.embrace.android.embracesdk.session.lifecycle;

/* loaded from: classes5.dex */
public interface ProcessStateListener {

    public static final class DefaultImpls {
        public static void onBackground(ProcessStateListener processStateListener, long j) {
        }

        public static void onForeground(ProcessStateListener processStateListener, boolean z, long j) {
        }
    }

    void onBackground(long j);

    void onForeground(boolean z, long j);
}
