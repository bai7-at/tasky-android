package io.embrace.android.embracesdk.anr;

import android.os.Looper;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler;
import io.embrace.android.embracesdk.anr.detection.ThreadMonitoringState;
import io.embrace.android.embracesdk.anr.detection.UnbalancedCallDetector;
import io.embrace.android.embracesdk.anr.sigquit.SigquitDetectionService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ThreadEnforcementCheckKt;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.AnrInterval;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceAnrService implements AnrService, MemoryCleanerListener, ProcessStateListener, BlockedThreadListener {
    public static final Companion Companion = new Companion(null);
    private static final long MAX_DATA_WAIT_MS = 1000;
    private final AtomicReference<Thread> anrMonitorThread;
    private final ScheduledWorker anrMonitorWorker;
    private final Clock clock;
    private ConfigService configService;
    private final CopyOnWriteArrayList<BlockedThreadListener> listeners;
    private final InternalEmbraceLogger logger;
    private final SigquitDetectionService sigquitDetectionService;
    private final AnrStacktraceSampler stacktraceSampler;
    private final ThreadMonitoringState state;
    private final Thread targetThread;
    private final LivenessCheckScheduler targetThreadHeartbeatScheduler;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceAnrService(ConfigService configService, Looper looper, InternalEmbraceLogger internalEmbraceLogger, SigquitDetectionService sigquitDetectionService, LivenessCheckScheduler livenessCheckScheduler, ScheduledWorker scheduledWorker, ThreadMonitoringState threadMonitoringState, Clock clock, AtomicReference<Thread> atomicReference) {
        zq3.h(configService, "configService");
        zq3.h(looper, "looper");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(sigquitDetectionService, "sigquitDetectionService");
        zq3.h(livenessCheckScheduler, "livenessCheckScheduler");
        zq3.h(scheduledWorker, "anrMonitorWorker");
        zq3.h(threadMonitoringState, TransferTable.COLUMN_STATE);
        zq3.h(clock, "clock");
        zq3.h(atomicReference, "anrMonitorThread");
        this.configService = configService;
        this.anrMonitorWorker = scheduledWorker;
        this.clock = clock;
        this.anrMonitorThread = atomicReference;
        CopyOnWriteArrayList<BlockedThreadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.listeners = copyOnWriteArrayList;
        Thread thread = looper.getThread();
        zq3.g(thread, "looper.thread");
        this.targetThread = thread;
        this.logger = internalEmbraceLogger;
        this.sigquitDetectionService = sigquitDetectionService;
        this.state = threadMonitoringState;
        this.targetThreadHeartbeatScheduler = livenessCheckScheduler;
        AnrStacktraceSampler anrStacktraceSampler = new AnrStacktraceSampler(this.configService, clock, thread, atomicReference, scheduledWorker);
        this.stacktraceSampler = anrStacktraceSampler;
        copyOnWriteArrayList.add(anrStacktraceSampler);
        copyOnWriteArrayList.add(new UnbalancedCallDetector(internalEmbraceLogger));
        livenessCheckScheduler.setListener(this);
    }

    private final void startAnrCapture() {
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.EmbraceAnrService$startAnrCapture$1
            @Override // java.lang.Runnable
            public final void run() {
                LivenessCheckScheduler livenessCheckScheduler;
                livenessCheckScheduler = EmbraceAnrService.this.targetThreadHeartbeatScheduler;
                livenessCheckScheduler.startMonitoringThread();
            }
        });
    }

    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void addBlockedThreadListener(BlockedThreadListener blockedThreadListener) {
        zq3.h(blockedThreadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.add(blockedThreadListener);
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.stacktraceSampler.cleanCollections();
        this.sigquitDetectionService.cleanCollections();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void finishInitialization(ConfigService configService) {
        zq3.h(configService, "configService");
        this.configService = configService;
        this.stacktraceSampler.setConfigService(configService);
        this.sigquitDetectionService.setConfigService(configService);
        this.targetThreadHeartbeatScheduler.setConfigService(configService);
        this.sigquitDetectionService.initializeGoogleAnrTracking();
        startAnrCapture();
    }

    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void forceAnrTrackingStopOnCrash() {
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.EmbraceAnrService$forceAnrTrackingStopOnCrash$1
            @Override // java.lang.Runnable
            public final void run() {
                LivenessCheckScheduler livenessCheckScheduler;
                livenessCheckScheduler = EmbraceAnrService.this.targetThreadHeartbeatScheduler;
                livenessCheckScheduler.stopMonitoringThread();
            }
        });
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final ConfigService getConfigService() {
        return this.configService;
    }

    public final CopyOnWriteArrayList<BlockedThreadListener> getListeners() {
        return this.listeners;
    }

    public final AnrStacktraceSampler getStacktraceSampler() {
        return this.stacktraceSampler;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(long j) {
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.EmbraceAnrService$onBackground$1
            @Override // java.lang.Runnable
            public final void run() {
                LivenessCheckScheduler livenessCheckScheduler;
                livenessCheckScheduler = EmbraceAnrService.this.targetThreadHeartbeatScheduler;
                livenessCheckScheduler.stopMonitoringThread();
            }
        });
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(boolean z, long j) {
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.EmbraceAnrService$onForeground$1
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference;
                ThreadMonitoringState threadMonitoringState;
                LivenessCheckScheduler livenessCheckScheduler;
                atomicReference = EmbraceAnrService.this.anrMonitorThread;
                ThreadEnforcementCheckKt.enforceThread(atomicReference);
                threadMonitoringState = EmbraceAnrService.this.state;
                threadMonitoringState.resetState();
                livenessCheckScheduler = EmbraceAnrService.this.targetThreadHeartbeatScheduler;
                livenessCheckScheduler.startMonitoringThread();
            }
        });
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        Iterator<BlockedThreadListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onThreadBlocked(thread, j);
        }
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlockedInterval(Thread thread, long j) {
        zq3.h(thread, "thread");
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        processAnrTick$embrace_android_sdk_release(j);
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadUnblocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        ThreadEnforcementCheckKt.enforceThread(this.anrMonitorThread);
        Iterator<BlockedThreadListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onThreadUnblocked(thread, j);
        }
    }

    public final void processAnrTick$embrace_android_sdk_release(long j) {
        if (this.configService.getAnrBehavior().isAnrCaptureEnabled()) {
            Iterator<BlockedThreadListener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onThreadBlockedInterval(this.targetThread, j);
            }
        }
    }

    public final void setConfigService(ConfigService configService) {
        zq3.h(configService, "<set-?>");
        this.configService = configService;
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends AnrInterval> getCapturedData() {
        try {
            Object obj = this.anrMonitorWorker.submit(new Callable() { // from class: io.embrace.android.embracesdk.anr.EmbraceAnrService$getCapturedData$callable$1
                @Override // java.util.concurrent.Callable
                public final List<AnrInterval> call() {
                    ThreadMonitoringState threadMonitoringState;
                    AnrStacktraceSampler stacktraceSampler = EmbraceAnrService.this.getStacktraceSampler();
                    threadMonitoringState = EmbraceAnrService.this.state;
                    List<AnrInterval> anrIntervals = stacktraceSampler.getAnrIntervals(threadMonitoringState, EmbraceAnrService.this.getClock());
                    if (anrIntervals != null) {
                        return anrIntervals;
                    }
                    throw new IllegalStateException("ANR samples to be cached is null");
                }
            }).get(MAX_DATA_WAIT_MS, TimeUnit.MILLISECONDS);
            zq3.g(obj, "anrMonitorWorker.submit(…S, TimeUnit.MILLISECONDS)");
            return (List) obj;
        } catch (Exception e) {
            this.logger.log("Failed to getAnrIntervals()", InternalEmbraceLogger.Severity.ERROR, e, true);
            return i.l();
        }
    }
}
