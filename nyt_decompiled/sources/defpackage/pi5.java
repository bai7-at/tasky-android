package defpackage;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import defpackage.hi5;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class pi5 {
    public static final hi5 c(final ip8 ip8Var, final String str, final Executor executor, final qs2 qs2Var) {
        zq3.h(ip8Var, "tracer");
        zq3.h(str, "label");
        zq3.h(executor, "executor");
        zq3.h(qs2Var, "block");
        final fy4 fy4Var = new fy4(hi5.b);
        j64 a = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: ni5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                ww8 d;
                d = pi5.d(executor, ip8Var, str, qs2Var, fy4Var, aVar);
                return d;
            }
        });
        zq3.g(a, "getFuture { completer ->…}\n            }\n        }");
        return new mi5(fy4Var, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ww8 d(Executor executor, final ip8 ip8Var, final String str, final qs2 qs2Var, final fy4 fy4Var, final CallbackToFutureAdapter.a aVar) {
        zq3.h(aVar, "completer");
        executor.execute(new Runnable() { // from class: oi5
            @Override // java.lang.Runnable
            public final void run() {
                pi5.e(ip8.this, str, qs2Var, fy4Var, aVar);
            }
        });
        return ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ip8 ip8Var, String str, qs2 qs2Var, fy4 fy4Var, CallbackToFutureAdapter.a aVar) {
        boolean isEnabled = ip8Var.isEnabled();
        if (isEnabled) {
            try {
                ip8Var.a(str);
            } finally {
                if (isEnabled) {
                    ip8Var.d();
                }
            }
        }
        try {
            qs2Var.mo865invoke();
            hi5.b.c cVar = hi5.a;
            fy4Var.n(cVar);
            aVar.c(cVar);
        } catch (Throwable th) {
            fy4Var.n(new hi5.b.a(th));
            aVar.f(th);
        }
        ww8 ww8Var = ww8.a;
    }
}
