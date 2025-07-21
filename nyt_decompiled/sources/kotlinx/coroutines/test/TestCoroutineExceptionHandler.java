package kotlinx.coroutines.test;

import defpackage.ww8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* loaded from: classes5.dex */
public final class TestCoroutineExceptionHandler extends kotlin.coroutines.a implements CoroutineExceptionHandler, UncaughtExceptionCaptor {
    private boolean _coroutinesCleanedUp;
    private final List<Throwable> _exceptions;
    private final Object _lock;

    public TestCoroutineExceptionHandler() {
        super(CoroutineExceptionHandler.Key);
        this._exceptions = new ArrayList();
        this._lock = new Object();
    }

    @Override // kotlinx.coroutines.test.UncaughtExceptionCaptor
    public void cleanupTestCoroutines() {
        synchronized (this._lock) {
            try {
                this._coroutinesCleanedUp = true;
                Throwable th = (Throwable) i.m0(this._exceptions);
                if (th != null) {
                    Iterator it2 = i.e0(this._exceptions, 1).iterator();
                    while (it2.hasNext()) {
                        ((Throwable) it2.next()).printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.test.UncaughtExceptionCaptor
    public List<Throwable> getUncaughtExceptions() {
        List<Throwable> X0;
        synchronized (this._lock) {
            X0 = i.X0(this._exceptions);
        }
        return X0;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        synchronized (this._lock) {
            try {
                if (this._coroutinesCleanedUp) {
                    CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext, th);
                }
                this._exceptions.add(th);
                ww8 ww8Var = ww8.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
