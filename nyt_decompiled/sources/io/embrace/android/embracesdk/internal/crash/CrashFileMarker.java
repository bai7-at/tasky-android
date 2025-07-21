package io.embrace.android.embracesdk.internal.crash;

/* loaded from: classes5.dex */
public interface CrashFileMarker {
    boolean getAndCleanMarker();

    boolean isMarked();

    void mark();

    void removeMark();
}
