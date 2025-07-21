package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
public abstract class m01 {
    private static final String a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(a + '.' + str, QueryKeys.END_MARKER, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String c() {
        return a;
    }
}
