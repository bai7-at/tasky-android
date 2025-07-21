package io.embrace.android.embracesdk.arch.schema;

import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class ErrorCodeAttribute implements FixedAttribute {
    private final EmbraceAttributeKey key;
    private final String value;

    public static final class Failure extends ErrorCodeAttribute {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(ErrorCode.FAILURE, null);
        }
    }

    public static final class Unknown extends ErrorCodeAttribute {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(ErrorCode.UNKNOWN, null);
        }
    }

    public static final class UserAbandon extends ErrorCodeAttribute {
        public static final UserAbandon INSTANCE = new UserAbandon();

        private UserAbandon() {
            super(ErrorCode.USER_ABANDON, null);
        }
    }

    private ErrorCodeAttribute(ErrorCode errorCode) {
        this.key = new EmbraceAttributeKey("error_code", null, false, false, 14, null);
        String name = errorCode.name();
        Locale locale = Locale.ENGLISH;
        zq3.g(locale, "Locale.ENGLISH");
        if (name == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = name.toLowerCase(locale);
        zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        this.value = lowerCase;
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

    public /* synthetic */ ErrorCodeAttribute(ErrorCode errorCode, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode);
    }
}
