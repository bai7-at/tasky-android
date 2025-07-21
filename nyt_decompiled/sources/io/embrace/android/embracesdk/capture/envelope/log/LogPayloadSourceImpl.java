package io.embrace.android.embracesdk.capture.envelope.log;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.logs.LogSink;
import io.embrace.android.embracesdk.internal.payload.Log;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class LogPayloadSourceImpl implements LogPayloadSource {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_PAYLOADS = 10;
    private final LogSink logSink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LogPayloadSourceImpl(LogSink logSink) {
        zq3.h(logSink, "logSink");
        this.logSink = logSink;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.log.LogPayloadSource
    public LogPayload getBatchedLogPayload() {
        return new LogPayload(this.logSink.flushLogs());
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.log.LogPayloadSource
    public List<LogPayload> getNonbatchedLogPayloads() {
        ArrayList arrayList = new ArrayList();
        Log pollNonbatchedLog = this.logSink.pollNonbatchedLog();
        while (pollNonbatchedLog != null) {
            arrayList.add(new LogPayload(i.e(pollNonbatchedLog)));
            pollNonbatchedLog = arrayList.size() < 10 ? this.logSink.pollNonbatchedLog() : null;
        }
        return arrayList;
    }
}
