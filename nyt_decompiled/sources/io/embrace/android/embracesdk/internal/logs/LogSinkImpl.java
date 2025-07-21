package io.embrace.android.embracesdk.internal.logs;

import defpackage.gq0;
import defpackage.qs2;
import defpackage.s84;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.SendImmediately;
import io.embrace.android.embracesdk.internal.payload.Log;
import io.embrace.android.embracesdk.internal.payload.LogMapperKt;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.utils.CollectionExtensionsKt;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class LogSinkImpl implements LogSink {
    private qs2 onLogsStored;
    private final ConcurrentLinkedQueue<Log> storedLogs = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<Log> nonbatchedLogs = new ConcurrentLinkedQueue<>();
    private final Object flushLock = new Object();

    @Override // io.embrace.android.embracesdk.internal.logs.LogSink
    public List<Log> completedLogs() {
        return i.X0(this.storedLogs);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogSink
    public List<Log> flushLogs() {
        List<Log> threadSafeTake;
        synchronized (this.flushLock) {
            threadSafeTake = CollectionExtensionsKt.threadSafeTake(this.storedLogs, Math.min(this.storedLogs.size(), 50));
            this.storedLogs.removeAll(i.c1(threadSafeTake));
        }
        return threadSafeTake;
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogSink
    public Log pollNonbatchedLog() {
        return this.nonbatchedLogs.poll();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogSink
    public void registerLogStoredCallback(qs2 qs2Var) {
        zq3.h(qs2Var, "onLogsStored");
        this.onLogsStored = qs2Var;
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogSink
    public gq0 storeLogs(List<? extends s84> list) {
        zq3.h(list, "logs");
        try {
            for (s84 s84Var : list) {
                if (EmbraceExtensionsKt.hasFixedAttribute(s84Var, SendImmediately.INSTANCE)) {
                    this.nonbatchedLogs.add(LogMapperKt.toNewPayload(s84Var));
                } else {
                    this.storedLogs.add(LogMapperKt.toNewPayload(s84Var));
                }
            }
            qs2 qs2Var = this.onLogsStored;
            if (qs2Var != null) {
            }
            gq0 i = gq0.i();
            zq3.g(i, "CompletableResultCode.ofSuccess()");
            return i;
        } catch (Throwable unused) {
            gq0 h = gq0.h();
            zq3.g(h, "CompletableResultCode.ofFailure()");
            return h;
        }
    }
}
