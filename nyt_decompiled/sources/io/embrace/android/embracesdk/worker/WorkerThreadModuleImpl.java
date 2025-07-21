package io.embrace.android.embracesdk.worker;

import defpackage.zq3;
import io.embrace.android.embracesdk.injection.InitModule;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class WorkerThreadModuleImpl implements WorkerThreadModule, RejectedExecutionHandler {
    private final AtomicReference<Thread> anrMonitorThread;
    private final Map<WorkerName, BackgroundWorker> backgroundWorkers;
    private final Clock clock;
    private final Map<WorkerName, ExecutorService> executors;
    private final InternalEmbraceLogger logger;
    private final Map<WorkerName, ScheduledWorker> scheduledWorkers;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerName.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[WorkerName.NETWORK_REQUEST.ordinal()] = 1;
        }
    }

    public WorkerThreadModuleImpl(InitModule initModule) {
        zq3.h(initModule, "initModule");
        this.clock = initModule.getClock();
        this.logger = initModule.getLogger();
        this.executors = new ConcurrentHashMap();
        this.backgroundWorkers = new ConcurrentHashMap();
        this.scheduledWorkers = new ConcurrentHashMap();
        this.anrMonitorThread = new AtomicReference<>();
    }

    private final ThreadFactory createThreadFactory(final WorkerName workerName) {
        return new ThreadFactory() { // from class: io.embrace.android.embracesdk.worker.WorkerThreadModuleImpl$createThreadFactory$1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                zq3.h(runnable, "runnable");
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                if (workerName == WorkerName.ANR_MONITOR) {
                    WorkerThreadModuleImpl.this.getAnrMonitorThread().set(newThread);
                }
                zq3.g(newThread, "this");
                newThread.setName("emb-" + workerName.getThreadName$embrace_android_sdk_release());
                return newThread;
            }
        };
    }

    private final ExecutorService fetchExecutor(WorkerName workerName) {
        Map<WorkerName, ExecutorService> map = this.executors;
        ExecutorService executorService = map.get(workerName);
        if (executorService == null) {
            ThreadFactory createThreadFactory = createThreadFactory(workerName);
            executorService = WhenMappings.$EnumSwitchMapping$0[workerName.ordinal()] != 1 ? new ScheduledThreadPoolExecutor(1, createThreadFactory, this) : new PriorityThreadPoolExecutor(this.clock, createThreadFactory, this, 1, 1);
            map.put(workerName, executorService);
        }
        return executorService;
    }

    @Override // io.embrace.android.embracesdk.worker.WorkerThreadModule
    public BackgroundWorker backgroundWorker(WorkerName workerName) {
        zq3.h(workerName, "workerName");
        Map<WorkerName, BackgroundWorker> map = this.backgroundWorkers;
        BackgroundWorker backgroundWorker = map.get(workerName);
        if (backgroundWorker == null) {
            backgroundWorker = new BackgroundWorker(fetchExecutor(workerName));
            map.put(workerName, backgroundWorker);
        }
        return backgroundWorker;
    }

    @Override // io.embrace.android.embracesdk.worker.WorkerThreadModule, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it2 = this.executors.values().iterator();
        while (it2.hasNext()) {
            ((ExecutorService) it2.next()).shutdown();
        }
    }

    @Override // io.embrace.android.embracesdk.worker.WorkerThreadModule
    public AtomicReference<Thread> getAnrMonitorThread() {
        return this.anrMonitorThread;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        zq3.h(runnable, "runnable");
        zq3.h(threadPoolExecutor, "executor");
        this.logger.log("Rejected execution of " + runnable + " on " + threadPoolExecutor + ". Ignoring - the process is likely terminating.", InternalEmbraceLogger.Severity.WARNING, null, false);
    }

    @Override // io.embrace.android.embracesdk.worker.WorkerThreadModule
    public ScheduledWorker scheduledWorker(WorkerName workerName) {
        zq3.h(workerName, "workerName");
        if (workerName == WorkerName.NETWORK_REQUEST) {
            throw new IllegalStateException("Network request executor is not a scheduled executor");
        }
        Map<WorkerName, ScheduledWorker> map = this.scheduledWorkers;
        ScheduledWorker scheduledWorker = map.get(workerName);
        if (scheduledWorker == null) {
            ExecutorService fetchExecutor = fetchExecutor(workerName);
            if (fetchExecutor == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.concurrent.ScheduledExecutorService");
            }
            scheduledWorker = new ScheduledWorker((ScheduledExecutorService) fetchExecutor);
            map.put(workerName, scheduledWorker);
        }
        return scheduledWorker;
    }
}
