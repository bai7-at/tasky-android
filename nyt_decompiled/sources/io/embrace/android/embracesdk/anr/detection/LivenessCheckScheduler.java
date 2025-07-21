package io.embrace.android.embracesdk.anr.detection;

import android.os.Message;
import android.os.Process;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.BlockedThreadListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ThreadEnforcementCheckKt;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class LivenessCheckScheduler {
    private final AtomicReference<Thread> anrMonitorThread;
    private final ScheduledWorker anrMonitorWorker;
    private final BlockedThreadDetector blockedThreadDetector;
    private final Clock clock;
    private final ResponsivenessMonitor heartbeatSendMonitor;
    private long intervalMs;
    private final InternalEmbraceLogger logger;
    private ScheduledFuture<?> monitorFuture;
    private final ThreadMonitoringState state;
    private final TargetThreadHandler targetThreadHandler;

    /* renamed from: io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
        AnonymousClass1(BlockedThreadDetector blockedThreadDetector) {
            super(1, blockedThreadDetector, BlockedThreadDetector.class, "onTargetThreadResponse", "onTargetThreadResponse(J)V", 0);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return ww8.a;
        }

        public final void invoke(long j) {
            ((BlockedThreadDetector) this.receiver).onTargetThreadResponse(j);
        }
    }

    public LivenessCheckScheduler(ConfigService configService, ScheduledWorker scheduledWorker, Clock clock, ThreadMonitoringState threadMonitoringState, TargetThreadHandler targetThreadHandler, BlockedThreadDetector blockedThreadDetector, InternalEmbraceLogger internalEmbraceLogger, AtomicReference<Thread> atomicReference) {
        zq3.h(configService, "configService");
        zq3.h(scheduledWorker, "anrMonitorWorker");
        zq3.h(clock, "clock");
        zq3.h(threadMonitoringState, TransferTable.COLUMN_STATE);
        zq3.h(targetThreadHandler, "targetThreadHandler");
        zq3.h(blockedThreadDetector, "blockedThreadDetector");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(atomicReference, "anrMonitorThread");
        this.anrMonitorWorker = scheduledWorker;
        this.clock = clock;
        this.state = threadMonitoringState;
        this.targetThreadHandler = targetThreadHandler;
        this.blockedThreadDetector = blockedThreadDetector;
        this.logger = internalEmbraceLogger;
        this.anrMonitorThread = atomicReference;
        this.heartbeatSendMonitor = new ResponsivenessMonitor(clock, "heartbeatSend", 0, 0L, 12, null);
        this.intervalMs = configService.getAnrBehavior().getSamplingIntervalMs();
        targetThreadHandler.setAction(new AnonymousClass1(blockedThreadDetector));
        targetThreadHandler.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleRegularHeartbeats() {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        this.intervalMs = getConfigService().getAnrBehavior().getSamplingIntervalMs();
        final LivenessCheckScheduler$scheduleRegularHeartbeats$runnable$1 livenessCheckScheduler$scheduleRegularHeartbeats$runnable$1 = new LivenessCheckScheduler$scheduleRegularHeartbeats$runnable$1(this);
        Runnable runnable = new Runnable() { // from class: io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zq3.g(qs2.this.mo865invoke(), "invoke(...)");
            }
        };
        try {
            this.logger.log("Starting ANR heartbeats with interval: " + this.intervalMs + "ms", InternalEmbraceLogger.Severity.INFO, null, true);
            this.monitorFuture = this.anrMonitorWorker.scheduleAtFixedRate(runnable, 0L, this.intervalMs, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            this.logger.log("ANR capture initialization failed", InternalEmbraceLogger.Severity.ERROR, e, true);
        }
    }

    private final void sendHeartbeatMessage() {
        if (this.targetThreadHandler.sendMessage(Message.obtain(this.targetThreadHandler, TargetThreadHandler.HEARTBEAT_REQUEST))) {
            return;
        }
        this.logger.log("Failed to send message to targetHandler, main thread likely shutting down.", InternalEmbraceLogger.Severity.ERROR, new IllegalStateException("Failed to send message to targetHandler"), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean stopHeartbeatTask() {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        ScheduledFuture<?> scheduledFuture = this.monitorFuture;
        if (scheduledFuture != null && scheduledFuture.cancel(false)) {
            this.logger.log("Stopped ANR detection...", InternalEmbraceLogger.Severity.INFO, null, true);
            this.monitorFuture = null;
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scheduled heartbeat task could not be stopped.");
        sb.append(this.monitorFuture == null ? "Task is null." : "");
        String sb2 = sb.toString();
        this.logger.log(sb2, InternalEmbraceLogger.Severity.ERROR, new IllegalStateException(sb2), false);
        return false;
    }

    public final void checkHeartbeat$embrace_android_sdk_release() {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        try {
            this.heartbeatSendMonitor.ping();
            Process.setThreadPriority(getConfigService().getAnrBehavior().getMonitorThreadPriority());
            if (this.intervalMs != getConfigService().getAnrBehavior().getSamplingIntervalMs()) {
                this.logger.log("Different interval detected, scheduling a heartbeat restart", InternalEmbraceLogger.Severity.INFO, null, true);
                this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler$checkHeartbeat$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean stopHeartbeatTask;
                        stopHeartbeatTask = LivenessCheckScheduler.this.stopHeartbeatTask();
                        if (stopHeartbeatTask) {
                            LivenessCheckScheduler.this.scheduleRegularHeartbeats();
                        }
                    }
                });
            } else {
                long now = this.clock.now();
                if (!this.targetThreadHandler.hasMessages(TargetThreadHandler.HEARTBEAT_REQUEST)) {
                    sendHeartbeatMessage();
                }
                this.blockedThreadDetector.updateAnrTracking(now);
            }
        } catch (Exception e) {
            this.logger.log("Failed to process ANR monitor thread heartbeat", InternalEmbraceLogger.Severity.ERROR, e, true);
        }
    }

    public final ConfigService getConfigService() {
        return this.blockedThreadDetector.getConfigService();
    }

    public final BlockedThreadListener getListener() {
        return this.blockedThreadDetector.getListener();
    }

    public final void resetResponsivenessMonitors() {
        this.heartbeatSendMonitor.reset();
        this.blockedThreadDetector.resetResponsivenessMonitor();
    }

    public final List<ResponsivenessSnapshot> responsivenessMonitorSnapshots() {
        return i.o(this.heartbeatSendMonitor.snapshot(), this.blockedThreadDetector.responsivenessMonitorSnapshot());
    }

    public final void setConfigService(ConfigService configService) {
        zq3.h(configService, "value");
        this.blockedThreadDetector.setConfigService(configService);
    }

    public final void setListener(BlockedThreadListener blockedThreadListener) {
        this.blockedThreadDetector.setListener(blockedThreadListener);
    }

    public final void startMonitoringThread() {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        if (this.state.started.getAndSet(true)) {
            return;
        }
        this.logger.log("Start ANR detection...", InternalEmbraceLogger.Severity.INFO, null, true);
        resetResponsivenessMonitors();
        scheduleRegularHeartbeats();
    }

    public final void stopMonitoringThread() {
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        if (this.state.started.get() && stopHeartbeatTask()) {
            this.state.started.set(false);
        }
    }
}
