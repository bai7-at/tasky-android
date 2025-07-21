package io.embrace.android.embracesdk.internal.logs;

import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import java.util.List;

/* loaded from: classes5.dex */
public interface BaseLogService extends MemoryCleanerListener {
    List<String> findErrorLogIds(long j, long j2);

    List<String> findInfoLogIds(long j, long j2);

    List<String> findWarningLogIds(long j, long j2);

    int getErrorLogsAttemptedToSend();

    int getInfoLogsAttemptedToSend();

    int getUnhandledExceptionsSent();

    int getWarnLogsAttemptedToSend();
}
