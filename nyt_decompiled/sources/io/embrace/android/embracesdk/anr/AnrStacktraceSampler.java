package io.embrace.android.embracesdk.anr;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.detection.ThreadMonitoringState;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ThreadEnforcementCheckKt;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.payload.AnrInterval;
import io.embrace.android.embracesdk.payload.AnrSample;
import io.embrace.android.embracesdk.payload.AnrSampleList;
import io.embrace.android.embracesdk.payload.extensions.AnrIntervalExtKt;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AnrStacktraceSampler implements BlockedThreadListener, MemoryCleanerListener {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_ANR_INTERVAL_COUNT = 100;
    private final CopyOnWriteArrayList<AnrInterval> anrIntervals;
    private final AtomicReference<Thread> anrMonitorThread;
    private final ScheduledWorker anrMonitorWorker;
    private final Clock clock;
    private ConfigService configService;
    private long lastUnblockedMs;
    private final List<AnrSample> samples;
    private final ThreadInfoCollector threadInfoCollector;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnrStacktraceSampler(ConfigService configService, Clock clock, Thread thread, AtomicReference<Thread> atomicReference, ScheduledWorker scheduledWorker) {
        zq3.h(configService, "configService");
        zq3.h(clock, "clock");
        zq3.h(thread, "targetThread");
        zq3.h(atomicReference, "anrMonitorThread");
        zq3.h(scheduledWorker, "anrMonitorWorker");
        this.configService = configService;
        this.clock = clock;
        this.anrMonitorThread = atomicReference;
        this.anrMonitorWorker = scheduledWorker;
        this.anrIntervals = new CopyOnWriteArrayList<>();
        this.samples = new ArrayList();
        this.threadInfoCollector = new ThreadInfoCollector(thread);
    }

    private final List<AnrInterval> findIntervalsWithSamples() {
        CopyOnWriteArrayList<AnrInterval> copyOnWriteArrayList = this.anrIntervals;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (AnrIntervalExtKt.hasSamples((AnrInterval) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.AnrStacktraceSampler$cleanCollections$1
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference;
                atomicReference = AnrStacktraceSampler.this.anrMonitorThread;
                ThreadEnforcementCheckKt.enforceThread(atomicReference);
                i.I(AnrStacktraceSampler.this.getAnrIntervals$embrace_android_sdk_release(), new ss2() { // from class: io.embrace.android.embracesdk.anr.AnrStacktraceSampler$cleanCollections$1.1
                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return Boolean.valueOf(invoke((AnrInterval) obj));
                    }

                    public final boolean invoke(AnrInterval anrInterval) {
                        return anrInterval.getEndTime() != null;
                    }
                });
            }
        });
    }

    public final AnrInterval findLeastValuableIntervalWithSamples$embrace_android_sdk_release() {
        Object obj;
        Iterator<T> it2 = findIntervalsWithSamples().iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                long duration = AnrIntervalExtKt.duration((AnrInterval) next);
                do {
                    Object next2 = it2.next();
                    long duration2 = AnrIntervalExtKt.duration((AnrInterval) next2);
                    if (duration > duration2) {
                        next = next2;
                        duration = duration2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (AnrInterval) obj;
    }

    public final List<AnrInterval> getAnrIntervals(ThreadMonitoringState threadMonitoringState, Clock clock) {
        ArrayList arrayList;
        zq3.h(threadMonitoringState, TransferTable.COLUMN_STATE);
        zq3.h(clock, "clock");
        synchronized (this.anrIntervals) {
            try {
                List a1 = i.a1(this.anrIntervals);
                if (threadMonitoringState.getAnrInProgress()) {
                    a1.add(new AnrInterval(threadMonitoringState.getLastTargetThreadResponseMs(), Long.valueOf(clock.now()), null, AnrInterval.Type.UI, new AnrSampleList(i.X0(this.samples)), null, 32, null));
                }
                List list = a1;
                arrayList = new ArrayList(i.w(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(AnrIntervalExtKt.deepCopy((AnrInterval) it2.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final CopyOnWriteArrayList<AnrInterval> getAnrIntervals$embrace_android_sdk_release() {
        return this.anrIntervals;
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        this.threadInfoCollector.clearStacktraceCache();
        this.lastUnblockedMs = j;
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlockedInterval(Thread thread, long j) {
        AnrSample anrSample;
        zq3.h(thread, "thread");
        if (size$embrace_android_sdk_release() >= this.configService.getAnrBehavior().getMaxStacktracesPerInterval()) {
            anrSample = new AnrSample(j, null, 0L, 1);
        } else {
            anrSample = new AnrSample(j, this.threadInfoCollector.captureSample(this.configService), Long.valueOf(this.clock.now() - this.clock.now()), null, 8, null);
        }
        this.samples.add(anrSample);
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadUnblocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        AnrInterval anrInterval = new AnrInterval(this.lastUnblockedMs, null, Long.valueOf(j), AnrInterval.Type.UI, new AnrSampleList(i.X0(this.samples)), null, 32, null);
        synchronized (this.anrIntervals) {
            try {
                if (this.anrIntervals.size() < 100) {
                    this.anrIntervals.add(anrInterval);
                    while (reachedAnrStacktraceCaptureLimit$embrace_android_sdk_release()) {
                        AnrInterval findLeastValuableIntervalWithSamples$embrace_android_sdk_release = findLeastValuableIntervalWithSamples$embrace_android_sdk_release();
                        if (findLeastValuableIntervalWithSamples$embrace_android_sdk_release != null) {
                            int indexOf = this.anrIntervals.indexOf(findLeastValuableIntervalWithSamples$embrace_android_sdk_release);
                            this.anrIntervals.remove(findLeastValuableIntervalWithSamples$embrace_android_sdk_release);
                            this.anrIntervals.add(indexOf, AnrIntervalExtKt.clearSamples(findLeastValuableIntervalWithSamples$embrace_android_sdk_release));
                        }
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.samples.clear();
        this.lastUnblockedMs = j;
        this.threadInfoCollector.clearStacktraceCache();
    }

    public final boolean reachedAnrStacktraceCaptureLimit$embrace_android_sdk_release() {
        return findIntervalsWithSamples().size() > this.configService.getAnrBehavior().getMaxAnrIntervalsPerSession();
    }

    public final void setConfigService(ConfigService configService) {
        zq3.h(configService, "configService");
        this.configService = configService;
    }

    public final int size$embrace_android_sdk_release() {
        return this.samples.size();
    }
}
