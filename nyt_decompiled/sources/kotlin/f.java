package kotlin;

import defpackage.zq3;
import kotlin.Result;

/* loaded from: classes5.dex */
public abstract class f {
    public static final Object a(Throwable th) {
        zq3.h(th, "exception");
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
