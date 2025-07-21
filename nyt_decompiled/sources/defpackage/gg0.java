package defpackage;

import com.nytimes.android.external.cache3.CacheBuilder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class gg0 {
    private static dg0 a(sp4 sp4Var) {
        return sp4Var == null ? CacheBuilder.x().v(q28.a()).g(q28.b(), q28.c()).a() : sp4Var.b() == -1 ? CacheBuilder.x().v(sp4Var.e()).g(sp4Var.d(), sp4Var.c()).a() : CacheBuilder.x().v(sp4Var.e()).f(sp4Var.b(), sp4Var.c()).a();
    }

    private static dg0 b(sp4 sp4Var) {
        long seconds = sp4Var == null ? q28.c().toSeconds(q28.b()) : sp4Var.c().toSeconds(sp4Var.d());
        long seconds2 = TimeUnit.MINUTES.toSeconds(1L);
        if (seconds > seconds2) {
            return CacheBuilder.x().g(seconds2, TimeUnit.SECONDS).a();
        }
        return CacheBuilder.x().g(sp4Var == null ? q28.b() : sp4Var.d(), sp4Var == null ? q28.c() : sp4Var.c()).a();
    }

    static dg0 c(sp4 sp4Var) {
        return a(sp4Var);
    }

    static dg0 d(sp4 sp4Var) {
        return b(sp4Var);
    }
}
