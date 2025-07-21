package io.opentelemetry.sdk.trace;

import defpackage.bz6;
import defpackage.gp8;
import defpackage.gq0;
import defpackage.jp8;
import defpackage.lm3;
import defpackage.lp8;
import defpackage.pr0;
import defpackage.yl0;
import io.opentelemetry.sdk.trace.g;
import io.opentelemetry.sdk.trace.i;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class i implements lp8, Closeable {
    private static final Logger c = Logger.getLogger(i.class.getName());
    private final l a;
    private final pr0 b = new pr0(new Function() { // from class: nd7
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            g i;
            i = i.this.i((lm3) obj);
            return i;
        }
    });

    i(yl0 yl0Var, c cVar, bz6 bz6Var, Supplier supplier, io.opentelemetry.sdk.trace.samplers.e eVar, List list) {
        this.a = new l(yl0Var, cVar, bz6Var, supplier, eVar, list);
    }

    public static j h() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g i(lm3 lm3Var) {
        return new g(this.a, lm3Var);
    }

    @Override // defpackage.lp8
    public gp8 b(String str, String str2) {
        return j(str).a(str2).build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.lp8
    public gp8 get(String str) {
        return j(str).build();
    }

    public jp8 j(String str) {
        if (str == null || str.isEmpty()) {
            c.fine("Tracer requested without instrumentation scope name.");
            str = "";
        }
        return new h(this.b, str);
    }

    public gq0 shutdown() {
        if (!this.a.g()) {
            return this.a.i();
        }
        c.log(Level.INFO, "Calling shutdown() multiple times.");
        return gq0.i();
    }

    public String toString() {
        return "SdkTracerProvider{clock=" + this.a.b() + ", idGenerator=" + this.a.c() + ", resource=" + this.a.d() + ", spanLimitsSupplier=" + this.a.f() + ", sampler=" + this.a.e() + ", spanProcessor=" + this.a.a() + '}';
    }
}
