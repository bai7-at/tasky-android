package io.embrace.android.embracesdk.okhttp3;

import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import java.io.IOException;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceCustomPathException extends IOException {
    private final String customPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbraceCustomPathException(String str, Throwable th) {
        super(th);
        zq3.h(str, "customPath");
        this.customPath = str;
    }

    public final String getCustomPath() {
        return this.customPath;
    }
}
