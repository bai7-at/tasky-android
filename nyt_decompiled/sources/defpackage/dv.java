package defpackage;

import io.opentelemetry.api.common.AttributeType;

/* loaded from: classes5.dex */
public interface dv {
    static dv a(String str) {
        return lq3.c(str, AttributeType.STRING);
    }

    String getKey();
}
