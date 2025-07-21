package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class mdc {
    private final Set a = new HashSet();
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private final Set g = new HashSet();
    private final Set h = new HashSet();
    private final Set i = new HashSet();
    private final Set j = new HashSet();
    private final Set k = new HashSet();
    private final Set l = new HashSet();
    private final Set m = new HashSet();
    private final Set n = new HashSet();
    private dyd o;

    public final mdc d(jq9 jq9Var, Executor executor) {
        this.c.add(new tfc(jq9Var, executor));
        return this;
    }

    public final mdc e(c7c c7cVar, Executor executor) {
        this.i.add(new tfc(c7cVar, executor));
        return this;
    }

    public final mdc f(p7c p7cVar, Executor executor) {
        this.l.add(new tfc(p7cVar, executor));
        return this;
    }

    public final mdc g(t7c t7cVar, Executor executor) {
        this.f.add(new tfc(t7cVar, executor));
        return this;
    }

    public final mdc h(w6c w6cVar, Executor executor) {
        this.e.add(new tfc(w6cVar, executor));
        return this;
    }

    public final mdc i(r8c r8cVar, Executor executor) {
        this.h.add(new tfc(r8cVar, executor));
        return this;
    }

    public final mdc j(c9c c9cVar, Executor executor) {
        this.g.add(new tfc(c9cVar, executor));
        return this;
    }

    public final mdc k(tof tofVar, Executor executor) {
        this.n.add(new tfc(tofVar, executor));
        return this;
    }

    public final mdc l(s9c s9cVar, Executor executor) {
        this.m.add(new tfc(s9cVar, executor));
        return this;
    }

    public final mdc m(cac cacVar, Executor executor) {
        this.b.add(new tfc(cacVar, executor));
        return this;
    }

    public final mdc n(jl jlVar, Executor executor) {
        this.k.add(new tfc(jlVar, executor));
        return this;
    }

    public final mdc o(bgc bgcVar, Executor executor) {
        this.d.add(new tfc(bgcVar, executor));
        return this;
    }

    public final mdc p(dyd dydVar) {
        this.o = dydVar;
        return this;
    }

    public final odc q() {
        return new odc(this, null);
    }
}
