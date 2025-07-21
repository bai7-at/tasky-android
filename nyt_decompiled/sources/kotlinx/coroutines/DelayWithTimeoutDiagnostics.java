package kotlinx.coroutines;

import defpackage.by0;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Delay;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface DelayWithTimeoutDiagnostics extends Delay {

    public static final class DefaultImpls {
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, by0<? super ww8> by0Var) {
            Object delay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, by0Var);
            return delay == kotlin.coroutines.intrinsics.a.h() ? delay : ww8.a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, coroutineContext);
        }
    }

    /* renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String mo874timeoutMessageLRDsOJo(long j);
}
