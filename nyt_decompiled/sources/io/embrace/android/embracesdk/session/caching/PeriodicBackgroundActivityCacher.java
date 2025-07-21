package io.embrace.android.embracesdk.session.caching;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class PeriodicBackgroundActivityCacher {
    public static final Companion Companion = new Companion(null);
    private static final long MIN_INTERVAL_BETWEEN_SAVES = 5000;
    private final Clock clock;
    private long lastSaved;
    private final InternalEmbraceLogger logger;
    private ScheduledFuture<?> scheduledFuture;
    private final ScheduledWorker scheduledWorker;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PeriodicBackgroundActivityCacher(Clock clock, ScheduledWorker scheduledWorker, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(clock, "clock");
        zq3.h(scheduledWorker, "scheduledWorker");
        zq3.h(internalEmbraceLogger, "logger");
        this.clock = clock;
        this.scheduledWorker = scheduledWorker;
        this.logger = internalEmbraceLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateDelay() {
        return Math.max(0L, 5000 - (this.clock.now() - this.lastSaved));
    }

    public final void scheduleSave(final qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        long calculateDelay = calculateDelay();
        final qs2 qs2Var2 = new qs2() { // from class: io.embrace.android.embracesdk.session.caching.PeriodicBackgroundActivityCacher$scheduleSave$action$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                InternalEmbraceLogger internalEmbraceLogger;
                long calculateDelay2;
                Clock clock;
                try {
                    calculateDelay2 = PeriodicBackgroundActivityCacher.this.calculateDelay();
                    if (calculateDelay2 <= 0) {
                        qs2Var.mo865invoke();
                        PeriodicBackgroundActivityCacher periodicBackgroundActivityCacher = PeriodicBackgroundActivityCacher.this;
                        clock = periodicBackgroundActivityCacher.clock;
                        periodicBackgroundActivityCacher.lastSaved = clock.now();
                    }
                } catch (Exception e) {
                    internalEmbraceLogger = PeriodicBackgroundActivityCacher.this.logger;
                    internalEmbraceLogger.log("Error while caching active session", InternalEmbraceLogger.Severity.DEBUG, e, true);
                }
            }
        };
        this.scheduledFuture = this.scheduledWorker.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.session.caching.PeriodicBackgroundActivityCacher$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zq3.g(qs2.this.mo865invoke(), "invoke(...)");
            }
        }, calculateDelay, TimeUnit.MILLISECONDS);
    }

    public final void stop() {
        ScheduledFuture<?> scheduledFuture = this.scheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
