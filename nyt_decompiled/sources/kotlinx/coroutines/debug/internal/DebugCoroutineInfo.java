package kotlinx.coroutines.debug.internal;

import defpackage.p01;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class DebugCoroutineInfo {
    private final CoroutineContext context;
    private final p01 creationStackBottom;
    private final List<StackTraceElement> creationStackTrace;
    private final p01 lastObservedFrame;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final Thread lastObservedThread;
    private final long sequenceNumber;
    private final String state;

    public DebugCoroutineInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.creationStackBottom = debugCoroutineInfoImpl.getCreationStackBottom$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfoImpl.getCreationStackTrace();
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        this.lastObservedThread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    public final CoroutineContext getContext() {
        return this.context;
    }

    public final p01 getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return this.creationStackTrace;
    }

    public final p01 getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }

    public final List<StackTraceElement> lastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }
}
