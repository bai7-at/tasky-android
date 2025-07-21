package androidx.recyclerview.widget;

import androidx.recyclerview.widget.f;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {
    private final Executor a;
    private final Executor b;
    private final f.AbstractC0113f c;

    public static final class a {
        private static final Object d = new Object();
        private static Executor e;
        private Executor a;
        private Executor b;
        private final f.AbstractC0113f c;

        public a(f.AbstractC0113f abstractC0113f) {
            this.c = abstractC0113f;
        }

        public c a() {
            if (this.b == null) {
                synchronized (d) {
                    try {
                        if (e == null) {
                            e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = e;
            }
            return new c(this.a, this.b, this.c);
        }
    }

    c(Executor executor, Executor executor2, f.AbstractC0113f abstractC0113f) {
        this.a = executor;
        this.b = executor2;
        this.c = abstractC0113f;
    }

    public Executor a() {
        return this.b;
    }

    public f.AbstractC0113f b() {
        return this.c;
    }
}
