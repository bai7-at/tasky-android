package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class w5e {
    private final Object a;
    private final String b;
    private final j64 c;
    private final List d;
    private final j64 e;
    final /* synthetic */ x5e f;

    private w5e(x5e x5eVar, Object obj, String str, j64 j64Var, List list, j64 j64Var2) {
        this.f = x5eVar;
        this.a = obj;
        this.b = str;
        this.c = j64Var;
        this.d = list;
        this.e = j64Var2;
    }

    public final h5e a() {
        y5e y5eVar;
        Object obj = this.a;
        String str = this.b;
        if (str == null) {
            str = this.f.f(obj);
        }
        final h5e h5eVar = new h5e(obj, str, this.e);
        y5eVar = this.f.c;
        y5eVar.d0(h5eVar);
        j64 j64Var = this.c;
        Runnable runnable = new Runnable() { // from class: t5e
            @Override // java.lang.Runnable
            public final void run() {
                y5e y5eVar2;
                y5eVar2 = w5e.this.f.c;
                y5eVar2.x(h5eVar);
            }
        };
        kke kkeVar = pgb.f;
        j64Var.a(runnable, kkeVar);
        zb.r(h5eVar, new u5e(this, h5eVar), kkeVar);
        return h5eVar;
    }

    public final w5e b(Object obj) {
        return this.f.b(obj, a());
    }

    public final w5e c(Class cls, ake akeVar) {
        kke kkeVar;
        kkeVar = this.f.a;
        return new w5e(this.f, this.a, this.b, this.c, this.d, zb.f(this.e, cls, akeVar, kkeVar));
    }

    public final w5e d(final j64 j64Var) {
        return g(new ake() { // from class: p5e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return j64.this;
            }
        }, pgb.f);
    }

    public final w5e e(final f5e f5eVar) {
        return f(new ake() { // from class: o5e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(f5e.this.zza(obj));
            }
        });
    }

    public final w5e f(ake akeVar) {
        kke kkeVar;
        kkeVar = this.f.a;
        return g(akeVar, kkeVar);
    }

    public final w5e g(ake akeVar, Executor executor) {
        return new w5e(this.f, this.a, this.b, this.c, this.d, zb.n(this.e, akeVar, executor));
    }

    public final w5e h(String str) {
        return new w5e(this.f, this.a, str, this.c, this.d, this.e);
    }

    public final w5e i(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f.b;
        return new w5e(this.f, this.a, this.b, this.c, this.d, zb.o(this.e, j, timeUnit, scheduledExecutorService));
    }
}
