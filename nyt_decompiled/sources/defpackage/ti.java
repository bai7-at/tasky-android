package defpackage;

import io.opentelemetry.sdk.logs.data.Body;

/* loaded from: classes5.dex */
public final class ti implements Body {
    private final si a;

    private ti(si siVar) {
        this.a = siVar;
    }

    public static Body a(si siVar) {
        return new ti(siVar);
    }

    @Override // io.opentelemetry.sdk.logs.data.Body
    public String asString() {
        return this.a.asString();
    }

    public String toString() {
        return "AnyValueBody{" + asString() + "}";
    }
}
