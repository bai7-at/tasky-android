package io.embrace.android.embracesdk.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.BetaApi;
import java.util.Map;

@BetaApi
/* loaded from: classes5.dex */
public interface EmbraceSpan {

    public static final class DefaultImpls {
        public static boolean addEvent(EmbraceSpan embraceSpan, String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return embraceSpan.addEvent(str, null, null);
        }

        public static boolean start(EmbraceSpan embraceSpan) {
            return embraceSpan.start(null);
        }

        public static boolean stop(EmbraceSpan embraceSpan) {
            return embraceSpan.stop(null, null);
        }

        public static boolean stop(EmbraceSpan embraceSpan, ErrorCode errorCode) {
            return embraceSpan.stop(errorCode, null);
        }

        public static boolean stop(EmbraceSpan embraceSpan, Long l) {
            return embraceSpan.stop(null, l);
        }
    }

    boolean addAttribute(String str, String str2);

    boolean addEvent(String str);

    boolean addEvent(String str, Long l, Map<String, String> map);

    EmbraceSpan getParent();

    String getSpanId();

    String getTraceId();

    boolean isRecording();

    boolean start();

    boolean start(Long l);

    boolean stop();

    boolean stop(ErrorCode errorCode);

    boolean stop(ErrorCode errorCode, Long l);

    boolean stop(Long l);
}
