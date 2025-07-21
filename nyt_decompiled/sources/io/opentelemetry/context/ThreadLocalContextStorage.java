package io.opentelemetry.context;

import defpackage.hx0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
enum ThreadLocalContextStorage implements io.opentelemetry.context.b {
    INSTANCE;

    private static final Logger logger = Logger.getLogger(ThreadLocalContextStorage.class.getName());
    private static final ThreadLocal<hx0> THREAD_LOCAL_STORAGE = new ThreadLocal<>();

    enum NoopScope implements e {
        INSTANCE;

        @Override // java.lang.AutoCloseable
        public void close() {
        }
    }

    private class b implements e {
        private final hx0 a;
        private final hx0 b;
        private boolean c;

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.c || ThreadLocalContextStorage.this.current() != this.b) {
                ThreadLocalContextStorage.logger.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
            } else {
                this.c = true;
                ThreadLocalContextStorage.THREAD_LOCAL_STORAGE.set(this.a);
            }
        }

        private b(hx0 hx0Var, hx0 hx0Var2) {
            this.a = hx0Var;
            this.b = hx0Var2;
        }
    }

    public e attach(hx0 hx0Var) {
        hx0 current;
        if (hx0Var != null && hx0Var != (current = current())) {
            THREAD_LOCAL_STORAGE.set(hx0Var);
            return new b(current, hx0Var);
        }
        return NoopScope.INSTANCE;
    }

    @Override // io.opentelemetry.context.b
    public hx0 current() {
        return THREAD_LOCAL_STORAGE.get();
    }

    @Override // io.opentelemetry.context.b
    public /* bridge */ /* synthetic */ hx0 root() {
        return super.root();
    }
}
