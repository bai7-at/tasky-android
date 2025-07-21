package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.gp8;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;

/* loaded from: classes5.dex */
public final class EmbraceSpanFactoryImpl implements EmbraceSpanFactory {
    private final yl0 openTelemetryClock;
    private final SpanRepository spanRepository;
    private final gp8 tracer;

    public EmbraceSpanFactoryImpl(gp8 gp8Var, yl0 yl0Var, SpanRepository spanRepository) {
        zq3.h(gp8Var, "tracer");
        zq3.h(yl0Var, "openTelemetryClock");
        zq3.h(spanRepository, "spanRepository");
        this.tracer = gp8Var;
        this.openTelemetryClock = yl0Var;
        this.spanRepository = spanRepository;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.EmbraceSpanFactory
    public PersistableEmbraceSpan create(String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return new EmbraceSpanImpl(EmbraceExtensionsKt.embraceSpanBuilder(this.tracer, str, telemetryType, z, z2, embraceSpan), this.openTelemetryClock, this.spanRepository);
    }
}
