package defpackage;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes5.dex */
public interface v18 {
    static v18 a(StatusCode statusCode, String str) {
        if (str == null) {
            str = "";
        }
        return bi3.a(statusCode, str);
    }

    static v18 b() {
        return bi3.b;
    }

    static v18 c() {
        return bi3.a;
    }

    static v18 error() {
        return bi3.c;
    }

    String getDescription();

    StatusCode getStatusCode();
}
