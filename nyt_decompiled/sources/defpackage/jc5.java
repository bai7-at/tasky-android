package defpackage;

import java.util.concurrent.TimeUnit;
import rx.exceptions.OnErrorFailedException;
import rx.internal.util.ScalarSynchronousObservable;

/* loaded from: classes5.dex */
public class jc5<T> {
    static final o47 b = r47.b().c();
    final a a;

    public interface a extends w3 {
    }

    public interface b extends ps2 {
    }

    public interface c extends ps2 {
    }

    protected jc5(a aVar) {
        this.a = aVar;
    }

    public static jc5 b(a aVar) {
        return new jc5(b.a(aVar));
    }

    public static jc5 d(long j, long j2, TimeUnit timeUnit) {
        return e(j, j2, timeUnit, mb7.a());
    }

    public static jc5 e(long j, long j2, TimeUnit timeUnit, eb7 eb7Var) {
        return b(new uf5(j, j2, timeUnit, eb7Var));
    }

    public static jc5 f(Object obj) {
        return ScalarSynchronousObservable.u(obj);
    }

    static gb8 o(wa8 wa8Var, jc5 jc5Var) {
        if (wa8Var == null) {
            throw new IllegalArgumentException("observer can not be null");
        }
        if (jc5Var.a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        wa8Var.onStart();
        if (!(wa8Var instanceof o77)) {
            wa8Var = new o77(wa8Var);
        }
        try {
            o47 o47Var = b;
            o47Var.e(jc5Var, jc5Var.a).call(wa8Var);
            return o47Var.d(wa8Var);
        } catch (Throwable th) {
            e62.d(th);
            if (wa8Var.isUnsubscribed()) {
                q47.a(b.c(th));
            } else {
                try {
                    wa8Var.onError(b.c(th));
                } catch (Throwable th2) {
                    e62.d(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    b.c(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return tb8.c();
        }
    }

    public static jc5 q(long j, TimeUnit timeUnit) {
        return r(j, timeUnit, mb7.a());
    }

    public static jc5 r(long j, TimeUnit timeUnit, eb7 eb7Var) {
        return b(new tf5(j, timeUnit, eb7Var));
    }

    public jc5 a(c cVar) {
        return (jc5) cVar.call(this);
    }

    public final jc5 c(ps2 ps2Var) {
        return g(new vi5(ps2Var));
    }

    public final jc5 g(b bVar) {
        return new jc5(new rf5(this.a, bVar));
    }

    public final jc5 h(ps2 ps2Var) {
        return g(new wi5(ps2Var));
    }

    public final jc5 i(eb7 eb7Var) {
        return j(eb7Var, y47.c);
    }

    public final jc5 j(eb7 eb7Var, int i) {
        return k(eb7Var, false, i);
    }

    public final jc5 k(eb7 eb7Var, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).w(eb7Var) : g(new xi5(eb7Var, z, i));
    }

    public final jc5 l(ps2 ps2Var) {
        return g(yi5.b(ps2Var));
    }

    public final gb8 m(uc5 uc5Var) {
        return uc5Var instanceof wa8 ? n((wa8) uc5Var) : n(new yc5(uc5Var));
    }

    public final gb8 n(wa8 wa8Var) {
        return o(wa8Var, this);
    }

    public final jc5 p(eb7 eb7Var) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).w(eb7Var) : b(new zi5(this, eb7Var));
    }

    public vs7 s() {
        return new vs7(sf5.b(this));
    }

    public final gb8 t(wa8 wa8Var) {
        try {
            wa8Var.onStart();
            o47 o47Var = b;
            o47Var.e(this, this.a).call(wa8Var);
            return o47Var.d(wa8Var);
        } catch (Throwable th) {
            e62.d(th);
            try {
                wa8Var.onError(b.c(th));
                return tb8.c();
            } catch (Throwable th2) {
                e62.d(th2);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                b.c(runtimeException);
                throw runtimeException;
            }
        }
    }
}
