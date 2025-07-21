package io.embrace.android.embracesdk.logging;

import android.util.Log;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class AndroidLoggingAction implements InternalEmbraceLogger.LoggerAction {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalEmbraceLogger.Severity.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[InternalEmbraceLogger.Severity.DEBUG.ordinal()] = 1;
            iArr[InternalEmbraceLogger.Severity.INFO.ordinal()] = 2;
            iArr[InternalEmbraceLogger.Severity.WARNING.ordinal()] = 3;
            iArr[InternalEmbraceLogger.Severity.ERROR.ordinal()] = 4;
        }
    }

    @Override // io.embrace.android.embracesdk.logging.InternalEmbraceLogger.LoggerAction
    public void log(String str, InternalEmbraceLogger.Severity severity, Throwable th, boolean z) {
        zq3.h(str, "msg");
        zq3.h(severity, "severity");
        if (th == null || !z) {
            th = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
        if (i == 1) {
            Log.d(AndroidLoggingActionKt.EMBRACE_TAG, str, th);
            return;
        }
        if (i == 2) {
            Log.i(AndroidLoggingActionKt.EMBRACE_TAG, str, th);
            return;
        }
        if (i == 3) {
            Log.w(AndroidLoggingActionKt.EMBRACE_TAG, str, th);
        } else if (i != 4) {
            Log.v(AndroidLoggingActionKt.EMBRACE_TAG, str, th);
        } else {
            Log.e(AndroidLoggingActionKt.EMBRACE_TAG, str, th);
        }
    }
}
