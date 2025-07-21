package defpackage;

import io.opentelemetry.sdk.trace.i;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class ei5 implements di5, Closeable {
    private static final Logger f = Logger.getLogger(ei5.class.getName());
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final c b;
    private final b c;
    private final a d;
    private final sx0 e;

    static class a implements q94 {
        private final bd7 a;

        a(bd7 bd7Var) {
            this.a = bd7Var;
        }

        @Override // defpackage.q94
        public o94 b(String str) {
            return this.a.b(str);
        }

        public bd7 c() {
            return this.a;
        }
    }

    static class b implements et4 {
        private final jd7 a;

        b(jd7 jd7Var) {
            this.a = jd7Var;
        }

        @Override // defpackage.et4
        public dt4 b(String str) {
            return this.a.b(str);
        }

        public jd7 c() {
            return this.a;
        }
    }

    static class c implements lp8 {
        private final i a;

        c(i iVar) {
            this.a = iVar;
        }

        @Override // defpackage.lp8
        public gp8 b(String str, String str2) {
            return this.a.b(str, str2);
        }

        public i c() {
            return this.a;
        }

        @Override // defpackage.lp8
        public gp8 get(String str) {
            return this.a.get(str);
        }
    }

    ei5(i iVar, jd7 jd7Var, bd7 bd7Var, sx0 sx0Var) {
        this.b = new c(iVar);
        this.c = new b(jd7Var);
        this.d = new a(bd7Var);
        this.e = sx0Var;
    }

    public static fi5 d() {
        return new fi5();
    }

    @Override // defpackage.di5
    public lp8 b() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    public q94 h() {
        return this.d;
    }

    public gq0 shutdown() {
        if (!this.a.compareAndSet(false, true)) {
            f.info("Multiple shutdown calls");
            return gq0.i();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b.c().shutdown());
        arrayList.add(this.c.c().shutdown());
        arrayList.add(this.d.c().shutdown());
        return gq0.g(arrayList);
    }

    public String toString() {
        return "OpenTelemetrySdk{tracerProvider=" + this.b.c() + ", meterProvider=" + this.c.c() + ", loggerProvider=" + this.d.c() + ", propagators=" + this.e + "}";
    }
}
