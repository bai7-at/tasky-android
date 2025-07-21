package kotlinx.coroutines.internal;

import defpackage.g62;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* loaded from: classes5.dex */
public final class OnUndeliveredElementKt {
    public static final <E> ss2 bindCancellationFun(final ss2 ss2Var, final E e, final CoroutineContext coroutineContext) {
        return new ss2() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                OnUndeliveredElementKt.callUndeliveredElement(ss2.this, e, coroutineContext);
            }
        };
    }

    public static final <E> void callUndeliveredElement(ss2 ss2Var, E e, CoroutineContext coroutineContext) {
        UndeliveredElementException callUndeliveredElementCatchingException = callUndeliveredElementCatchingException(ss2Var, e, null);
        if (callUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, callUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(ss2 ss2Var, E e, UndeliveredElementException undeliveredElementException) {
        try {
            ss2Var.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            g62.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(ss2 ss2Var, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(ss2Var, obj, undeliveredElementException);
    }
}
