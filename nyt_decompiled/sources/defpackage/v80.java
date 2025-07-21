package defpackage;

/* loaded from: classes.dex */
public abstract class v80 {
    public static final u80 a(sf3 sf3Var, long j, long j2, int i) {
        u80 u80Var = new u80(sf3Var, j, j2, null);
        u80Var.n(i);
        return u80Var;
    }

    public static /* synthetic */ u80 b(sf3 sf3Var, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = vm3.b.a();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = in3.a(sf3Var.getWidth(), sf3Var.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = jh2.a.a();
        }
        return a(sf3Var, j3, j4, i);
    }
}
