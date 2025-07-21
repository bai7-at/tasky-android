package io.embrace.android.embracesdk.payload.extensions;

import android.util.Base64;
import defpackage.yj0;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Crash;
import io.embrace.android.embracesdk.payload.JsException;
import io.embrace.android.embracesdk.payload.LegacyExceptionInfo;
import io.embrace.android.embracesdk.payload.ThreadInfo;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class CrashFactory {
    public static final CrashFactory INSTANCE = new CrashFactory();
    private static final EmbraceSerializer serializer = new EmbraceSerializer();

    private CrashFactory() {
    }

    private static final List<LegacyExceptionInfo> exceptionInfo(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !zq3.c(th, th.getCause())) {
            arrayList.add(0, LegacyExceptionInfo.Companion.ofThrowable(th));
            th = th.getCause();
        }
        return i.X0(arrayList);
    }

    private static final List<String> jsExceptions(JsException jsException, InternalEmbraceLogger internalEmbraceLogger) {
        if (jsException != null) {
            try {
                String json = serializer.toJson(jsException);
                Charset charset = yj0.b;
                if (json == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = json.getBytes(charset);
                zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
                return i.e(Base64.encodeToString(bytes, 2));
            } catch (Exception e) {
                internalEmbraceLogger.log("Failed to parse javascript exception", InternalEmbraceLogger.Severity.ERROR, e, true);
            }
        }
        return null;
    }

    public static /* synthetic */ Crash ofThrowable$default(CrashFactory crashFactory, InternalEmbraceLogger internalEmbraceLogger, Throwable th, JsException jsException, int i, String str, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str = Uuid.getEmbUuid$default(null, 1, null);
        }
        return crashFactory.ofThrowable(internalEmbraceLogger, th, jsException, i, str);
    }

    private static final List<ThreadInfo> threadsInfo() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        zq3.g(allStackTraces, "Thread.getAllStackTraces()");
        ArrayList arrayList = new ArrayList(allStackTraces.size());
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            ThreadInfo.Companion companion = ThreadInfo.Companion;
            Thread key = entry.getKey();
            zq3.g(key, "it.key");
            StackTraceElement[] value = entry.getValue();
            zq3.g(value, "it.value");
            arrayList.add(ThreadInfo.Companion.ofThread$default(companion, key, value, 0, 4, null));
        }
        return arrayList;
    }

    public final Crash ofThrowable(InternalEmbraceLogger internalEmbraceLogger, Throwable th, JsException jsException, int i, String str) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(str, "crashId");
        return new Crash(str, exceptionInfo(th), jsExceptions(jsException, internalEmbraceLogger), threadsInfo(), Integer.valueOf(i));
    }
}
