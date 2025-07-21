package io.embrace.android.embracesdk.anr;

/* loaded from: classes5.dex */
public interface BlockedThreadListener {
    void onThreadBlocked(Thread thread, long j);

    void onThreadBlockedInterval(Thread thread, long j);

    void onThreadUnblocked(Thread thread, long j);
}
