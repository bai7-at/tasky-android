package io.embrace.android.embracesdk.arch.schema;

import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class SendImmediately implements FixedAttribute {
    public static final SendImmediately INSTANCE = new SendImmediately();
    private static final EmbraceAttributeKey key = new EmbraceAttributeKey("send_immediately", null, false, false, 14, null);
    private static final String value = "true";

    private SendImmediately() {
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public EmbraceAttributeKey getKey() {
        return key;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public String getValue() {
        return value;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Pair<String, String> toEmbraceKeyValuePair() {
        return FixedAttribute.DefaultImpls.toEmbraceKeyValuePair(this);
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Attribute toPayload() {
        return FixedAttribute.DefaultImpls.toPayload(this);
    }
}
