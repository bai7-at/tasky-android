package io.embrace.android.embracesdk.internal.logs;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSource;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.Log;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class LogOrchestratorImpl implements LogOrchestrator {
    public static final Companion Companion = new Companion(null);
    private static final long MAX_BATCH_TIME = 5000;
    private static final long MAX_INACTIVITY_TIME = 2000;
    public static final int MAX_LOGS_PER_BATCH = 50;
    private final Clock clock;
    private final DeliveryService deliveryService;
    private volatile AtomicLong firstLogInBatchTime;
    private volatile AtomicLong lastLogTime;
    private final LogEnvelopeSource logEnvelopeSource;
    private final ScheduledWorker logOrchestratorScheduledWorker;
    private volatile ScheduledFuture<?> scheduledCheckFuture;
    private final LogSink sink;

    /* renamed from: io.embrace.android.embracesdk.internal.logs.LogOrchestratorImpl$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
        AnonymousClass1(LogOrchestratorImpl logOrchestratorImpl) {
            super(0, logOrchestratorImpl, LogOrchestratorImpl.class, "onLogsAdded", "onLogsAdded()V", 0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            invoke();
            return ww8.a;
        }

        public final void invoke() {
            ((LogOrchestratorImpl) this.receiver).onLogsAdded();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LogOrchestratorImpl(ScheduledWorker scheduledWorker, Clock clock, LogSink logSink, DeliveryService deliveryService, LogEnvelopeSource logEnvelopeSource) {
        zq3.h(scheduledWorker, "logOrchestratorScheduledWorker");
        zq3.h(clock, "clock");
        zq3.h(logSink, "sink");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(logEnvelopeSource, "logEnvelopeSource");
        this.logOrchestratorScheduledWorker = scheduledWorker;
        this.clock = clock;
        this.sink = logSink;
        this.deliveryService = deliveryService;
        this.logEnvelopeSource = logEnvelopeSource;
        this.lastLogTime = new AtomicLong(0L);
        this.firstLogInBatchTime = new AtomicLong(0L);
        logSink.registerLogStoredCallback(new AnonymousClass1(this));
    }

    private final boolean isMaxBatchTimeReached(long j) {
        long j2 = this.firstLogInBatchTime.get();
        return j2 != 0 && j - j2 >= 5000;
    }

    private final boolean isMaxInactivityTimeReached(long j) {
        return j - this.lastLogTime.get() >= MAX_INACTIVITY_TIME;
    }

    private final boolean isMaxLogsPerBatchReached() {
        return this.sink.completedLogs().size() >= 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLogsAdded() {
        Iterator<T> it2 = this.logEnvelopeSource.getNonbatchedEnvelope().iterator();
        while (it2.hasNext()) {
            this.deliveryService.sendLogs((Envelope) it2.next());
        }
        this.lastLogTime.set(this.clock.now());
        this.firstLogInBatchTime.compareAndSet(0L, this.lastLogTime.get());
        if (sendLogsIfNeeded()) {
            return;
        }
        this.firstLogInBatchTime.compareAndSet(0L, this.lastLogTime.get());
        scheduleCheck();
    }

    private final void scheduleCheck() {
        long now = this.clock.now();
        long j = 5000 - (now - this.firstLogInBatchTime.get());
        long j2 = MAX_INACTIVITY_TIME - (now - this.lastLogTime.get());
        ScheduledFuture<?> scheduledFuture = this.scheduledCheckFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledWorker scheduledWorker = this.logOrchestratorScheduledWorker;
        final LogOrchestratorImpl$scheduleCheck$1 logOrchestratorImpl$scheduleCheck$1 = new LogOrchestratorImpl$scheduleCheck$1(this);
        this.scheduledCheckFuture = scheduledWorker.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.internal.logs.LogOrchestratorImpl$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zq3.g(qs2.this.mo865invoke(), "invoke(...)");
            }
        }, Long.min(j, j2), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean sendLogsIfNeeded() {
        long now = this.clock.now();
        if (!isMaxLogsPerBatchReached() && !isMaxInactivityTimeReached(now) && !isMaxBatchTimeReached(now)) {
            return false;
        }
        flush(false);
        return true;
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogOrchestrator
    public void flush(boolean z) {
        ScheduledFuture<?> scheduledFuture = this.scheduledCheckFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.scheduledCheckFuture = null;
        this.firstLogInBatchTime.set(0L);
        Envelope<LogPayload> batchedLogEnvelope = this.logEnvelopeSource.getBatchedLogEnvelope();
        List<Log> logs = batchedLogEnvelope.getData().getLogs();
        if (logs == null || logs.isEmpty()) {
            return;
        }
        if (z) {
            this.deliveryService.saveLogs(batchedLogEnvelope);
        } else {
            this.deliveryService.sendLogs(batchedLogEnvelope);
        }
    }
}
