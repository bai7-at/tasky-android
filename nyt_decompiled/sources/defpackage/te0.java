package defpackage;

import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
public final class te0 implements d93 {
    private static final e06 d = new e06();
    final y72 a;
    private final t0 b;
    private final qm8 c;

    public te0(y72 y72Var, t0 t0Var, qm8 qm8Var) {
        this.a = y72Var;
        this.b = t0Var;
        this.c = qm8Var;
    }

    @Override // defpackage.d93
    public void a() {
        this.a.a(0L, 0L);
    }

    @Override // defpackage.d93
    public boolean b(z72 z72Var) {
        return this.a.d(z72Var, d) == 0;
    }

    @Override // defpackage.d93
    public void c(a82 a82Var) {
        this.a.c(a82Var);
    }

    @Override // defpackage.d93
    public boolean d() {
        y72 y72Var = this.a;
        return (y72Var instanceof rt8) || (y72Var instanceof oq2);
    }

    @Override // defpackage.d93
    public boolean e() {
        y72 y72Var = this.a;
        return (y72Var instanceof l9) || (y72Var instanceof g2) || (y72Var instanceof k2) || (y72Var instanceof ow4);
    }

    @Override // defpackage.d93
    public d93 f() {
        y72 ow4Var;
        ur.g(!d());
        y72 y72Var = this.a;
        if (y72Var instanceof yf9) {
            ow4Var = new yf9(this.b.c, this.c);
        } else if (y72Var instanceof l9) {
            ow4Var = new l9();
        } else if (y72Var instanceof g2) {
            ow4Var = new g2();
        } else if (y72Var instanceof k2) {
            ow4Var = new k2();
        } else {
            if (!(y72Var instanceof ow4)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.a.getClass().getSimpleName());
            }
            ow4Var = new ow4();
        }
        return new te0(ow4Var, this.b, this.c);
    }
}
