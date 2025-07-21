package defpackage;

import java.io.File;

/* loaded from: classes3.dex */
public class e84 {
    private static final b c = new b();
    private final ue2 a;
    private me2 b;

    private static final class b implements me2 {
        private b() {
        }

        @Override // defpackage.me2
        public void a() {
        }

        @Override // defpackage.me2
        public String b() {
            return null;
        }

        @Override // defpackage.me2
        public byte[] c() {
            return null;
        }

        @Override // defpackage.me2
        public void d() {
        }

        @Override // defpackage.me2
        public void e(long j, String str) {
        }
    }

    public e84(ue2 ue2Var) {
        this.a = ue2Var;
        this.b = c;
    }

    private File d(String str) {
        return this.a.n(str, "userlog");
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i) {
        this.b = new nb6(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }

    public e84(ue2 ue2Var, String str) {
        this(ue2Var);
        e(str);
    }
}
