package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class m5e {
    public static final w5e a(Callable callable, Object obj, x5e x5eVar) {
        kke kkeVar;
        kkeVar = x5eVar.a;
        return b(callable, kkeVar, obj, x5eVar);
    }

    public static final w5e b(Callable callable, kke kkeVar, Object obj, x5e x5eVar) {
        j64 j64Var;
        j64Var = x5e.d;
        return new w5e(x5eVar, obj, j64Var, Collections.emptyList(), kkeVar.j(callable));
    }

    public static final w5e c(j64 j64Var, Object obj, x5e x5eVar) {
        j64 j64Var2;
        j64Var2 = x5e.d;
        return new w5e(x5eVar, obj, j64Var2, Collections.emptyList(), j64Var);
    }

    public static final w5e d(final g5e g5eVar, kke kkeVar, Object obj, x5e x5eVar) {
        return b(new Callable() { // from class: l5e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g5e.this.zza();
                return null;
            }
        }, kkeVar, obj, x5eVar);
    }
}
