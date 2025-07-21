package io.embrace.android.embracesdk.session.orchestrator;

/* loaded from: classes5.dex */
public enum SessionSnapshotType {
    NORMAL_END(true, false),
    PERIODIC_CACHE(false, true),
    JVM_CRASH(false, false);

    private final boolean endedCleanly;
    private final boolean forceQuit;

    SessionSnapshotType(boolean z, boolean z2) {
        this.endedCleanly = z;
        this.forceQuit = z2;
    }

    public final boolean getEndedCleanly() {
        return this.endedCleanly;
    }

    public final boolean getForceQuit() {
        return this.forceQuit;
    }
}
