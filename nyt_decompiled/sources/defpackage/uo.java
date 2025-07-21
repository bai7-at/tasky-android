package defpackage;

import kotlin.Result;
import kotlin.f;
import kotlin.text.h;

/* loaded from: classes5.dex */
public abstract class uo {
    private static final int a;

    static {
        Object b;
        try {
            Result.a aVar = Result.a;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            zq3.g(property, "getProperty(...)");
            b = Result.b(h.l(property));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (Result.g(b)) {
            b = null;
        }
        Integer num = (Integer) b;
        a = num != null ? num.intValue() : 2097152;
    }
}
