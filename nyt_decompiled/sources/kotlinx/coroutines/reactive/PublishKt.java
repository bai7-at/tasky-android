package kotlinx.coroutines.reactive;

import defpackage.g86;
import defpackage.gt2;
import defpackage.va8;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.reactive.PublishKt;

/* loaded from: classes5.dex */
public final class PublishKt {
    private static final long CLOSED = -1;
    private static final gt2 DEFAULT_HANDLER = new gt2() { // from class: kotlinx.coroutines.reactive.PublishKt$DEFAULT_HANDLER$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Throwable) obj, (CoroutineContext) obj2);
            return ww8.a;
        }

        public final void invoke(Throwable th, CoroutineContext coroutineContext) {
            if (th instanceof CancellationException) {
                return;
            }
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th);
        }
    };
    private static final long SIGNALLED = -2;

    public static final <T> g86 publish(CoroutineContext coroutineContext, gt2 gt2Var) {
        if (coroutineContext.get(Job.Key) == null) {
            return publishInternal(GlobalScope.INSTANCE, coroutineContext, DEFAULT_HANDLER, gt2Var);
        }
        throw new IllegalArgumentException(("Publisher context cannot contain job in it.Its lifecycle should be managed via subscription. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ g86 publish$default(CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return publish(coroutineContext, gt2Var);
    }

    @InternalCoroutinesApi
    public static final <T> g86 publishInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final gt2 gt2Var, final gt2 gt2Var2) {
        return new g86() { // from class: x76
            @Override // defpackage.g86
            public final void subscribe(va8 va8Var) {
                PublishKt.publishInternal$lambda$1(CoroutineScope.this, coroutineContext, gt2Var, gt2Var2, va8Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, gt2 gt2Var2, va8 va8Var) {
        if (va8Var == null) {
            throw new NullPointerException("Subscriber cannot be null");
        }
        PublisherCoroutine publisherCoroutine = new PublisherCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), va8Var, gt2Var);
        va8Var.onSubscribe(publisherCoroutine);
        publisherCoroutine.start(CoroutineStart.DEFAULT, publisherCoroutine, gt2Var2);
    }

    public static /* synthetic */ g86 publish$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return publish(coroutineScope, coroutineContext, gt2Var);
    }

    public static final /* synthetic */ g86 publish(CoroutineScope coroutineScope, CoroutineContext coroutineContext, gt2 gt2Var) {
        return publishInternal(coroutineScope, coroutineContext, DEFAULT_HANDLER, gt2Var);
    }
}
