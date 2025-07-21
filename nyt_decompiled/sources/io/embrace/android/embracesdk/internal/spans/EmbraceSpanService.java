package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EmbraceSpanService implements SpanService {
    private volatile SpanService currentDelegate;
    private final CurrentSessionSpan currentSessionSpan;
    private final qs2 embraceSpanFactorySupplier;
    private final SpanRepository spanRepository;
    private final UninitializedSdkSpanService uninitializedSdkSpansService;

    public EmbraceSpanService(SpanRepository spanRepository, CurrentSessionSpan currentSessionSpan, qs2 qs2Var) {
        zq3.h(spanRepository, "spanRepository");
        zq3.h(currentSessionSpan, "currentSessionSpan");
        zq3.h(qs2Var, "embraceSpanFactorySupplier");
        this.spanRepository = spanRepository;
        this.currentSessionSpan = currentSessionSpan;
        this.embraceSpanFactorySupplier = qs2Var;
        UninitializedSdkSpanService uninitializedSdkSpanService = new UninitializedSdkSpanService();
        this.uninitializedSdkSpansService = uninitializedSdkSpanService;
        this.currentDelegate = uninitializedSdkSpanService;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan createSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return this.currentDelegate.createSpan(str, embraceSpan, telemetryType, z, z2);
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public EmbraceSpan getSpan(String str) {
        zq3.h(str, "spanId");
        return this.currentDelegate.getSpan(str);
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public void initializeService(long j) {
        if (initialized()) {
            return;
        }
        synchronized (this.currentDelegate) {
            try {
                if (!initialized()) {
                    SpanServiceImpl spanServiceImpl = new SpanServiceImpl(this.spanRepository, (EmbraceSpanFactory) this.embraceSpanFactorySupplier.mo865invoke(), this.currentSessionSpan);
                    spanServiceImpl.initializeService(j);
                    if (spanServiceImpl.initialized()) {
                        this.uninitializedSdkSpansService.triggerBufferedSpanRecording(spanServiceImpl);
                    }
                    this.currentDelegate = spanServiceImpl;
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public boolean initialized() {
        return this.currentDelegate instanceof SpanServiceImpl;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        return this.currentDelegate.recordCompletedSpan(str, j, j2, embraceSpan, telemetryType, z, z2, map, list, errorCode);
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        zq3.h(qs2Var, "code");
        return (T) this.currentDelegate.recordSpan(str, embraceSpan, telemetryType, z, z2, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return SpanService.DefaultImpls.startSpan(this, str, embraceSpan, l, telemetryType, z, z2);
    }
}
