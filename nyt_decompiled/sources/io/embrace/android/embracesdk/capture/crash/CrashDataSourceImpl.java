package io.embrace.android.embracesdk.capture.crash;

import defpackage.dv;
import defpackage.yj0;
import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.limits.NoopLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.arch.schema.TelemetryAttributes;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.crash.CrashFileMarker;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.internal.utils.EncodingExtensionsKt;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetryAttributeKeysKt;
import io.embrace.android.embracesdk.payload.JsException;
import io.embrace.android.embracesdk.payload.LegacyExceptionInfo;
import io.embrace.android.embracesdk.payload.ThreadInfo;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CrashDataSourceImpl extends DataSourceImpl<LogWriter> implements CrashDataSource {
    private final AnrService anrService;
    private final ConfigService configService;
    private final CrashFileMarker crashMarker;
    private JsException jsException;
    private final LogOrchestrator logOrchestrator;
    private final LogWriter logWriter;
    private boolean mainCrashHandled;
    private final NdkService ndkService;
    private final PreferencesService preferencesService;
    private final EmbraceSerializer serializer;
    private final SessionOrchestrator sessionOrchestrator;
    private final EmbraceSessionProperties sessionProperties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashDataSourceImpl(LogOrchestrator logOrchestrator, SessionOrchestrator sessionOrchestrator, EmbraceSessionProperties embraceSessionProperties, AnrService anrService, NdkService ndkService, PreferencesService preferencesService, CrashFileMarker crashFileMarker, LogWriter logWriter, ConfigService configService, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        super(logWriter, internalEmbraceLogger, NoopLimitStrategy.INSTANCE);
        zq3.h(logOrchestrator, "logOrchestrator");
        zq3.h(sessionOrchestrator, "sessionOrchestrator");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(ndkService, "ndkService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(crashFileMarker, "crashMarker");
        zq3.h(logWriter, "logWriter");
        zq3.h(configService, "configService");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.logOrchestrator = logOrchestrator;
        this.sessionOrchestrator = sessionOrchestrator;
        this.sessionProperties = embraceSessionProperties;
        this.anrService = anrService;
        this.ndkService = ndkService;
        this.preferencesService = preferencesService;
        this.crashMarker = crashFileMarker;
        this.logWriter = logWriter;
        this.configService = configService;
        this.serializer = embraceSerializer;
    }

    private final String encodeToUTF8String(String str) {
        Charset charset = yj0.b;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
        return EncodingExtensionsKt.toUTF8String(bytes);
    }

    private final String getExceptionCause(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !zq3.c(th, th.getCause())) {
            LegacyExceptionInfo ofThrowable = LegacyExceptionInfo.Companion.ofThrowable(th);
            if (arrayList.contains(ofThrowable)) {
                break;
            }
            arrayList.add(0, ofThrowable);
            th = th.getCause();
        }
        return this.serializer.toJson((EmbraceSerializer) arrayList, (Class<EmbraceSerializer>) List.class);
    }

    private final SchemaType getSchemaType(TelemetryAttributes telemetryAttributes) {
        return telemetryAttributes.getAttribute(EmbType.System.ReactNativeCrash.INSTANCE.getEmbAndroidReactNativeCrashJsException()) != null ? new SchemaType.ReactNativeCrash(telemetryAttributes) : new SchemaType.Crash(telemetryAttributes);
    }

    private final String getThreadsInfo() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        zq3.g(allStackTraces, "Thread.getAllStackTraces()");
        ArrayList arrayList = new ArrayList(allStackTraces.size());
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            ThreadInfo.Companion companion = ThreadInfo.Companion;
            Thread key = entry.getKey();
            zq3.g(key, "it.key");
            StackTraceElement[] value = entry.getValue();
            zq3.g(value, "it.value");
            arrayList.add(ThreadInfo.Companion.ofThread$default(companion, key, value, 0, 4, null));
        }
        return this.serializer.toJson((EmbraceSerializer) arrayList, (Class<EmbraceSerializer>) List.class);
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void handleCrash(Throwable th) {
        zq3.h(th, "exception");
        if (this.mainCrashHandled) {
            return;
        }
        this.mainCrashHandled = true;
        AnrService anrService = this.anrService;
        if (anrService != null) {
            anrService.forceAnrTrackingStopOnCrash();
        }
        String unityCrashId = this.ndkService.getUnityCrashId();
        if (unityCrashId == null) {
            unityCrashId = Uuid.getEmbUuid$default(null, 1, null);
        }
        int incrementAndGetCrashNumber = this.preferencesService.incrementAndGetCrashNumber();
        TelemetryAttributes telemetryAttributes = new TelemetryAttributes(this.configService, this.sessionProperties, null, 4, null);
        LegacyExceptionInfo ofThrowable = LegacyExceptionInfo.Companion.ofThrowable(th);
        telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getExceptionType(), ofThrowable.getName());
        dv exceptionMessage = OpenTelemetryAttributeKeysKt.getExceptionMessage();
        String message = ofThrowable.getMessage();
        if (message == null) {
            message = "";
        }
        telemetryAttributes.setAttribute(exceptionMessage, message);
        telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getExceptionStacktrace(), encodeToUTF8String(this.serializer.toJson((EmbraceSerializer) ofThrowable.getLines(), (Class<EmbraceSerializer>) List.class)));
        telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getLogRecordUid(), unityCrashId);
        telemetryAttributes.setAttribute(EmbraceAttributeKeysKt.getEmbCrashNumber(), String.valueOf(incrementAndGetCrashNumber));
        telemetryAttributes.setAttribute(EmbType.System.Crash.INSTANCE.getEmbAndroidCrashExceptionCause(), encodeToUTF8String(getExceptionCause(th)));
        telemetryAttributes.setAttribute(EmbraceAttributeKeysKt.getEmbAndroidThreads(), encodeToUTF8String(getThreadsInfo()));
        JsException jsException = this.jsException;
        if (jsException != null) {
            telemetryAttributes.setAttribute(EmbType.System.ReactNativeCrash.INSTANCE.getEmbAndroidReactNativeCrashJsException(), encodeToUTF8String(this.serializer.toJson((EmbraceSerializer) jsException, (Class<EmbraceSerializer>) JsException.class)));
        }
        LogWriter.DefaultImpls.addLog$default(this.logWriter, new LogEventData(getSchemaType(telemetryAttributes), Severity.ERROR, ""), null, 2, null);
        this.logOrchestrator.flush(true);
        this.sessionOrchestrator.endSessionWithCrash(unityCrashId);
        this.crashMarker.mark();
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void logUnhandledJsException(JsException jsException) {
        zq3.h(jsException, "exception");
        this.jsException = jsException;
    }
}
