package io.embrace.android.embracesdk.anr.detection;

import android.os.Debug;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.BlockedThreadListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ThreadEnforcementCheckKt;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BlockedThreadDetector {
    private final AtomicReference<Thread> anrMonitorThread;
    private final Clock clock;
    private ConfigService configService;
    private final ResponsivenessMonitor heartbeatResponseMonitor;
    private BlockedThreadListener listener;
    private final InternalEmbraceLogger logger;
    private final ThreadMonitoringState state;
    private final Thread targetThread;

    public BlockedThreadDetector(ConfigService configService, Clock clock, BlockedThreadListener blockedThreadListener, ThreadMonitoringState threadMonitoringState, Thread thread, InternalEmbraceLogger internalEmbraceLogger, AtomicReference<Thread> atomicReference) {
        zq3.h(configService, "configService");
        zq3.h(clock, "clock");
        zq3.h(threadMonitoringState, TransferTable.COLUMN_STATE);
        zq3.h(thread, "targetThread");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(atomicReference, "anrMonitorThread");
        this.configService = configService;
        this.clock = clock;
        this.listener = blockedThreadListener;
        this.state = threadMonitoringState;
        this.targetThread = thread;
        this.logger = internalEmbraceLogger;
        this.anrMonitorThread = atomicReference;
        this.heartbeatResponseMonitor = new ResponsivenessMonitor(clock, "heartbeatResponse", 0, 0L, 12, null);
    }

    private final boolean isDebuggerEnabled() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public final ConfigService getConfigService() {
        return this.configService;
    }

    public final BlockedThreadListener getListener() {
        return this.listener;
    }

    public final boolean isAnrDurationThresholdExceeded$embrace_android_sdk_release(long j) {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        long lastMonitorThreadResponseMs = j - this.state.getLastMonitorThreadResponseMs();
        long lastTargetThreadResponseMs = j - this.state.getLastTargetThreadResponseMs();
        if (lastMonitorThreadResponseMs <= 60000) {
            return lastTargetThreadResponseMs > ((long) this.configService.getAnrBehavior().getMinDuration());
        }
        long now = this.clock.now();
        this.state.setLastTargetThreadResponseMs(now);
        this.state.setLastMonitorThreadResponseMs(now);
        return false;
    }

    public final void onTargetThreadResponse(long j) {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        this.state.setLastTargetThreadResponseMs(j);
        this.heartbeatResponseMonitor.ping();
        if (!isDebuggerEnabled() && this.state.getAnrInProgress()) {
            this.logger.log("Main thread recovered from not responding for > 1s", InternalEmbraceLogger.Severity.DEBUG, null, true);
            this.state.setAnrInProgress(false);
            BlockedThreadListener blockedThreadListener = this.listener;
            if (blockedThreadListener != null) {
                blockedThreadListener.onThreadUnblocked(this.targetThread, j);
            }
        }
    }

    public final void resetResponsivenessMonitor() {
        this.heartbeatResponseMonitor.reset();
    }

    public final ResponsivenessSnapshot responsivenessMonitorSnapshot() {
        return this.heartbeatResponseMonitor.snapshot();
    }

    public final void setConfigService(ConfigService configService) {
        zq3.h(configService, "<set-?>");
        this.configService = configService;
    }

    public final void setListener(BlockedThreadListener blockedThreadListener) {
        this.listener = blockedThreadListener;
    }

    public final boolean shouldAttemptAnrSample$embrace_android_sdk_release(long j) {
        return ((double) (j - this.state.getLastMonitorThreadResponseMs())) > ((double) this.configService.getAnrBehavior().getSamplingIntervalMs()) * 0.5d;
    }

    public final void updateAnrTracking(long j) {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        if (isDebuggerEnabled()) {
            return;
        }
        if (!this.state.getAnrInProgress() && isAnrDurationThresholdExceeded$embrace_android_sdk_release(j)) {
            this.logger.log("Main thread not responding for > 1s", InternalEmbraceLogger.Severity.DEBUG, null, true);
            this.state.setAnrInProgress(true);
            BlockedThreadListener blockedThreadListener = this.listener;
            if (blockedThreadListener != null) {
                blockedThreadListener.onThreadBlocked(this.targetThread, this.state.getLastTargetThreadResponseMs());
            }
        }
        if (this.state.getAnrInProgress() && shouldAttemptAnrSample$embrace_android_sdk_release(j)) {
            BlockedThreadListener blockedThreadListener2 = this.listener;
            if (blockedThreadListener2 != null) {
                blockedThreadListener2.onThreadBlockedInterval(this.targetThread, j);
            }
            this.state.setLastSampleAttemptMs(this.clock.now());
        }
        this.state.setLastMonitorThreadResponseMs(this.clock.now());
    }

    public /* synthetic */ BlockedThreadDetector(ConfigService configService, Clock clock, BlockedThreadListener blockedThreadListener, ThreadMonitoringState threadMonitoringState, Thread thread, InternalEmbraceLogger internalEmbraceLogger, AtomicReference atomicReference, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configService, clock, (i & 4) != 0 ? null : blockedThreadListener, threadMonitoringState, thread, internalEmbraceLogger, atomicReference);
    }
}
