package com.chartbeat.androidsdk;

import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class EngagementTracker {
    private static final int ENGAGEMENT_CHECK_PERIOD = 1000;
    private static final String ENGAGEMENT_TRACKING_THREAD_NAME = "Engagement_Timer";
    private static final int INITIAL_DELAY = 0;
    private static final int SECOND = 1000;
    private static final String TAG = "EngagementTracker";
    private Timer timer;
    private boolean engaged = false;
    private boolean typed = false;
    private EngagementTask engagementTask = new EngagementTask();

    static final class EngagementSnapshot {
        final boolean engaged;
        final long engagementSinceLastPing;
        final boolean idle;
        final boolean reading;
        final long totalEngagement;
        final boolean typed;

        public EngagementSnapshot(long j, long j2, boolean z, boolean z2) {
            this.engaged = z;
            this.typed = z2;
            this.reading = z && !z2;
            this.idle = !z;
            this.engagementSinceLastPing = j2;
            this.totalEngagement = j;
        }
    }

    private static final class EngagementTask extends TimerTask {
        private static final int ENGAGEMENT_WINDOW = 5000;
        private static final int INITIAL_ENGAGEMENT_WINDOW = 5000;
        private static final int SECOND = 1000;
        private long lastEngagedTime;
        private final long startTime = System.currentTimeMillis();
        private AtomicLong totalEngagementCount = new AtomicLong(0);
        private AtomicLong engagementSinceLastPing = new AtomicLong(0);

        public EngagementTask() {
            this.lastEngagedTime = 0L;
            this.lastEngagedTime = 0L;
        }

        public void engage() {
            this.lastEngagedTime = System.currentTimeMillis();
        }

        public long getEngagementSinceLastPing() {
            long longValue = this.engagementSinceLastPing.longValue();
            this.engagementSinceLastPing.set(0L);
            return longValue;
        }

        public long getTotalEngagementCount() {
            return this.totalEngagementCount.longValue();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastEngagedTime;
            long j2 = currentTimeMillis - this.startTime;
            if (j < BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT || j2 < BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT) {
                this.totalEngagementCount.incrementAndGet();
                this.engagementSinceLastPing.incrementAndGet();
            }
        }
    }

    EngagementTracker() {
    }

    synchronized EngagementSnapshot getEngagementSnapshot() {
        EngagementSnapshot engagementSnapshot;
        engagementSnapshot = new EngagementSnapshot(this.engagementTask.getTotalEngagementCount(), this.engagementTask.getEngagementSinceLastPing(), this.engaged, this.typed);
        this.engaged = false;
        this.typed = false;
        return engagementSnapshot;
    }

    synchronized void lastPingFailed(EngagementSnapshot engagementSnapshot) {
        this.engaged |= engagementSnapshot.engaged;
        this.typed = engagementSnapshot.typed | this.typed;
    }

    synchronized void stop() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer.purge();
        }
    }

    synchronized void userEngaged() {
        this.engaged = true;
        this.engagementTask.engage();
    }

    synchronized void userEnteredView() {
        try {
            stop();
            this.engagementTask = new EngagementTask();
            Timer timer = new Timer(ENGAGEMENT_TRACKING_THREAD_NAME);
            this.timer = timer;
            timer.schedule(this.engagementTask, 0L, 1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void userLeftView() {
        stop();
    }

    synchronized void userTyped() {
        this.typed = true;
        this.engagementTask.engage();
    }
}
