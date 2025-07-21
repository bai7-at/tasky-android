package io.opentelemetry.sdk.trace;

import defpackage.yl0;

/* loaded from: classes5.dex */
final class a {
    private final yl0 a;
    private final long b;
    private final long c;

    private a(yl0 yl0Var, long j, long j2) {
        this.a = yl0Var;
        this.b = j;
        this.c = j2;
    }

    public static a a(yl0 yl0Var) {
        return new a(yl0Var, yl0Var.now(), yl0Var.nanoTime());
    }

    long b() {
        return this.b + (this.a.nanoTime() - this.c);
    }

    long c() {
        return this.b;
    }
}
