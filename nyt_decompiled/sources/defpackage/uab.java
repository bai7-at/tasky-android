package defpackage;

import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class uab {
    final atd a;
    xhe b;
    final vs9 c;
    private final c8g d;

    public uab() {
        atd atdVar = new atd();
        this.a = atdVar;
        this.b = atdVar.b.a();
        this.c = new vs9();
        this.d = new c8g();
        atdVar.d.a("internal.registerCallback", new Callable() { // from class: xp9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return uab.this.b();
            }
        });
        atdVar.d.a("internal.eventLogger", new Callable() { // from class: wka
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new abf(uab.this.c);
            }
        });
    }

    public final vs9 a() {
        return this.c;
    }

    final /* synthetic */ l1a b() {
        return new k0g(this.d);
    }

    public final void c(j1 j1Var) {
        l1a l1aVar;
        try {
            this.b = this.a.b.a();
            if (this.a.a(this.b, (m1[]) j1Var.t().toArray(new m1[0])) instanceof d0a) {
                throw new IllegalStateException("Program loading failed");
            }
            for (h1 h1Var : j1Var.r().u()) {
                List t = h1Var.t();
                String s = h1Var.s();
                Iterator it2 = t.iterator();
                while (it2.hasNext()) {
                    caa a = this.a.a(this.b, (m1) it2.next());
                    if (!(a instanceof m6a)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    xhe xheVar = this.b;
                    if (xheVar.h(s)) {
                        caa d = xheVar.d(s);
                        if (!(d instanceof l1a)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(s)));
                        }
                        l1aVar = (l1a) d;
                    } else {
                        l1aVar = null;
                    }
                    if (l1aVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(s)));
                    }
                    l1aVar.b(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.a.d.a(str, callable);
    }

    public final boolean e(vq9 vq9Var) {
        try {
            this.c.d(vq9Var);
            this.a.c.g("runtime.counter", new q0a(Double.valueOf(0.0d)));
            this.d.b(this.b.a(), this.c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean f() {
        return !this.c.c().isEmpty();
    }

    public final boolean g() {
        vs9 vs9Var = this.c;
        return !vs9Var.b().equals(vs9Var.a());
    }
}
