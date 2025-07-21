package io.opentelemetry.sdk.trace;

import defpackage.bz6;
import defpackage.gq0;
import defpackage.gy7;
import defpackage.iy7;
import defpackage.yl0;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class l {
    private final yl0 b;
    private final c c;
    private final boolean d;
    private final bz6 e;
    private final Supplier f;
    private final io.opentelemetry.sdk.trace.samplers.e g;
    private final iy7 h;
    private final Object a = new Object();
    private volatile gq0 i = null;

    l(yl0 yl0Var, c cVar, bz6 bz6Var, Supplier supplier, io.opentelemetry.sdk.trace.samplers.e eVar, List list) {
        this.b = yl0Var;
        this.c = cVar;
        this.d = cVar instanceof RandomIdGenerator;
        this.e = bz6Var;
        this.f = supplier;
        this.g = eVar;
        this.h = iy7.c(list);
    }

    iy7 a() {
        return this.h;
    }

    yl0 b() {
        return this.b;
    }

    c c() {
        return this.c;
    }

    bz6 d() {
        return this.e;
    }

    io.opentelemetry.sdk.trace.samplers.e e() {
        return this.g;
    }

    gy7 f() {
        return (gy7) this.f.get();
    }

    boolean g() {
        return this.i != null;
    }

    boolean h() {
        return this.d;
    }

    gq0 i() {
        synchronized (this.a) {
            try {
                if (this.i != null) {
                    return this.i;
                }
                this.i = this.h.shutdown();
                return this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
