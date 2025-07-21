package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;

/* loaded from: classes.dex */
public abstract class d {
    public static final Object a(Call call, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        dy0 dy0Var = new dy0(call, cancellableContinuationImpl);
        call.enqueue(dy0Var);
        cancellableContinuationImpl.invokeOnCancellation(dy0Var);
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }
}
