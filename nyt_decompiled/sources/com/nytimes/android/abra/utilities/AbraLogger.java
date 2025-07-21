package com.nytimes.android.abra.utilities;

import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class AbraLogger {
    public static final AbraLogger INSTANCE = new AbraLogger();
    private static AbraClientLogger clientLogger;

    private AbraLogger() {
    }

    private final String buildLogMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder("ABRA: ");
        if (!h.d0(str2)) {
            sb.append(str2 + ": ");
        }
        sb.append(str);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ void d$default(AbraLogger abraLogger, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        abraLogger.d(str, str2);
    }

    public static /* synthetic */ void e$default(AbraLogger abraLogger, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        abraLogger.e(str, str2);
    }

    public static /* synthetic */ void i$default(AbraLogger abraLogger, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        abraLogger.i(str, str2);
    }

    public final void attachLogger(AbraClientLogger abraClientLogger) {
        zq3.h(abraClientLogger, "clientLogger");
        clientLogger = abraClientLogger;
    }

    public final void d(String str, String str2) {
        zq3.h(str, "message");
        zq3.h(str2, "caller");
        AbraClientLogger abraClientLogger = clientLogger;
        if (abraClientLogger != null) {
            abraClientLogger.debug(buildLogMessage(str, str2));
        }
    }

    public final void e(String str, String str2) {
        zq3.h(str, "message");
        zq3.h(str2, "caller");
        AbraClientLogger abraClientLogger = clientLogger;
        if (abraClientLogger != null) {
            abraClientLogger.error(buildLogMessage(str, str2));
        }
    }

    public final void i(String str, String str2) {
        zq3.h(str, "message");
        zq3.h(str2, "caller");
        AbraClientLogger abraClientLogger = clientLogger;
        if (abraClientLogger != null) {
            abraClientLogger.info(buildLogMessage(str, str2));
        }
    }
}
