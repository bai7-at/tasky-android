package defpackage;

/* loaded from: classes4.dex */
public abstract class cq5 {
    public static final ip5 a(ss2 ss2Var, ss2 ss2Var2) {
        zq3.h(ss2Var, "pathBuilder1");
        zq3.h(ss2Var2, "pathBuilder2");
        return b(d(false, ss2Var, 1, null), d(false, ss2Var2, 1, null));
    }

    public static final ip5 b(ip5 ip5Var, ip5 ip5Var2) {
        zq3.h(ip5Var, "path1");
        zq3.h(ip5Var2, "path2");
        return ip5.a.a(wp5.a.d(), ip5Var, ip5Var2);
    }

    public static final ip5 c(boolean z, ss2 ss2Var) {
        zq3.h(ss2Var, "builder");
        ip5 a = cg.a();
        ss2Var.invoke(a);
        if (z) {
            a.close();
        }
        return a;
    }

    public static /* synthetic */ ip5 d(boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c(z, ss2Var);
    }
}
