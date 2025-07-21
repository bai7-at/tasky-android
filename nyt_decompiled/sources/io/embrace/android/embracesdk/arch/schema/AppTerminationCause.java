package io.embrace.android.embracesdk.arch.schema;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class AppTerminationCause implements FixedAttribute {
    private final EmbraceAttributeKey key;
    private final String value;

    public static final class Crash extends AppTerminationCause {
        public static final Crash INSTANCE = new Crash();

        private Crash() {
            super("crash", null);
        }
    }

    public static final class Unknown extends AppTerminationCause {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(DatasetUtils.UNKNOWN_IDENTITY_ID, null);
        }
    }

    public static final class UserTermination extends AppTerminationCause {
        public static final UserTermination INSTANCE = new UserTermination();

        private UserTermination() {
            super("user_termination", null);
        }
    }

    private AppTerminationCause(String str) {
        this.value = str;
        this.key = new EmbraceAttributeKey("termination_cause", null, false, false, 14, null);
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public EmbraceAttributeKey getKey() {
        return this.key;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public String getValue() {
        return this.value;
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Pair<String, String> toEmbraceKeyValuePair() {
        return FixedAttribute.DefaultImpls.toEmbraceKeyValuePair(this);
    }

    @Override // io.embrace.android.embracesdk.arch.schema.FixedAttribute
    public Attribute toPayload() {
        return FixedAttribute.DefaultImpls.toPayload(this);
    }

    public /* synthetic */ AppTerminationCause(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
