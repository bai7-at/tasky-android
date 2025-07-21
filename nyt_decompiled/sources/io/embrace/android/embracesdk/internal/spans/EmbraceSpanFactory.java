package io.embrace.android.embracesdk.internal.spans;

import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;

/* loaded from: classes5.dex */
public interface EmbraceSpanFactory {

    public static final class DefaultImpls {
        public static /* synthetic */ PersistableEmbraceSpan create$default(EmbraceSpanFactory embraceSpanFactory, String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            boolean z3 = (i & 8) != 0 ? z : z2;
            if ((i & 16) != 0) {
                embraceSpan = null;
            }
            return embraceSpanFactory.create(str, telemetryType, z, z3, embraceSpan);
        }
    }

    PersistableEmbraceSpan create(String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan);
}
