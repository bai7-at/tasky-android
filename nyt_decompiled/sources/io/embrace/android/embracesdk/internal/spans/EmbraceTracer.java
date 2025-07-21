package io.embrace.android.embracesdk.internal.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.BetaApi;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.TracingApi;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public final class EmbraceTracer implements TracingApi {
    private final Clock clock;
    private final SpanService spanService;

    public EmbraceTracer(Clock clock, SpanService spanService) {
        zq3.h(clock, "clock");
        zq3.h(spanService, "spanService");
        this.clock = clock;
        this.spanService = spanService;
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public EmbraceSpan createSpan(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.createSpan(this, str);
    }

    public final long getSdkCurrentTimeMs() {
        return this.clock.now();
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan getSpan(String str) {
        zq3.h(str, "spanId");
        return this.spanService.getSpan(str);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean isTracingAvailable() {
        return this.spanService.initialized();
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public boolean recordCompletedSpan(String str, long j, long j2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.recordCompletedSpan(this, str, j, j2);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public <T> T recordSpan(String str, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) TracingApi.DefaultImpls.recordSpan(this, str, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public EmbraceSpan startSpan(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.startSpan(this, str);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan createSpan(String str, EmbraceSpan embraceSpan) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return SpanService.DefaultImpls.createSpan$default(this.spanService, str, embraceSpan, null, false, false, 20, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.recordCompletedSpan(this, str, j, j2, embraceSpan);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) TracingApi.DefaultImpls.recordSpan(this, str, embraceSpan, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.startSpan(this, str, embraceSpan);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.recordCompletedSpan(this, str, j, j2, errorCode);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public <T> T recordSpan(String str, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) TracingApi.DefaultImpls.recordSpan(this, str, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return SpanService.DefaultImpls.startSpan$default(this.spanService, str, embraceSpan, l, null, false, false, 40, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.recordCompletedSpan(this, str, j, j2, errorCode, embraceSpan);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) SpanService.DefaultImpls.recordSpan$default(this.spanService, str, embraceSpan, null, false, false, map == null ? t.i() : map, list == null ? i.l() : list, qs2Var, 20, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    @BetaApi
    public boolean recordCompletedSpan(String str, long j, long j2, Map<String, String> map, List<EmbraceSpanEvent> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return TracingApi.DefaultImpls.recordCompletedSpan(this, str, j, j2, map, list);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, str, ClockKt.normalizeTimestampAsMillis(j), ClockKt.normalizeTimestampAsMillis(j2), embraceSpan, null, false, false, map == null ? t.i() : map, list == null ? i.l() : list, errorCode, 80, null);
    }
}
