package io.embrace.android.embracesdk.internal.logs;

import defpackage.gq0;
import defpackage.s84;
import defpackage.t84;
import defpackage.zq3;
import java.util.Collection;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class EmbraceLogRecordExporter implements t84 {
    private final LogSink logSink;

    public EmbraceLogRecordExporter(LogSink logSink) {
        zq3.h(logSink, "logSink");
        this.logSink = logSink;
    }

    @Override // defpackage.t84, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // defpackage.t84
    public gq0 export(Collection<? extends s84> collection) {
        zq3.h(collection, "logs");
        return this.logSink.storeLogs(i.X0(collection));
    }

    public gq0 flush() {
        gq0 i = gq0.i();
        zq3.g(i, "CompletableResultCode.ofSuccess()");
        return i;
    }

    @Override // defpackage.t84
    public gq0 shutdown() {
        gq0 i = gq0.i();
        zq3.g(i, "CompletableResultCode.ofSuccess()");
        return i;
    }
}
