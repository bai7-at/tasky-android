package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.f;

/* loaded from: classes5.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        Result.h(b);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
