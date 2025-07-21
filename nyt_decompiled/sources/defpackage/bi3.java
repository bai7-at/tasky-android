package defpackage;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes5.dex */
abstract class bi3 implements v18 {
    static final v18 a = d(StatusCode.OK, "");
    static final v18 b = d(StatusCode.UNSET, "");
    static final v18 c = d(StatusCode.ERROR, "");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            a = iArr;
            try {
                iArr[StatusCode.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StatusCode.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[StatusCode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    bi3() {
    }

    static v18 a(StatusCode statusCode, String str) {
        if (str == null || str.isEmpty()) {
            int i = a.a[statusCode.ordinal()];
            if (i == 1) {
                return v18.b();
            }
            if (i == 2) {
                return v18.c();
            }
            if (i == 3) {
                return v18.error();
            }
        }
        return d(statusCode, str);
    }

    private static v18 d(StatusCode statusCode, String str) {
        return new s10(statusCode, str);
    }
}
