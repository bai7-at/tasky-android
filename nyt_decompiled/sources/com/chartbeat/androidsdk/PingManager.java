package com.chartbeat.androidsdk;

import android.os.Handler;
import android.os.Looper;
import defpackage.gb8;
import defpackage.jc5;
import defpackage.ps2;
import defpackage.uc5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class PingManager {
    private static final String DEFAULT_EXIT_VIEW_DECAY_TIME_IN_SECONDS = "90";
    private static final int DEFAULT_PING_DECAY = 30;
    private static final int DEFAULT_PING_INTERVAL_IN_SECONDS = 15;
    private static final long HOUR = 3600000;
    private static final long MAX_SDK_RUN_TIME = 7200000;
    private static final long MINUTE = 60000;
    private static final long SECOND = 1000;
    private static final long SERVER_BUSY_WAIT_WINDOW = 600000;
    private static final String TAG = "PingManager";
    private static Handler handler;
    private uc5 pingObserver;
    private gb8 pingSubscription;
    private final ChartBeatTracker tracker;
    private volatile long lastActiveTimestamp = System.currentTimeMillis();
    private int pingInterval = 15;
    private volatile boolean isSuspended = false;
    private volatile long suspensionTime = 0;
    private boolean wasInBackground = false;
    private boolean inBackground = false;

    PingManager(ChartBeatTracker chartBeatTracker, Looper looper) {
        this.tracker = chartBeatTracker;
        try {
            handler = new Handler(looper);
            this.pingObserver = new uc5() { // from class: com.chartbeat.androidsdk.PingManager.1
                @Override // defpackage.uc5
                public void onCompleted() {
                }

                @Override // defpackage.uc5
                public void onError(Throwable th) {
                    th.printStackTrace();
                }

                @Override // defpackage.uc5
                public void onNext(Object obj) {
                    if (PingManager.handler.getLooper().getThread().isAlive()) {
                        PingManager.handler.post(new Runnable() { // from class: com.chartbeat.androidsdk.PingManager.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                PingManager.this.runTask();
                            }
                        });
                    }
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDormant() {
        return System.currentTimeMillis() - this.lastActiveTimestamp > MAX_SDK_RUN_TIME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isServerSuspended() {
        if (this.isSuspended && System.currentTimeMillis() - this.suspensionTime > 600000) {
            this.isSuspended = false;
        }
        return this.isSuspended;
    }

    private void restartForBackground() {
        stop();
        alive();
        start(this.pingInterval * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runTask() {
        try {
            if (this.inBackground) {
                this.wasInBackground = true;
            } else {
                this.tracker.ping(this.wasInBackground, String.valueOf(30));
                this.wasInBackground = false;
            }
        } catch (Exception e) {
            Logger.e(TAG, "Problem executing: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    private void start(int i) {
        try {
            this.pingSubscription = jc5.d(0L, i, TimeUnit.SECONDS).c(new ps2() { // from class: com.chartbeat.androidsdk.PingManager.3
                @Override // defpackage.ps2
                public Boolean call(Long l) {
                    return PingManager.this.isServerSuspended() ? Boolean.FALSE : Boolean.TRUE;
                }
            }).c(new ps2() { // from class: com.chartbeat.androidsdk.PingManager.2
                @Override // defpackage.ps2
                public Boolean call(Long l) {
                    return PingManager.this.isDormant() ? Boolean.FALSE : Boolean.TRUE;
                }
            }).m(this.pingObserver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void alive() {
        this.lastActiveTimestamp = System.currentTimeMillis();
        if (this.inBackground) {
            restart();
        }
    }

    int expectedNextIntervalInSeconds() {
        return this.pingInterval;
    }

    long getPingInterval() {
        return this.pingInterval;
    }

    void restart() {
        this.inBackground = false;
        stop();
        start(this.pingInterval);
    }

    void retryImmediately() {
        restart();
    }

    void setInBackground(boolean z) {
        this.inBackground = z;
    }

    void stop() {
        gb8 gb8Var = this.pingSubscription;
        if (gb8Var != null) {
            gb8Var.unsubscribe();
        }
    }

    void suspendDueToServerBusy() {
        this.suspensionTime = System.currentTimeMillis();
        this.isSuspended = true;
    }
}
