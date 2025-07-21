package io.embrace.android.embracesdk.capture.startup;

/* loaded from: classes5.dex */
public interface StartupService {
    Long getSdkInitEndMs();

    Long getSdkInitStartMs();

    Long getSdkStartupDuration(boolean z);

    void setSdkStartupInfo(long j, long j2);
}
