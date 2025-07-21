package io.embrace.android.embracesdk.arch.schema;

import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import kotlin.Pair;

/* loaded from: classes5.dex */
public interface TelemetryType extends FixedAttribute {

    public static final class DefaultImpls {
        public static Pair<String, String> toEmbraceKeyValuePair(TelemetryType telemetryType) {
            return FixedAttribute.DefaultImpls.toEmbraceKeyValuePair(telemetryType);
        }

        public static Attribute toPayload(TelemetryType telemetryType) {
            return FixedAttribute.DefaultImpls.toPayload(telemetryType);
        }
    }

    boolean getSendImmediately();
}
