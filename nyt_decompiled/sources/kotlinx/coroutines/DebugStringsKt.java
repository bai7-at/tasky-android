package kotlinx.coroutines;

import defpackage.by0;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes5.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(by0<?> by0Var) {
        Object b;
        if (by0Var instanceof DispatchedContinuation) {
            return by0Var.toString();
        }
        try {
            Result.a aVar = Result.a;
            b = Result.b(by0Var + '@' + getHexAddress(by0Var));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (Result.e(b) != null) {
            b = by0Var.getClass().getName() + '@' + getHexAddress(by0Var);
        }
        return (String) b;
    }
}
