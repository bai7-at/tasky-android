package io.embrace.android.embracesdk.ndk;

import com.squareup.moshi.j;
import defpackage.yj0;
import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.limits.NoopLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.arch.schema.TelemetryAttributes;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.internal.utils.EncodingExtensionsKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.payload.NativeCrashData;
import io.embrace.android.embracesdk.payload.NativeCrashDataError;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class NativeCrashDataSourceImpl extends DataSourceImpl<LogWriter> implements NativeCrashDataSource {
    public static final Companion Companion = new Companion(null);
    private static final ParameterizedType errorSerializerType = j.j(List.class, NativeCrashDataError.class);
    private final ConfigService configService;
    private final LogWriter logWriter;
    private final NdkService ndkService;
    private final PreferencesService preferencesService;
    private final EmbraceSerializer serializer;
    private final EmbraceSessionProperties sessionProperties;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCrashDataSourceImpl(EmbraceSessionProperties embraceSessionProperties, NdkService ndkService, PreferencesService preferencesService, LogWriter logWriter, ConfigService configService, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        super(logWriter, internalEmbraceLogger, NoopLimitStrategy.INSTANCE);
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(ndkService, "ndkService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(logWriter, "logWriter");
        zq3.h(configService, "configService");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.sessionProperties = embraceSessionProperties;
        this.ndkService = ndkService;
        this.preferencesService = preferencesService;
        this.logWriter = logWriter;
        this.configService = configService;
        this.serializer = embraceSerializer;
    }

    private final void sendNativeCrash(NativeCrashData nativeCrashData) {
        int incrementAndGetNativeCrashNumber = this.preferencesService.incrementAndGetNativeCrashNumber();
        TelemetryAttributes telemetryAttributes = new TelemetryAttributes(this.configService, this.sessionProperties, null, 4, null);
        telemetryAttributes.setAttribute(EmbraceAttributeKeysKt.getEmbSessionId(), nativeCrashData.getSessionId());
        telemetryAttributes.setAttribute(EmbraceAttributeKeysKt.getEmbCrashNumber(), String.valueOf(incrementAndGetNativeCrashNumber));
        String crash$embrace_android_sdk_release = nativeCrashData.getCrash$embrace_android_sdk_release();
        if (crash$embrace_android_sdk_release != null) {
            telemetryAttributes.setAttribute(EmbType.System.NativeCrash.INSTANCE.getEmbNativeCrashException(), crash$embrace_android_sdk_release);
        }
        EmbraceSerializer embraceSerializer = this.serializer;
        List<NativeCrashDataError> errors = nativeCrashData.getErrors();
        ParameterizedType parameterizedType = errorSerializerType;
        zq3.g(parameterizedType, "errorSerializerType");
        String json = embraceSerializer.toJson((EmbraceSerializer) errors, (Type) parameterizedType);
        EmbType.System.NativeCrash nativeCrash = EmbType.System.NativeCrash.INSTANCE;
        EmbraceAttributeKey embNativeCrashErrors = nativeCrash.getEmbNativeCrashErrors();
        Charset charset = yj0.b;
        if (json == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = json.getBytes(charset);
        zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
        telemetryAttributes.setAttribute(embNativeCrashErrors, EncodingExtensionsKt.toUTF8String(bytes));
        telemetryAttributes.setAttribute(nativeCrash.getEmbNativeCrashSymbols(), this.serializer.toJson((EmbraceSerializer) nativeCrashData.getSymbols(), (Type) Map.class));
        telemetryAttributes.setAttribute(nativeCrash.getEmbNativeCrashUnwindError(), String.valueOf(nativeCrashData.getUnwindError()));
        LogWriter.DefaultImpls.addLog$default(this.logWriter, new LogEventData(new SchemaType.NativeCrash(telemetryAttributes), Severity.ERROR, ""), null, 2, null);
    }

    @Override // io.embrace.android.embracesdk.ndk.NativeCrashService
    public NativeCrashData getAndSendNativeCrash() {
        NativeCrashData nativeCrash = this.ndkService.getNativeCrash();
        if (nativeCrash == null) {
            return null;
        }
        sendNativeCrash(nativeCrash);
        return nativeCrash;
    }
}
