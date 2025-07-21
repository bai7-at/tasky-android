package defpackage;

import com.google.android.exoplayer2.u1;

/* loaded from: classes2.dex */
public final class h08 implements rh4 {
    private final vl0 a;
    private boolean b;
    private long c;
    private long d;
    private u1 e = u1.d;

    public h08(vl0 vl0Var) {
        this.a = vl0Var;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.elapsedRealtime();
        }
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.d = this.a.elapsedRealtime();
        this.b = true;
    }

    public void c() {
        if (this.b) {
            a(z());
            this.b = false;
        }
    }

    @Override // defpackage.rh4
    public u1 e() {
        return this.e;
    }

    @Override // defpackage.rh4
    public void i(u1 u1Var) {
        if (this.b) {
            a(z());
        }
        this.e = u1Var;
    }

    @Override // defpackage.rh4
    public long z() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long elapsedRealtime = this.a.elapsedRealtime() - this.d;
        u1 u1Var = this.e;
        return j + (u1Var.a == 1.0f ? z19.D0(elapsedRealtime) : u1Var.c(elapsedRealtime));
    }
}
