package io.embrace.android.embracesdk.comms.api;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public enum Endpoint {
    EVENTS("events", "v1"),
    BLOBS("blobs", "v1"),
    LOGGING("logging", "v1"),
    LOGS("logs", "v2"),
    NETWORK("network", "v1"),
    SESSIONS("sessions", "v1"),
    SESSIONS_V2("spans", "v2"),
    UNKNOWN(DatasetUtils.UNKNOWN_IDENTITY_ID, "v1");

    private volatile boolean isRateLimited;
    private final String path;
    private AtomicInteger rateLimitRetryCount = new AtomicInteger(0);
    private final String version;

    Endpoint(String str, String str2) {
        this.path = str;
        this.version = str2;
    }

    private final long calculateDelay(Long l) {
        return l != null ? l.longValue() : (long) Math.pow(3.0d, this.rateLimitRetryCount.get());
    }

    public final void clearRateLimit() {
        synchronized (this) {
            this.isRateLimited = false;
            this.rateLimitRetryCount.set(0);
            ww8 ww8Var = ww8.a;
        }
    }

    public final String getPath() {
        return this.path;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isRateLimited() {
        return this.isRateLimited;
    }

    public final void scheduleRetry(ScheduledWorker scheduledWorker, Long l, final qs2 qs2Var) {
        zq3.h(scheduledWorker, "scheduledWorker");
        zq3.h(qs2Var, "retryMethod");
        scheduledWorker.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.comms.api.Endpoint$scheduleRetry$retryTask$1
            @Override // java.lang.Runnable
            public final void run() {
                qs2.this.mo865invoke();
            }
        }, calculateDelay(l), TimeUnit.SECONDS);
    }

    public final void updateRateLimitStatus() {
        synchronized (this) {
            this.isRateLimited = true;
            this.rateLimitRetryCount.incrementAndGet();
        }
    }
}
