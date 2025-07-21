package io.embrace.android.embracesdk.session;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class SafeCaptureExtensionKt {
    public static final <R> R captureDataSafely(InternalEmbraceLogger internalEmbraceLogger, qs2 qs2Var) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(qs2Var, "result");
        try {
            return (R) qs2Var.mo865invoke();
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            return null;
        }
    }
}
