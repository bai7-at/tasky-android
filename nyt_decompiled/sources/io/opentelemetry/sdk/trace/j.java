package io.opentelemetry.sdk.trace;

import defpackage.bz6;
import defpackage.iy7;
import defpackage.yl0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class j {
    private static final io.opentelemetry.sdk.trace.samplers.e g = io.opentelemetry.sdk.trace.samplers.e.b(io.opentelemetry.sdk.trace.samplers.e.c());
    private final List a = new ArrayList();
    private yl0 b = yl0.a();
    private c c = c.a();
    private bz6 d = bz6.g();
    private Supplier e = new Supplier() { // from class: od7
        @Override // java.util.function.Supplier
        public final Object get() {
            return gy7.b();
        }
    };
    private io.opentelemetry.sdk.trace.samplers.e f = g;

    j() {
    }

    public j a(bz6 bz6Var) {
        Objects.requireNonNull(bz6Var, "resource");
        this.d = this.d.l(bz6Var);
        return this;
    }

    public j b(iy7 iy7Var) {
        this.a.add(iy7Var);
        return this;
    }

    public i c() {
        return new i(this.b, this.c, this.d, this.e, this.f, this.a);
    }

    public j d(yl0 yl0Var) {
        Objects.requireNonNull(yl0Var, "clock");
        this.b = yl0Var;
        return this;
    }
}
