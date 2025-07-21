package io.embrace.android.embracesdk.internal.logs;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureDataSource;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class CompositeLogService implements LogMessageService {
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;
    private final qs2 networkCaptureDataSource;
    private final EmbraceSerializer serializer;
    private final qs2 v1LogService;
    private final qs2 v2LogService;

    public CompositeLogService(qs2 qs2Var, qs2 qs2Var2, qs2 qs2Var3, ConfigService configService, InternalEmbraceLogger internalEmbraceLogger, EmbraceSerializer embraceSerializer) {
        zq3.h(qs2Var, "v1LogService");
        zq3.h(qs2Var2, "v2LogService");
        zq3.h(qs2Var3, "networkCaptureDataSource");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(embraceSerializer, "serializer");
        this.v1LogService = qs2Var;
        this.v2LogService = qs2Var2;
        this.networkCaptureDataSource = qs2Var3;
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        this.serializer = embraceSerializer;
    }

    private final BaseLogService getBaseLogService() {
        return (BaseLogService) (getUseV2LogService() ? this.v2LogService : this.v1LogService).mo865invoke();
    }

    private final boolean getUseV2LogService() {
        return this.configService.getOTelBehavior().isStableEnabled();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        getBaseLogService().cleanCollections();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findErrorLogIds(long j, long j2) {
        return getBaseLogService().findErrorLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findInfoLogIds(long j, long j2) {
        return getBaseLogService().findInfoLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public List<String> findNetworkLogIds(long j, long j2) {
        return ((LogMessageService) this.v1LogService.mo865invoke()).findNetworkLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findWarningLogIds(long j, long j2) {
        return getBaseLogService().findWarningLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getErrorLogsAttemptedToSend() {
        return getBaseLogService().getErrorLogsAttemptedToSend();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getInfoLogsAttemptedToSend() {
        return getBaseLogService().getInfoLogsAttemptedToSend();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getUnhandledExceptionsSent() {
        return getBaseLogService().getUnhandledExceptionsSent();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getWarnLogsAttemptedToSend() {
        return getBaseLogService().getWarnLogsAttemptedToSend();
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public void log(String str, EventType eventType, LogExceptionType logExceptionType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr, String str2, Embrace.AppFramework appFramework, String str3, String str4, String str5, String str6) {
        String str7;
        zq3.h(str, "message");
        zq3.h(eventType, TransferTable.COLUMN_TYPE);
        zq3.h(logExceptionType, "logExceptionType");
        zq3.h(appFramework, "framework");
        if (!getUseV2LogService()) {
            ((LogMessageService) this.v1LogService.mo865invoke()).log(str, eventType, logExceptionType, map, stackTraceElementArr, str2, appFramework, str3, str4, str5, str6);
            return;
        }
        if (eventType.getSeverity() == null) {
            this.logger.log("Invalid event type for log: " + eventType, InternalEmbraceLogger.Severity.ERROR, null, false);
            return;
        }
        Severity severity = eventType.getSeverity();
        if (severity == null) {
            severity = Severity.INFO;
        }
        if (logExceptionType == LogExceptionType.NONE) {
            ((LogService) this.v2LogService.mo865invoke()).log(str, severity, map);
            return;
        }
        if (stackTraceElementArr != null) {
            ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.toString());
            }
            str7 = this.serializer.toJson((EmbraceSerializer) i.X0(i.P0(arrayList, 200)), (Class<EmbraceSerializer>) List.class);
        } else {
            str7 = str2;
        }
        if (appFramework == Embrace.AppFramework.FLUTTER) {
            ((LogService) this.v2LogService.mo865invoke()).logFlutterException(str, severity, logExceptionType, map, str7, str5, str6, str3, str4);
        } else {
            ((LogService) this.v2LogService.mo865invoke()).logException(str, severity, logExceptionType, map, str7, appFramework, str5, str6);
        }
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public void logNetwork(NetworkCapturedCall networkCapturedCall) {
        if (!getUseV2LogService()) {
            ((LogMessageService) this.v1LogService.mo865invoke()).logNetwork(networkCapturedCall);
        } else if (networkCapturedCall != null) {
            ((NetworkCaptureDataSource) this.networkCaptureDataSource.mo865invoke()).logNetworkCapturedCall(networkCapturedCall);
        }
    }
}
