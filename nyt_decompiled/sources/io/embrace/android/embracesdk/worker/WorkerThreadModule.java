package io.embrace.android.embracesdk.worker;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public interface WorkerThreadModule extends Closeable {
    BackgroundWorker backgroundWorker(WorkerName workerName);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    AtomicReference<Thread> getAnrMonitorThread();

    ScheduledWorker scheduledWorker(WorkerName workerName);
}
