package io.embrace.android.embracesdk.arch.datasource;

import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.limits.LimitStrategy;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public abstract class SpanDataSourceImpl extends DataSourceImpl<SpanService> implements SpanDataSource {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanDataSourceImpl(SpanService spanService, InternalEmbraceLogger internalEmbraceLogger, LimitStrategy limitStrategy) {
        super(spanService, internalEmbraceLogger, limitStrategy);
        zq3.h(spanService, "destination");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(limitStrategy, "limitStrategy");
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.SpanDataSource
    public boolean captureSpanData(boolean z, qs2 qs2Var, ss2 ss2Var) {
        zq3.h(qs2Var, "inputValidation");
        zq3.h(ss2Var, "captureAction");
        return captureDataImpl(qs2Var, ss2Var, z);
    }
}
