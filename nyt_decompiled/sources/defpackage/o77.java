package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;

/* loaded from: classes5.dex */
public class o77 extends wa8 {
    private final wa8 a;
    boolean b;

    public o77(wa8 wa8Var) {
        super(wa8Var);
        this.b = false;
        this.a = wa8Var;
    }

    protected void b(Throwable th) {
        q47.a(th);
        try {
            this.a.onError(th);
            try {
                unsubscribe();
            } catch (RuntimeException e) {
                q47.a(e);
                throw new OnErrorFailedException(e);
            }
        } catch (Throwable th2) {
            if (th2 instanceof OnErrorNotImplementedException) {
                try {
                    unsubscribe();
                    throw th2;
                } catch (Throwable th3) {
                    q47.a(th3);
                    throw new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
                }
            }
            q47.a(th2);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th2)));
            } catch (Throwable th4) {
                q47.a(th4);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th2, th4)));
            }
        }
    }

    @Override // defpackage.uc5
    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            this.a.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e62.d(th);
                q47.a(th);
                throw new OnCompletedFailedException(th.getMessage(), th);
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // defpackage.uc5
    public void onError(Throwable th) {
        e62.d(th);
        if (this.b) {
            return;
        }
        this.b = true;
        b(th);
    }

    @Override // defpackage.uc5
    public void onNext(Object obj) {
        try {
            if (this.b) {
                return;
            }
            this.a.onNext(obj);
        } catch (Throwable th) {
            e62.e(th, this);
        }
    }
}
