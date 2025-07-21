package io.embrace.android.embracesdk.telemetry;

import kotlin.Result;
import kotlin.f;

/* loaded from: classes5.dex */
public final class OkHttpReflectionFacade {
    public final String getOkHttp3Version() {
        Object b;
        try {
            Result.a aVar = Result.a;
            Class<?> cls = Class.forName("okhttp3.OkHttp", false, OkHttpReflectionFacade.class.getClassLoader());
            Object obj = cls.getField("VERSION").get(cls);
            b = Result.b(obj != null ? obj.toString() : null);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (Result.g(b)) {
            b = "";
        }
        String str = (String) b;
        return str == null ? "" : str;
    }

    public final boolean hasOkHttp3() {
        Object b;
        try {
            Result.a aVar = Result.a;
            Class.forName("okhttp3.OkHttpClient", false, OkHttpReflectionFacade.class.getClassLoader());
            b = Result.b(Boolean.TRUE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.g(b)) {
            b = bool;
        }
        return ((Boolean) b).booleanValue();
    }
}
