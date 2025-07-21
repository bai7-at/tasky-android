package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes2.dex */
public class ld5 implements y72 {
    public static final d82 d = new d82() { // from class: kd5
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] f;
            f = ld5.f();
            return f;
        }
    };
    private a82 a;
    private r38 b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] f() {
        return new y72[]{new ld5()};
    }

    private static yo5 g(yo5 yo5Var) {
        yo5Var.U(0);
        return yo5Var;
    }

    private boolean h(z72 z72Var) {
        od5 od5Var = new od5();
        if (od5Var.a(z72Var, true) && (od5Var.b & 2) == 2) {
            int min = Math.min(od5Var.i, 8);
            yo5 yo5Var = new yo5(min);
            z72Var.r(yo5Var.e(), 0, min);
            if (fk2.p(g(yo5Var))) {
                this.b = new fk2();
            } else if (nc9.r(g(yo5Var))) {
                this.b = new nc9();
            } else if (vk5.o(g(yo5Var))) {
                this.b = new vk5();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        r38 r38Var = this.b;
        if (r38Var != null) {
            r38Var.m(j, j2);
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.a = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        ur.i(this.a);
        if (this.b == null) {
            if (!h(z72Var)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            z72Var.g();
        }
        if (!this.c) {
            yp8 a = this.a.a(0, 1);
            this.a.s();
            this.b.d(this.a, a);
            this.c = true;
        }
        return this.b.g(z72Var, e06Var);
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        try {
            return h(z72Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.y72
    public void release() {
    }
}
