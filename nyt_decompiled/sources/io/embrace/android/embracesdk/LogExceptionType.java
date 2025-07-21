package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public enum LogExceptionType {
    NONE("none"),
    HANDLED("handled"),
    UNHANDLED("unhandled");

    private final String value;

    LogExceptionType(String str) {
        this.value = str;
    }

    public final String getValue$embrace_android_sdk_release() {
        return this.value;
    }
}
