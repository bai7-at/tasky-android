package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.l;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements l {
    public static final DefaultChoreographerFrameClock a = new DefaultChoreographerFrameClock();
    private static final Choreographer b = (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain().getImmediate(), new DefaultChoreographerFrameClock$choreographer$1(null));

    static final class a implements Choreographer.FrameCallback {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ ss2 b;

        a(CancellableContinuation cancellableContinuation, ss2 ss2Var) {
            this.a = cancellableContinuation;
            this.b = ss2Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object b;
            CancellableContinuation cancellableContinuation = this.a;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.a;
            ss2 ss2Var = this.b;
            try {
                Result.a aVar = Result.a;
                b = Result.b(ss2Var.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(kotlin.f.a(th));
            }
            cancellableContinuation.resumeWith(b);
        }
    }

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.l
    public Object b(ss2 ss2Var, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final a aVar = new a(cancellableContinuationImpl, ss2Var);
        b.postFrameCallback(aVar);
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
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
                DefaultChoreographerFrameClock.b.removeFrameCallback(aVar);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        return l.a.a(this, obj, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return l.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return l.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return l.a.d(this, coroutineContext);
    }
}
