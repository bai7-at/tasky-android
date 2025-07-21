package io.embrace.android.embracesdk.internal.spans;

import defpackage.ey7;
import defpackage.gq0;
import defpackage.hx0;
import defpackage.iy7;
import defpackage.mp6;
import defpackage.np6;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.i;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceSpanProcessor implements iy7 {
    private final AtomicLong counter;
    private final String processIdentifier;
    private final ey7 spanExporter;

    public EmbraceSpanProcessor(ey7 ey7Var, String str) {
        zq3.h(ey7Var, "spanExporter");
        zq3.h(str, "processIdentifier");
        this.spanExporter = ey7Var;
        this.processIdentifier = str;
        this.counter = new AtomicLong(1L);
    }

    @Override // defpackage.iy7, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // defpackage.iy7
    public /* bridge */ /* synthetic */ gq0 forceFlush() {
        return super.forceFlush();
    }

    @Override // defpackage.iy7
    public boolean isEndRequired() {
        return true;
    }

    @Override // defpackage.iy7
    public boolean isStartRequired() {
        return true;
    }

    @Override // defpackage.iy7
    public void onEnd(np6 np6Var) {
        zq3.h(np6Var, "span");
        this.spanExporter.export(i.r(np6Var.h()));
    }

    @Override // defpackage.iy7
    public void onStart(hx0 hx0Var, mp6 mp6Var) {
        zq3.h(hx0Var, "parentContext");
        zq3.h(mp6Var, "span");
        EmbraceExtensionsKt.setEmbraceAttribute(mp6Var, EmbraceAttributeKeysKt.getEmbSequenceId(), String.valueOf(this.counter.getAndIncrement()));
        EmbraceExtensionsKt.setEmbraceAttribute(mp6Var, EmbraceAttributeKeysKt.getEmbProcessIdentifier(), this.processIdentifier);
    }

    @Override // defpackage.iy7
    public /* bridge */ /* synthetic */ gq0 shutdown() {
        return super.shutdown();
    }
}
