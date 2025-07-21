package defpackage;

import com.google.android.gms.internal.measurement.m1;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class atd {
    final cha a;
    final xhe b;
    final xhe c;
    final b9f d;

    public atd() {
        cha chaVar = new cha();
        this.a = chaVar;
        xhe xheVar = new xhe(null, chaVar);
        this.c = xheVar;
        this.b = xheVar.a();
        b9f b9fVar = new b9f();
        this.d = b9fVar;
        xheVar.g("require", new g2g(b9fVar));
        b9fVar.a("internal.platform", new Callable() { // from class: gzc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new u5g();
            }
        });
        xheVar.g("runtime.counter", new q0a(Double.valueOf(0.0d)));
    }

    public final caa a(xhe xheVar, m1... m1VarArr) {
        caa caaVar = caa.T;
        for (m1 m1Var : m1VarArr) {
            caaVar = k6f.a(m1Var);
            s0f.c(this.c);
            if ((caaVar instanceof waa) || (caaVar instanceof a9a)) {
                caaVar = this.a.a(xheVar, caaVar);
            }
        }
        return caaVar;
    }
}
