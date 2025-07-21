package defpackage;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class h21 implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final pn7 b;
    private final Thread.UncaughtExceptionHandler c;
    private final m11 d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    interface a {
        void a(pn7 pn7Var, Thread thread, Throwable th);
    }

    public h21(a aVar, pn7 pn7Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, m11 m11Var) {
        this.a = aVar;
        this.b = pn7Var;
        this.c = uncaughtExceptionHandler;
        this.d = m11Var;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            m94.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            m94.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        m94.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    m94.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                m94.f().e("An error occurred in the uncaught exception handler", e);
            }
            m94.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
        } catch (Throwable th2) {
            m94.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
    }
}
