package io.embrace.android.embracesdk.arch.datasource;

import defpackage.qs2;
import defpackage.ss2;
import io.embrace.android.embracesdk.internal.spans.SpanService;

/* loaded from: classes5.dex */
public interface SpanDataSource extends DataSource<SpanService> {
    boolean captureSpanData(boolean z, qs2 qs2Var, ss2 ss2Var);
}
