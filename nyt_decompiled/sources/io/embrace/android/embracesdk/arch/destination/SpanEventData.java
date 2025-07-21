package io.embrace.android.embracesdk.arch.destination;

import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.SchemaType;

/* loaded from: classes5.dex */
public final class SpanEventData {
    private final SchemaType schemaType;
    private final long spanStartTimeMs;

    public SpanEventData(SchemaType schemaType, long j) {
        zq3.h(schemaType, "schemaType");
        this.schemaType = schemaType;
        this.spanStartTimeMs = j;
    }

    public final SchemaType getSchemaType() {
        return this.schemaType;
    }

    public final long getSpanStartTimeMs() {
        return this.spanStartTimeMs;
    }
}
