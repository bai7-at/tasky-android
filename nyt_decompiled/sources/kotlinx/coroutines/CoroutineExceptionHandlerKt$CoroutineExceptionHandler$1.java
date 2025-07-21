package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    final /* synthetic */ gt2 $handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(gt2 gt2Var, CoroutineExceptionHandler.Key key) {
        super(key);
        this.$handler = gt2Var;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        this.$handler.invoke(coroutineContext, th);
    }
}
