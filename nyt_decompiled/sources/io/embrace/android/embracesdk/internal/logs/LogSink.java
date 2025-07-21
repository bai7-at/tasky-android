package io.embrace.android.embracesdk.internal.logs;

import defpackage.gq0;
import defpackage.qs2;
import defpackage.s84;
import io.embrace.android.embracesdk.internal.payload.Log;
import java.util.List;

/* loaded from: classes5.dex */
public interface LogSink {
    List<Log> completedLogs();

    List<Log> flushLogs();

    Log pollNonbatchedLog();

    void registerLogStoredCallback(qs2 qs2Var);

    gq0 storeLogs(List<? extends s84> list);
}
