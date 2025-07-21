package io.embrace.android.embracesdk.arch.destination;

import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.schema.SchemaType;

/* loaded from: classes5.dex */
public final class LogEventData {
    private final String message;
    private final SchemaType schemaType;
    private final Severity severity;

    public LogEventData(SchemaType schemaType, Severity severity, String str) {
        zq3.h(schemaType, "schemaType");
        zq3.h(severity, "severity");
        zq3.h(str, "message");
        this.schemaType = schemaType;
        this.severity = severity;
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final SchemaType getSchemaType() {
        return this.schemaType;
    }

    public final Severity getSeverity() {
        return this.severity;
    }
}
