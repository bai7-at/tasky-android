package defpackage;

import defpackage.gl1;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p11 implements m11 {
    private static final f25 c = new b();
    private final gl1 a;
    private final AtomicReference b = new AtomicReference(null);

    private static final class b implements f25 {
        private b() {
        }

        @Override // defpackage.f25
        public File a() {
            return null;
        }

        @Override // defpackage.f25
        public File b() {
            return null;
        }

        @Override // defpackage.f25
        public File c() {
            return null;
        }

        @Override // defpackage.f25
        public File d() {
            return null;
        }

        @Override // defpackage.f25
        public File e() {
            return null;
        }

        @Override // defpackage.f25
        public File f() {
            return null;
        }
    }

    public p11(gl1 gl1Var) {
        this.a = gl1Var;
        gl1Var.a(new gl1.a() { // from class: n11
            @Override // gl1.a
            public final void a(q76 q76Var) {
                p11.this.g(q76Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(q76 q76Var) {
        m94.f().b("Crashlytics native component now available.");
        this.b.set((m11) q76Var.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j, r18 r18Var, q76 q76Var) {
        ((m11) q76Var.get()).d(str, str2, j, r18Var);
    }

    @Override // defpackage.m11
    public f25 a(String str) {
        m11 m11Var = (m11) this.b.get();
        return m11Var == null ? c : m11Var.a(str);
    }

    @Override // defpackage.m11
    public boolean b() {
        m11 m11Var = (m11) this.b.get();
        return m11Var != null && m11Var.b();
    }

    @Override // defpackage.m11
    public boolean c(String str) {
        m11 m11Var = (m11) this.b.get();
        return m11Var != null && m11Var.c(str);
    }

    @Override // defpackage.m11
    public void d(final String str, final String str2, final long j, final r18 r18Var) {
        m94.f().i("Deferring native open session: " + str);
        this.a.a(new gl1.a() { // from class: o11
            @Override // gl1.a
            public final void a(q76 q76Var) {
                p11.h(str, str2, j, r18Var, q76Var);
            }
        });
    }
}
