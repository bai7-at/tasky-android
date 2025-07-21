package defpackage;

/* loaded from: classes.dex */
public interface ip5 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ip5 a(int i, ip5 ip5Var, ip5 ip5Var2) {
            ip5 a2 = cg.a();
            if (a2.G(ip5Var, ip5Var2, i)) {
                return a2;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    static /* synthetic */ void B(ip5 ip5Var, ip5 ip5Var2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = fd5.b.c();
        }
        ip5Var.y(ip5Var2, j);
    }

    void A(int i);

    void C(long j);

    void D(a37 a37Var);

    void E(kt6 kt6Var);

    int F();

    boolean G(ip5 ip5Var, ip5 ip5Var2, int i);

    void H(float f, float f2);

    void a();

    void close();

    boolean isEmpty();

    void q();

    void r(float f, float f2);

    void s(float f, float f2, float f3, float f4, float f5, float f6);

    void t(float f, float f2);

    kt6 u();

    void v(float f, float f2);

    void w(float f, float f2, float f3, float f4, float f5, float f6);

    void x(float f, float f2, float f3, float f4);

    void y(ip5 ip5Var, long j);

    void z(float f, float f2, float f3, float f4);
}
