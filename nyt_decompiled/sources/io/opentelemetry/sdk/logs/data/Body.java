package io.opentelemetry.sdk.logs.data;

/* loaded from: classes5.dex */
public interface Body {

    public enum Type {
        EMPTY,
        STRING
    }

    static Body d() {
        return EmptyBody.INSTANCE;
    }

    String asString();
}
