package defpackage;

import androidx.compose.runtime.b0;
import androidx.emoji2.text.e;

/* loaded from: classes.dex */
final class zh1 implements tz1 {
    private x08 a;

    public static final class a extends e.f {
        final /* synthetic */ sy4 a;
        final /* synthetic */ zh1 b;

        a(sy4 sy4Var, zh1 zh1Var) {
            this.a = sy4Var;
            this.b = zh1Var;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            hh3 hh3Var;
            zh1 zh1Var = this.b;
            hh3Var = uz1.a;
            zh1Var.a = hh3Var;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.a.setValue(Boolean.TRUE);
            this.b.a = new hh3(true);
        }
    }

    public zh1() {
        this.a = e.k() ? c() : null;
    }

    private final x08 c() {
        e c = e.c();
        if (c.g() == 1) {
            return new hh3(true);
        }
        sy4 e = b0.e(Boolean.FALSE, null, 2, null);
        c.v(new a(e, this));
        return e;
    }

    @Override // defpackage.tz1
    public x08 a() {
        hh3 hh3Var;
        x08 x08Var = this.a;
        if (x08Var != null) {
            zq3.e(x08Var);
            return x08Var;
        }
        if (!e.k()) {
            hh3Var = uz1.a;
            return hh3Var;
        }
        x08 c = c();
        this.a = c;
        zq3.e(c);
        return c;
    }
}
