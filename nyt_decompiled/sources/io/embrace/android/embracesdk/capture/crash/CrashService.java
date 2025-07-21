package io.embrace.android.embracesdk.capture.crash;

import io.embrace.android.embracesdk.payload.JsException;

/* loaded from: classes5.dex */
public interface CrashService {
    void handleCrash(Throwable th);

    void logUnhandledJsException(JsException jsException);
}
