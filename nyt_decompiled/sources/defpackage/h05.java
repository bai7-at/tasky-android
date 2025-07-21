package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class h05 {
    private final fx3 a;
    private final nj9 b;

    public h05(fx3 fx3Var, nj9 nj9Var) {
        zq3.h(fx3Var, "killSwitchTimer");
        zq3.h(nj9Var, "androidJobProxy");
        this.a = fx3Var;
        this.b = nj9Var;
    }

    public final boolean a() {
        return tb1.d(this.a.b(), 30L);
    }

    public final void b(String str) {
        zq3.h(str, "tag");
        this.b.a(str);
    }

    public final void c(Class cls, String str, long j, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "uniqueWorkName");
        zq3.h(gv0Var, "constraints");
        this.b.d(cls, str, j, gv0Var);
    }

    public final void d(Class cls, String str, long j, Map map, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "tag");
        zq3.h(gv0Var, "constraints");
        this.b.e(cls, str, j, map, gv0Var);
    }

    public final void e(Class cls, String str, long j, gv0 gv0Var) {
        zq3.h(cls, "workerClass");
        zq3.h(str, "uniqueWorkName");
        zq3.h(gv0Var, "constraints");
        this.b.f(cls, str, j, gv0Var);
    }
}
