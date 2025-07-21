package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.by0;
import defpackage.hc1;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes5.dex */
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    static {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        Main = (HandlerDispatcher) (Result.g(b) ? null : b);
    }

    public static final Handler asHandler(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        zq3.f(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }

    public static final Object awaitFrame(by0<? super Long> by0Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(by0Var);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(by0<? super Long> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
        } else {
            Dispatchers.getMain().mo937dispatch(cancellableContinuationImpl.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(CancellableContinuation.this);
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final HandlerDispatcher from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    public static /* synthetic */ void getMain$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final CancellableContinuation<? super Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: q63
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                HandlerDispatcherKt.postFrameCallback$lambda$6(CancellableContinuation.this, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(CancellableContinuation cancellableContinuation, long j) {
        cancellableContinuation.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            zq3.e(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    public static final HandlerDispatcher from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }
}
