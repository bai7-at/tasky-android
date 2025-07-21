package io.embrace.android.embracesdk.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.BetaApi;
import java.util.List;
import java.util.Map;

@BetaApi
/* loaded from: classes5.dex */
public interface TracingApi {

    public static final class DefaultImpls {
        @BetaApi
        public static EmbraceSpan createSpan(TracingApi tracingApi, String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.createSpan(str, null);
        }

        @BetaApi
        public static boolean recordCompletedSpan(TracingApi tracingApi, String str, long j, long j2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.recordCompletedSpan(str, j, j2, null, null, null, null);
        }

        @BetaApi
        public static <T> T recordSpan(TracingApi tracingApi, String str, qs2 qs2Var) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(qs2Var, "code");
            return (T) tracingApi.recordSpan(str, null, null, null, qs2Var);
        }

        @BetaApi
        public static EmbraceSpan startSpan(TracingApi tracingApi, String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.startSpan(str, null);
        }

        @BetaApi
        public static boolean recordCompletedSpan(TracingApi tracingApi, String str, long j, long j2, ErrorCode errorCode) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.recordCompletedSpan(str, j, j2, errorCode, null, null, null);
        }

        @BetaApi
        public static <T> T recordSpan(TracingApi tracingApi, String str, EmbraceSpan embraceSpan, qs2 qs2Var) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(qs2Var, "code");
            return (T) tracingApi.recordSpan(str, embraceSpan, null, null, qs2Var);
        }

        @BetaApi
        public static EmbraceSpan startSpan(TracingApi tracingApi, String str, EmbraceSpan embraceSpan) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.startSpan(str, embraceSpan, null);
        }

        @BetaApi
        public static boolean recordCompletedSpan(TracingApi tracingApi, String str, long j, long j2, EmbraceSpan embraceSpan) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.recordCompletedSpan(str, j, j2, null, embraceSpan, null, null);
        }

        @BetaApi
        public static <T> T recordSpan(TracingApi tracingApi, String str, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(qs2Var, "code");
            return (T) tracingApi.recordSpan(str, null, map, list, qs2Var);
        }

        @BetaApi
        public static boolean recordCompletedSpan(TracingApi tracingApi, String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.recordCompletedSpan(str, j, j2, errorCode, embraceSpan, null, null);
        }

        @BetaApi
        public static boolean recordCompletedSpan(TracingApi tracingApi, String str, long j, long j2, Map<String, String> map, List<EmbraceSpanEvent> list) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return tracingApi.recordCompletedSpan(str, j, j2, null, null, map, list);
        }
    }

    @BetaApi
    EmbraceSpan createSpan(String str);

    @BetaApi
    EmbraceSpan createSpan(String str, EmbraceSpan embraceSpan);

    @BetaApi
    EmbraceSpan getSpan(String str);

    boolean isTracingAvailable();

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2);

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan);

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode);

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan);

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list);

    @BetaApi
    boolean recordCompletedSpan(String str, long j, long j2, Map<String, String> map, List<EmbraceSpanEvent> list);

    @BetaApi
    <T> T recordSpan(String str, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var);

    @BetaApi
    <T> T recordSpan(String str, EmbraceSpan embraceSpan, qs2 qs2Var);

    @BetaApi
    <T> T recordSpan(String str, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var);

    @BetaApi
    <T> T recordSpan(String str, qs2 qs2Var);

    @BetaApi
    EmbraceSpan startSpan(String str);

    @BetaApi
    EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan);

    @BetaApi
    EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l);
}
