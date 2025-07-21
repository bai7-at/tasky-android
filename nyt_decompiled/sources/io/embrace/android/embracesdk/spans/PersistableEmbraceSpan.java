package io.embrace.android.embracesdk.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.spans.EmbraceSpan;

/* loaded from: classes5.dex */
public interface PersistableEmbraceSpan extends EmbraceSpan {

    public static final class DefaultImpls {
        public static boolean addEvent(PersistableEmbraceSpan persistableEmbraceSpan, String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return EmbraceSpan.DefaultImpls.addEvent(persistableEmbraceSpan, str);
        }

        public static boolean start(PersistableEmbraceSpan persistableEmbraceSpan) {
            return EmbraceSpan.DefaultImpls.start(persistableEmbraceSpan);
        }

        public static boolean stop(PersistableEmbraceSpan persistableEmbraceSpan) {
            return EmbraceSpan.DefaultImpls.stop(persistableEmbraceSpan);
        }

        public static boolean stop(PersistableEmbraceSpan persistableEmbraceSpan, ErrorCode errorCode) {
            return EmbraceSpan.DefaultImpls.stop(persistableEmbraceSpan, errorCode);
        }

        public static boolean stop(PersistableEmbraceSpan persistableEmbraceSpan, Long l) {
            return EmbraceSpan.DefaultImpls.stop(persistableEmbraceSpan, l);
        }
    }

    String getAttribute(EmbraceAttributeKey embraceAttributeKey);

    boolean hasEmbraceAttribute(FixedAttribute fixedAttribute);

    boolean removeCustomAttribute(String str);

    Span snapshot();
}
