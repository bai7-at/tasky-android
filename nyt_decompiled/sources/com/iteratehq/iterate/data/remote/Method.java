package com.iteratehq.iterate.data.remote;

/* loaded from: classes3.dex */
public enum Method {
    GET("GET"),
    POST("POST");

    private final String value;

    Method(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
