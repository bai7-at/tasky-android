package io.embrace.android.embracesdk.arch.schema;

import io.embrace.android.embracesdk.internal.payload.Attribute;
import kotlin.Pair;

/* loaded from: classes5.dex */
public interface FixedAttribute {

    public static final class DefaultImpls {
        public static Pair<String, String> toEmbraceKeyValuePair(FixedAttribute fixedAttribute) {
            return new Pair<>(fixedAttribute.getKey().getName(), fixedAttribute.getValue());
        }

        public static Attribute toPayload(FixedAttribute fixedAttribute) {
            return new Attribute(fixedAttribute.getKey().getName(), fixedAttribute.getValue());
        }
    }

    EmbraceAttributeKey getKey();

    String getValue();

    Pair<String, String> toEmbraceKeyValuePair();

    Attribute toPayload();
}
