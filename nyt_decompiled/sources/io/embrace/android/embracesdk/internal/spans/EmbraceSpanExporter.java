package io.embrace.android.embracesdk.internal.spans;

import defpackage.by7;
import defpackage.ey7;
import defpackage.gq0;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.arch.schema.PrivateSpan;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.i;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceSpanExporter implements ey7 {
    private final ey7 externalSpanExporter;
    private final SpanSink spanSink;

    public EmbraceSpanExporter(SpanSink spanSink, ey7 ey7Var) {
        zq3.h(spanSink, "spanSink");
        zq3.h(ey7Var, "externalSpanExporter");
        this.spanSink = spanSink;
        this.externalSpanExporter = ey7Var;
    }

    @Override // defpackage.ey7, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // defpackage.ey7
    public synchronized gq0 export(Collection<by7> collection) {
        try {
            zq3.h(collection, "spans");
            gq0 storeCompletedSpans = this.spanSink.storeCompletedSpans(i.X0(collection));
            if (!zq3.c(storeCompletedSpans, gq0.i())) {
                return storeCompletedSpans;
            }
            ey7 ey7Var = this.externalSpanExporter;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!EmbraceExtensionsKt.hasFixedAttribute((by7) obj, PrivateSpan.INSTANCE)) {
                    arrayList.add(obj);
                }
            }
            gq0 export = ey7Var.export(arrayList);
            zq3.g(export, "externalSpanExporter.exp…Attribute(PrivateSpan) })");
            return export;
        } catch (Throwable th) {
            throw th;
        }
    }

    public gq0 flush() {
        gq0 i = gq0.i();
        zq3.g(i, "CompletableResultCode.ofSuccess()");
        return i;
    }

    @Override // defpackage.ey7
    public synchronized gq0 shutdown() {
        gq0 i;
        i = gq0.i();
        zq3.g(i, "CompletableResultCode.ofSuccess()");
        return i;
    }
}
