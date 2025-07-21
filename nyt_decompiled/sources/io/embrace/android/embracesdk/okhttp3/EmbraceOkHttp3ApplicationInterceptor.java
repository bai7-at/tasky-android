package io.embrace.android.embracesdk.okhttp3;

import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.network.http.EmbraceHttpPathOverride;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceOkHttp3ApplicationInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    public static final String TRACEPARENT_HEADER_NAME = "traceparent";
    public static final String UNKNOWN_EXCEPTION = "Unknown";
    public static final String UNKNOWN_MESSAGE = "An error occurred during the execution of this network request";
    private final Embrace embrace;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String causeMessage$embrace_android_okhttp3_release$default(Companion companion, Throwable th, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.causeMessage$embrace_android_okhttp3_release(th, str);
        }

        public static /* synthetic */ String causeName$embrace_android_okhttp3_release$default(Companion companion, Throwable th, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.causeName$embrace_android_okhttp3_release(th, str);
        }

        public final String causeMessage$embrace_android_okhttp3_release(Throwable th, String str) {
            Throwable cause;
            String message;
            zq3.h(str, "defaultMessage");
            return (th == null || (cause = th.getCause()) == null || (message = cause.getMessage()) == null) ? str : message;
        }

        public final String causeName$embrace_android_okhttp3_release(Throwable th, String str) {
            Throwable cause;
            String canonicalName;
            zq3.h(str, "defaultName");
            return (th == null || (cause = th.getCause()) == null || (canonicalName = cause.getClass().getCanonicalName()) == null) ? str : canonicalName;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceOkHttp3ApplicationInterceptor(Embrace embrace) {
        zq3.h(embrace, "embrace");
        this.embrace = embrace;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str = UNKNOWN_MESSAGE;
        String str2 = UNKNOWN_EXCEPTION;
        zq3.h(chain, "chain");
        long sdkCurrentTime = this.embrace.getInternalInterface().getSdkCurrentTime();
        Request request = chain.request();
        try {
            return chain.proceed(request);
        } catch (EmbraceCustomPathException e) {
            if (!this.embrace.isStarted() || this.embrace.getInternalInterface().isInternalNetworkCaptureDisabled()) {
                throw e;
            }
            String uRLString = EmbraceHttpPathOverride.getURLString(new EmbraceOkHttp3PathOverrideRequest(request), e.getCustomPath());
            zq3.g(uRLString, "EmbraceHttpPathOverride.…t(request), e.customPath)");
            Embrace embrace = this.embrace;
            HttpMethod fromString = HttpMethod.fromString(request.method());
            long sdkCurrentTime2 = this.embrace.getInternalInterface().getSdkCurrentTime();
            Companion companion = Companion;
            String causeName$embrace_android_okhttp3_release = companion.causeName$embrace_android_okhttp3_release(e, UNKNOWN_EXCEPTION);
            String causeMessage$embrace_android_okhttp3_release = companion.causeMessage$embrace_android_okhttp3_release(e, UNKNOWN_MESSAGE);
            String traceIdHeader = this.embrace.getTraceIdHeader();
            zq3.g(traceIdHeader, "embrace.traceIdHeader");
            embrace.recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(uRLString, fromString, sdkCurrentTime, sdkCurrentTime2, causeName$embrace_android_okhttp3_release, causeMessage$embrace_android_okhttp3_release, request.header(traceIdHeader), this.embrace.getInternalInterface().isNetworkSpanForwardingEnabled() ? request.header("traceparent") : null, null));
            throw e;
        } catch (Exception e2) {
            if (!this.embrace.isStarted()) {
                throw e2;
            }
            if (this.embrace.getInternalInterface().isInternalNetworkCaptureDisabled()) {
                throw e2;
            }
            String uRLString2 = EmbraceHttpPathOverride.getURLString(new EmbraceOkHttp3PathOverrideRequest(request));
            zq3.g(uRLString2, "EmbraceHttpPathOverride.…OverrideRequest(request))");
            String canonicalName = e2.getClass().getCanonicalName();
            String message = e2.getMessage();
            Embrace embrace2 = this.embrace;
            HttpMethod fromString2 = HttpMethod.fromString(request.method());
            long sdkCurrentTime3 = this.embrace.getInternalInterface().getSdkCurrentTime();
            if (canonicalName != null) {
                str2 = canonicalName;
            }
            if (message != null) {
                str = message;
            }
            String traceIdHeader2 = this.embrace.getTraceIdHeader();
            zq3.g(traceIdHeader2, "embrace.traceIdHeader");
            embrace2.recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(uRLString2, fromString2, sdkCurrentTime, sdkCurrentTime3, str2, str, request.header(traceIdHeader2), this.embrace.getInternalInterface().isNetworkSpanForwardingEnabled() ? request.header("traceparent") : null, null));
            throw e2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmbraceOkHttp3ApplicationInterceptor() {
        /*
            r2 = this;
            io.embrace.android.embracesdk.Embrace r0 = io.embrace.android.embracesdk.Embrace.getInstance()
            java.lang.String r1 = "Embrace.getInstance()"
            defpackage.zq3.g(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor.<init>():void");
    }
}
