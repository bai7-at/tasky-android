package io.embrace.android.embracesdk.capture.startup;

import android.os.Process;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AppStartupTraceEmitter {
    public static final Companion Companion = new Companion(null);
    public static final long SDK_AND_ACTIVITY_INIT_GAP = 60000;
    private final ConcurrentLinkedQueue<TrackedInterval> additionalTrackedIntervals;
    private volatile Long applicationInitEndMs;
    private volatile Long applicationInitStartMs;
    private final BackgroundWorker backgroundWorker;
    private final yl0 clock;
    private final boolean endWithFrameDraw;
    private volatile Long firstFrameRenderedMs;
    private final InternalEmbraceLogger logger;
    private final Long processCreateRequestedMs;
    private final Long processCreatedMs;
    private final SpanService spanService;
    private volatile Long startupActivityInitEndMs;
    private volatile Long startupActivityInitStartMs;
    private volatile Long startupActivityResumedMs;
    private final AtomicBoolean startupRecorded;
    private final qs2 startupServiceProvider;
    private final VersionChecker versionChecker;

    public static final class Companion {
        private Companion() {
        }

        public final Long duration(Long l, Long l2) {
            if (l == null || l2 == null) {
                return null;
            }
            return Long.valueOf(l2.longValue() - l.longValue());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class TrackedInterval {
        private final long endTimeMs;
        private final String name;
        private final long startTimeMs;

        public TrackedInterval(String str, long j, long j2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.name = str;
            this.startTimeMs = j;
            this.endTimeMs = j2;
        }

        public static /* synthetic */ TrackedInterval copy$default(TrackedInterval trackedInterval, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trackedInterval.name;
            }
            if ((i & 2) != 0) {
                j = trackedInterval.startTimeMs;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = trackedInterval.endTimeMs;
            }
            return trackedInterval.copy(str, j3, j2);
        }

        public final String component1() {
            return this.name;
        }

        public final long component2() {
            return this.startTimeMs;
        }

        public final long component3() {
            return this.endTimeMs;
        }

        public final TrackedInterval copy(String str, long j, long j2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return new TrackedInterval(str, j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackedInterval)) {
                return false;
            }
            TrackedInterval trackedInterval = (TrackedInterval) obj;
            return zq3.c(this.name, trackedInterval.name) && this.startTimeMs == trackedInterval.startTimeMs && this.endTimeMs == trackedInterval.endTimeMs;
        }

        public final long getEndTimeMs() {
            return this.endTimeMs;
        }

        public final String getName() {
            return this.name;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs;
        }

        public int hashCode() {
            String str = this.name;
            return ((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.startTimeMs)) * 31) + Long.hashCode(this.endTimeMs);
        }

        public String toString() {
            return "TrackedInterval(name=" + this.name + ", startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + ")";
        }
    }

    public AppStartupTraceEmitter(yl0 yl0Var, qs2 qs2Var, SpanService spanService, BackgroundWorker backgroundWorker, VersionChecker versionChecker, InternalEmbraceLogger internalEmbraceLogger) {
        Long l;
        long startRequestedElapsedRealtime;
        zq3.h(yl0Var, "clock");
        zq3.h(qs2Var, "startupServiceProvider");
        zq3.h(spanService, "spanService");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(versionChecker, "versionChecker");
        zq3.h(internalEmbraceLogger, "logger");
        this.clock = yl0Var;
        this.startupServiceProvider = qs2Var;
        this.spanService = spanService;
        this.backgroundWorker = backgroundWorker;
        this.versionChecker = versionChecker;
        this.logger = internalEmbraceLogger;
        this.additionalTrackedIntervals = new ConcurrentLinkedQueue<>();
        long nowMs = nowMs() - ClockKt.nanosToMillis(yl0Var.nanoTime());
        if (versionChecker.isAtLeast(33)) {
            startRequestedElapsedRealtime = Process.getStartRequestedElapsedRealtime();
            l = Long.valueOf(startRequestedElapsedRealtime + nowMs);
        } else {
            l = null;
        }
        this.processCreateRequestedMs = l;
        this.processCreatedMs = versionChecker.isAtLeast(24) ? Long.valueOf(nowMs + Process.getStartElapsedRealtime()) : null;
        this.startupRecorded = new AtomicBoolean(false);
        this.endWithFrameDraw = versionChecker.isAtLeast(29);
    }

    private final Long applicationActivityCreationGap() {
        return Companion.duration(this.applicationInitEndMs, this.startupActivityInitStartMs);
    }

    public static /* synthetic */ void applicationInitEnd$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.applicationInitEnd(l);
    }

    public static /* synthetic */ void applicationInitStart$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.applicationInitStart(l);
    }

    private final void dataCollectionComplete() {
        if (this.startupRecorded.get()) {
            return;
        }
        synchronized (this.startupRecorded) {
            try {
                if (!this.startupRecorded.get()) {
                    BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.startup.AppStartupTraceEmitter$dataCollectionComplete$$inlined$synchronized$lambda$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AtomicBoolean atomicBoolean;
                            InternalEmbraceLogger internalEmbraceLogger;
                            AppStartupTraceEmitter.this.recordStartup();
                            atomicBoolean = AppStartupTraceEmitter.this.startupRecorded;
                            if (atomicBoolean.get()) {
                                return;
                            }
                            internalEmbraceLogger = AppStartupTraceEmitter.this.logger;
                            internalEmbraceLogger.log("App startup trace recording attempted but did not succeed", InternalEmbraceLogger.Severity.WARNING, null, false);
                        }
                    }, 1, (Object) null);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void firstFrameRendered$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.firstFrameRendered(l);
    }

    private final long nowMs() {
        return ClockKt.nanosToMillis(this.clock.now());
    }

    private final Long processCreateDelay() {
        return Companion.duration(this.processCreateRequestedMs, this.processCreatedMs);
    }

    private final void recordAdditionalIntervals(EmbraceSpan embraceSpan) {
        do {
            TrackedInterval poll = this.additionalTrackedIntervals.poll();
            if (poll != null) {
                SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, poll.getName(), poll.getStartTimeMs(), poll.getEndTimeMs(), embraceSpan, null, false, false, null, null, null, 944, null);
            }
        } while (!this.additionalTrackedIntervals.isEmpty());
    }

    private final EmbraceSpan recordColdTtid(long j, Long l, Long l2, Long l3, Long l4, Long l5, long j2, Long l6) {
        PersistableEmbraceSpan startSpan$default;
        if (this.startupRecorded.get() || (startSpan$default = SpanService.DefaultImpls.startSpan$default(this.spanService, "cold-time-to-initial-display", null, Long.valueOf(j), null, false, false, 26, null)) == null) {
            return null;
        }
        if (l6 != null) {
            startSpan$default.addAttribute(EmbraceExtensionsKt.toEmbraceAttributeName$default("process-create-delay-ms", false, 1, null), String.valueOf(l6.longValue()));
        }
        if (startSpan$default.stop(Long.valueOf(j2))) {
            this.startupRecorded.set(true);
        }
        if (l != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "process-init", j, l.longValue(), startSpan$default, null, false, false, null, null, null, 944, null);
        }
        if (l2 != null && l3 != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "embrace-init", l2.longValue(), l3.longValue(), startSpan$default, null, false, false, null, null, null, 944, null);
        }
        Long l7 = l == null ? l3 : l;
        if (l7 != null && l4 != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "activity-init-gap", l7.longValue(), l4.longValue(), startSpan$default, null, false, false, null, null, null, 944, null);
        }
        if (l4 != null && l5 != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "activity-create", l4.longValue(), l5.longValue(), startSpan$default, null, false, false, null, null, null, 944, null);
        }
        if (l5 != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, this.endWithFrameDraw ? "first-frame-render" : "activity-resume", l5.longValue(), j2, startSpan$default, null, false, false, null, null, null, 944, null);
        }
        return startSpan$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordStartup() {
        Long l;
        StartupService startupService = (StartupService) this.startupServiceProvider.mo865invoke();
        if (startupService == null) {
            return;
        }
        Long sdkInitStartMs = startupService.getSdkInitStartMs();
        Long sdkInitEndMs = startupService.getSdkInitEndMs();
        Companion companion = Companion;
        Long duration = companion.duration(sdkInitStartMs, sdkInitEndMs);
        if (this.versionChecker.isAtLeast(24)) {
            l = this.processCreatedMs;
        } else {
            l = this.applicationInitStartMs;
            if (l == null) {
                l = sdkInitStartMs;
            }
        }
        Long l2 = this.versionChecker.isAtLeast(29) ? this.firstFrameRenderedMs : this.startupActivityResumedMs;
        if (l == null || l2 == null) {
            return;
        }
        Long applicationActivityCreationGap = applicationActivityCreationGap();
        Long duration2 = applicationActivityCreationGap == null ? companion.duration(sdkInitEndMs, this.startupActivityInitStartMs) : applicationActivityCreationGap;
        if (duration2 != null) {
            EmbraceSpan embraceSpan = null;
            if (!this.spanService.initialized()) {
                this.logger.log("Startup trace not recorded because the spans service is not initialized", InternalEmbraceLogger.Severity.WARNING, null, false);
            } else if (duration2.longValue() <= 60000) {
                embraceSpan = recordColdTtid(l.longValue(), this.applicationInitEndMs, sdkInitStartMs, sdkInitEndMs, this.startupActivityInitStartMs, this.startupActivityInitEndMs, l2.longValue(), processCreateDelay());
            } else {
                Long l3 = this.startupActivityInitStartMs;
                if (l3 != null) {
                    embraceSpan = recordWarmTtid(l3.longValue(), this.startupActivityInitEndMs, l2.longValue(), processCreateDelay(), duration2, duration);
                }
            }
            if (embraceSpan != null) {
                recordAdditionalIntervals(embraceSpan);
            }
        }
    }

    private final EmbraceSpan recordWarmTtid(long j, Long l, long j2, Long l2, Long l3, Long l4) {
        PersistableEmbraceSpan startSpan$default;
        if (this.startupRecorded.get() || (startSpan$default = SpanService.DefaultImpls.startSpan$default(this.spanService, "warm-time-to-initial-display", null, Long.valueOf(j), null, false, false, 26, null)) == null) {
            return null;
        }
        if (l2 != null) {
            startSpan$default.addAttribute(EmbraceExtensionsKt.toEmbraceAttributeName$default("process-create-delay-ms", false, 1, null), String.valueOf(l2.longValue()));
        }
        if (l3 != null) {
            startSpan$default.addAttribute(EmbraceExtensionsKt.toEmbraceAttributeName$default("activity-init-gap-ms", false, 1, null), String.valueOf(l3.longValue()));
        }
        if (l4 != null) {
            startSpan$default.addAttribute(EmbraceExtensionsKt.toEmbraceAttributeName$default("embrace-init-duration-ms", false, 1, null), String.valueOf(l4.longValue()));
        }
        if (startSpan$default.stop(Long.valueOf(j2))) {
            this.startupRecorded.set(true);
        }
        if (l != null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "activity-create", j, l.longValue(), startSpan$default, null, false, false, null, null, null, 944, null);
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, this.endWithFrameDraw ? "first-frame-render" : "activity-resume", l.longValue(), j2, startSpan$default, null, false, false, null, null, null, 944, null);
        }
        return startSpan$default;
    }

    public static /* synthetic */ void startupActivityInitEnd$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.startupActivityInitEnd(l);
    }

    public static /* synthetic */ void startupActivityInitStart$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.startupActivityInitStart(l);
    }

    public static /* synthetic */ void startupActivityResumed$default(AppStartupTraceEmitter appStartupTraceEmitter, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        appStartupTraceEmitter.startupActivityResumed(l);
    }

    public final void addTrackedInterval(String str, long j, long j2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.additionalTrackedIntervals.add(new TrackedInterval(str, j, j2));
    }

    public final void applicationInitEnd(Long l) {
        this.applicationInitEndMs = Long.valueOf(l != null ? l.longValue() : nowMs());
    }

    public final void applicationInitStart(Long l) {
        this.applicationInitStartMs = Long.valueOf(l != null ? l.longValue() : nowMs());
    }

    public final void firstFrameRendered(Long l) {
        this.firstFrameRenderedMs = Long.valueOf(l != null ? l.longValue() : nowMs());
        if (this.endWithFrameDraw) {
            dataCollectionComplete();
        }
    }

    public final void startupActivityInitEnd(Long l) {
        this.startupActivityInitEndMs = Long.valueOf(l != null ? l.longValue() : nowMs());
    }

    public final void startupActivityInitStart(Long l) {
        if (this.startupActivityInitStartMs == null) {
            this.startupActivityInitStartMs = Long.valueOf(l != null ? l.longValue() : nowMs());
        }
    }

    public final void startupActivityResumed(Long l) {
        this.startupActivityResumedMs = Long.valueOf(l != null ? l.longValue() : nowMs());
        if (this.endWithFrameDraw) {
            return;
        }
        dataCollectionComplete();
    }
}
