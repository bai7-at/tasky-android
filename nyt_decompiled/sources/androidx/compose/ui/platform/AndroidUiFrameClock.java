package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.l;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements androidx.compose.runtime.l {
    private final Choreographer a;
    private final AndroidUiDispatcher b;

    static final class a implements Choreographer.FrameCallback {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ AndroidUiFrameClock b;
        final /* synthetic */ ss2 c;

        a(CancellableContinuation cancellableContinuation, AndroidUiFrameClock androidUiFrameClock, ss2 ss2Var) {
            this.a = cancellableContinuation;
            this.b = androidUiFrameClock;
            this.c = ss2Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object b;
            CancellableContinuation cancellableContinuation = this.a;
            ss2 ss2Var = this.c;
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

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.a = choreographer;
        this.b = androidUiDispatcher;
    }

    public final Choreographer a() {
        return this.a;
    }

    @Override // androidx.compose.runtime.l
    public Object b(ss2 ss2Var, by0 by0Var) {
        final AndroidUiDispatcher androidUiDispatcher = this.b;
        if (androidUiDispatcher == null) {
            CoroutineContext.a aVar = by0Var.getContext().get(kotlin.coroutines.c.P);
            androidUiDispatcher = aVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) aVar : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final a aVar2 = new a(cancellableContinuationImpl, this, ss2Var);
        if (androidUiDispatcher == null || !zq3.c(androidUiDispatcher.c0(), a())) {
            a().postFrameCallback(aVar2);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
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
                    AndroidUiFrameClock.this.a().removeFrameCallback(aVar2);
                }
            });
        } else {
            androidUiDispatcher.w0(aVar2);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
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
                    AndroidUiDispatcher.this.F0(aVar2);
                }
            });
        }
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
