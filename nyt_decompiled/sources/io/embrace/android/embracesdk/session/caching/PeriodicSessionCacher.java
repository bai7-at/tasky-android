package io.embrace.android.embracesdk.session.caching;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class PeriodicSessionCacher {
    public static final Companion Companion = new Companion(null);
    private static final int SESSION_CACHING_INTERVAL = 2;
    private final InternalEmbraceLogger logger;
    private ScheduledFuture<?> scheduledFuture;
    private final ScheduledWorker sessionPeriodicCacheScheduledWorker;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PeriodicSessionCacher(ScheduledWorker scheduledWorker, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(scheduledWorker, "sessionPeriodicCacheScheduledWorker");
        zq3.h(internalEmbraceLogger, "logger");
        this.sessionPeriodicCacheScheduledWorker = scheduledWorker;
        this.logger = internalEmbraceLogger;
    }

    private final Runnable onPeriodicCache(final qs2 qs2Var) {
        return new Runnable() { // from class: io.embrace.android.embracesdk.session.caching.PeriodicSessionCacher$onPeriodicCache$1
            @Override // java.lang.Runnable
            public final void run() {
                InternalEmbraceLogger internalEmbraceLogger;
                try {
                    Systrace.startSynchronous("snapshot-session");
                    try {
                        qs2Var.mo865invoke();
                    } catch (Exception e) {
                        internalEmbraceLogger = PeriodicSessionCacher.this.logger;
                        internalEmbraceLogger.log("Error while caching active session", InternalEmbraceLogger.Severity.DEBUG, e, true);
                    }
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
        };
    }

    public final void start(qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        this.scheduledFuture = this.sessionPeriodicCacheScheduledWorker.scheduleWithFixedDelay(onPeriodicCache(qs2Var), 0L, 2, TimeUnit.SECONDS);
    }

    public final void stop() {
        ScheduledFuture<?> scheduledFuture = this.scheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
