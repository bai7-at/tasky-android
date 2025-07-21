package io.opentelemetry.sdk.logs.data;

import io.opentelemetry.sdk.logs.data.Body;

/* loaded from: classes5.dex */
enum EmptyBody implements Body {
    INSTANCE;

    @Override // io.opentelemetry.sdk.logs.data.Body
    public String asString() {
        return "";
    }

    public Body.Type getType() {
        return Body.Type.EMPTY;
    }
}
