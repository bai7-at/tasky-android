package io.embrace.android.embracesdk.arch.schema;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.du8;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.utils.MapExtensionsKt;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.payload.AppExitInfoData;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import io.embrace.android.embracesdk.utils.NetworkUtils;
import java.lang.Thread;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class SchemaType {
    private final Map<String, String> commonAttributes;
    private final String fixedObjectName;
    private final TelemetryType telemetryType;

    public static final class AeiLog extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AeiLog(AppExitInfoData appExitInfoData) {
            super(EmbType.System.Exit.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(appExitInfoData, "message");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.m(du8.a("aei_session_id", appExitInfoData.getSessionId$embrace_android_sdk_release()), du8.a("session_id_error", appExitInfoData.getSessionIdError$embrace_android_sdk_release()), du8.a("process_importance", String.valueOf(appExitInfoData.getImportance$embrace_android_sdk_release())), du8.a("pss", String.valueOf(appExitInfoData.getPss$embrace_android_sdk_release())), du8.a("reason", String.valueOf(appExitInfoData.getReason$embrace_android_sdk_release())), du8.a("rss", String.valueOf(appExitInfoData.getRss$embrace_android_sdk_release())), du8.a("exit_status", String.valueOf(appExitInfoData.getStatus$embrace_android_sdk_release())), du8.a("timestamp", String.valueOf(appExitInfoData.getTimestamp$embrace_android_sdk_release())), du8.a("description", appExitInfoData.getDescription$embrace_android_sdk_release()), du8.a("trace_status", appExitInfoData.getTraceStatus$embrace_android_sdk_release())));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class Breadcrumb extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Breadcrumb(String str) {
            super(EmbType.System.Breadcrumb.INSTANCE, "breadcrumb", null);
            zq3.h(str, "message");
            this.schemaAttributes = t.f(du8.a("message", str));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class Crash extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Crash(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.Crash.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class Exception extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Exception(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.Exception.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class FlutterException extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FlutterException(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.FlutterException.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class Log extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Log(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.Log.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class LowPower extends SchemaType {
        public static final LowPower INSTANCE = new LowPower();
        private static final Map<String, String> schemaAttributes = t.i();

        private LowPower() {
            super(EmbType.System.LowPower.INSTANCE, "device-low-power", null);
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return schemaAttributes;
        }
    }

    public static final class MemoryWarning extends SchemaType {
        private final Map<String, String> schemaAttributes;

        public MemoryWarning() {
            super(EmbType.Performance.MemoryWarning.INSTANCE, "memory-warning", null);
            this.schemaAttributes = t.i();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NativeCrash extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NativeCrash(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.NativeCrash.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NativeThreadBlockage extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeThreadBlockage(int i, String str, int i2, String str2, long j, String str3) {
            super(EmbType.Performance.NativeThreadBlockage.INSTANCE, "native_thread_blockage", null);
            zq3.h(str, "threadName");
            zq3.h(str2, "threadState");
            zq3.h(str3, "stackUnwinder");
            this.schemaAttributes = t.m(du8.a("thread_id", String.valueOf(i)), du8.a("thread_name", str), du8.a("thread_priority", String.valueOf(i2)), du8.a("thread_state", str2), du8.a("sampling_offset_ms", String.valueOf(j)), du8.a("stack_unwinder", str3));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NativeThreadBlockageSample extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeThreadBlockageSample(int i, long j, String str) {
            super(EmbType.Performance.NativeThreadBlockageSample.INSTANCE, "native_thread_blockage_sample", null);
            zq3.h(str, "stacktrace");
            this.schemaAttributes = t.m(du8.a("result", String.valueOf(i)), du8.a("sample_overhead_ms", String.valueOf(j)), du8.a("stacktrace", str));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NetworkCapturedRequest extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NetworkCapturedRequest(NetworkCapturedCall networkCapturedCall) {
            super(EmbType.System.NetworkCapturedRequest.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(networkCapturedCall, "networkCapturedCall");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.m(du8.a("duration", String.valueOf(networkCapturedCall.getDuration())), du8.a("end-time", String.valueOf(networkCapturedCall.getEndTime())), du8.a("http-method", networkCapturedCall.getHttpMethod()), du8.a("matched-url", networkCapturedCall.getMatchedUrl()), du8.a("network-id", networkCapturedCall.getNetworkId()), du8.a("request-body", networkCapturedCall.getRequestBody()), du8.a("request-body-size", String.valueOf(networkCapturedCall.getRequestBodySize())), du8.a("request-query", networkCapturedCall.getRequestQuery()), du8.a("request-query-headers", String.valueOf(networkCapturedCall.getRequestQueryHeaders())), du8.a("request-size", String.valueOf(networkCapturedCall.getRequestSize())), du8.a("response-body", networkCapturedCall.getResponseBody()), du8.a("response-body-size", String.valueOf(networkCapturedCall.getResponseBodySize())), du8.a("response-headers", String.valueOf(networkCapturedCall.getResponseHeaders())), du8.a("response-size", String.valueOf(networkCapturedCall.getResponseSize())), du8.a("response-status", String.valueOf(networkCapturedCall.getResponseStatus())), du8.a("session-id", networkCapturedCall.getSessionId()), du8.a("start-time", String.valueOf(networkCapturedCall.getStartTime())), du8.a("url", networkCapturedCall.getUrl()), du8.a("error-message", networkCapturedCall.getErrorMessage()), du8.a("encrypted-payload", networkCapturedCall.getEncryptedPayload())));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NetworkRequest extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
            super(EmbType.Performance.Network.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(embraceNetworkRequest, "networkRequest");
            Map nonNullMap = MapExtensionsKt.toNonNullMap(t.m(du8.a("url.full", embraceNetworkRequest.getUrl()), du8.a("http.request.method", embraceNetworkRequest.getHttpMethod()), du8.a("http.response.status_code", embraceNetworkRequest.getResponseCode()), du8.a("http.request.body.size", embraceNetworkRequest.getBytesSent()), du8.a("http.response.body.size", embraceNetworkRequest.getBytesReceived()), du8.a("error.type", embraceNetworkRequest.getErrorType()), du8.a("error.message", embraceNetworkRequest.getErrorMessage()), du8.a("emb.w3c_traceparent", embraceNetworkRequest.getW3cTraceparent()), du8.a("emb.trace_id", NetworkUtils.getValidTraceId(embraceNetworkRequest.getTraceId()))));
            LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(nonNullMap.size()));
            for (Map.Entry entry : nonNullMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            this.schemaAttributes = linkedHashMap;
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class NetworkStatus extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkStatus(io.embrace.android.embracesdk.comms.delivery.NetworkStatus networkStatus) {
            super(EmbType.System.NetworkStatus.INSTANCE, "network-status", null);
            zq3.h(networkStatus, "networkStatus");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.f(du8.a("network", networkStatus.getValue())));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class PushNotification extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushNotification(String str, String str2, String str3, String str4, String str5, int i) {
            super(EmbType.System.PushNotification.INSTANCE, "push-notification", null);
            zq3.h(str4, "id");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.m(du8.a("notification.title", str), du8.a("notification.type", str2), du8.a("notification.body", str3), du8.a("notification.id", str4), du8.a("notification.from", str5), du8.a("notification.priority", String.valueOf(i))));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class ReactNativeCrash extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReactNativeCrash(TelemetryAttributes telemetryAttributes) {
            super(EmbType.System.ReactNativeCrash.INSTANCE, null, 2, 0 == true ? 1 : 0);
            zq3.h(telemetryAttributes, "attributes");
            this.schemaAttributes = telemetryAttributes.snapshot();
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class Tap extends SchemaType {
        private final Map<String, String> schemaAttributes;

        public /* synthetic */ Tap(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "tap" : str2, str3);
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tap(String str, String str2, String str3) {
            super(EmbType.Ux.Tap.INSTANCE, "ui-tap", null);
            zq3.h(str2, TransferTable.COLUMN_TYPE);
            zq3.h(str3, "coords");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.m(du8.a("view.name", str), du8.a("tap.type", str2), du8.a("tap.coords", str3)));
        }
    }

    public static final class ThreadBlockage extends SchemaType {
        private final Map<String, String> schemaAttributes;

        public ThreadBlockage(int i, long j, int i2) {
            super(EmbType.Performance.ThreadBlockage.INSTANCE, "thread_blockage", null);
            this.schemaAttributes = t.m(du8.a("thread_priority", String.valueOf(i)), du8.a("last_known_time_unix_nano", String.valueOf(ClockKt.millisToNanos(j))), du8.a("interval_code", String.valueOf(i2)));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class ThreadBlockageSample extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreadBlockageSample(long j, int i, String str, int i2, Thread.State state) {
            super(EmbType.Performance.ThreadBlockageSample.INSTANCE, "thread_blockage_sample", null);
            zq3.h(str, "stacktrace");
            zq3.h(state, "threadState");
            this.schemaAttributes = t.m(du8.a("sample_overhead", String.valueOf(ClockKt.millisToNanos(j))), du8.a("frame_count", String.valueOf(i)), du8.a("stacktrace", str), du8.a("sample_code", String.valueOf(i2)), du8.a("thread_state", state.toString()));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class View extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(String str) {
            super(EmbType.Ux.View.INSTANCE, "screen-view", null);
            zq3.h(str, "viewName");
            this.schemaAttributes = t.f(du8.a("view.name", str));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    public static final class WebViewUrl extends SchemaType {
        private final Map<String, String> schemaAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewUrl(String str) {
            super(EmbType.Ux.WebView.INSTANCE, "web-view", null);
            zq3.h(str, "url");
            this.schemaAttributes = MapExtensionsKt.toNonNullMap(t.f(du8.a("webview.url", str)));
        }

        @Override // io.embrace.android.embracesdk.arch.schema.SchemaType
        protected Map<String, String> getSchemaAttributes() {
            return this.schemaAttributes;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SchemaType(TelemetryType telemetryType, String str) {
        this.telemetryType = telemetryType;
        this.fixedObjectName = str;
        Map<String, String> n = t.n(telemetryType.toEmbraceKeyValuePair());
        if (telemetryType.getSendImmediately()) {
            Pair<String, String> embraceKeyValuePair = SendImmediately.INSTANCE.toEmbraceKeyValuePair();
            n.put(embraceKeyValuePair.c(), embraceKeyValuePair.d());
        }
        ww8 ww8Var = ww8.a;
        this.commonAttributes = n;
    }

    public final Map<String, String> attributes() {
        return t.p(getSchemaAttributes(), this.commonAttributes);
    }

    public final String getFixedObjectName() {
        return this.fixedObjectName;
    }

    protected abstract Map<String, String> getSchemaAttributes();

    public final TelemetryType getTelemetryType() {
        return this.telemetryType;
    }

    public /* synthetic */ SchemaType(TelemetryType telemetryType, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryType, str);
    }

    /* synthetic */ SchemaType(TelemetryType telemetryType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryType, (i & 2) != 0 ? "" : str);
    }
}
