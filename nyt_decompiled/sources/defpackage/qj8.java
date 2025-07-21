package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
public final class qj8 extends f implements Handler.Callback {
    private boolean B;
    private int H;
    private t0 L;
    private vb8 M;
    private yb8 N;
    private zb8 Q;
    private zb8 S;
    private int X;
    private long Y;
    private long Z;
    private long e0;
    private final Handler s;
    private final jj8 t;
    private final wb8 u;
    private final ep2 w;
    private boolean x;
    private boolean y;

    public qj8(jj8 jj8Var, Looper looper) {
        this(jj8Var, looper, wb8.a);
    }

    private void d0() {
        o0(new c41(ImmutableList.x(), g0(this.e0)));
    }

    private long e0(long j) {
        int a = this.Q.a(j);
        if (a == 0 || this.Q.d() == 0) {
            return this.Q.b;
        }
        if (a != -1) {
            return this.Q.c(a - 1);
        }
        return this.Q.c(r1.d() - 1);
    }

    private long f0() {
        if (this.X == -1) {
            return Long.MAX_VALUE;
        }
        ur.e(this.Q);
        if (this.X >= this.Q.d()) {
            return Long.MAX_VALUE;
        }
        return this.Q.c(this.X);
    }

    private long g0(long j) {
        ur.g(j != -9223372036854775807L);
        ur.g(this.Z != -9223372036854775807L);
        return j - this.Z;
    }

    private void h0(SubtitleDecoderException subtitleDecoderException) {
        a84.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.L, subtitleDecoderException);
        d0();
        m0();
    }

    private void i0() {
        this.B = true;
        this.M = this.u.c((t0) ur.e(this.L));
    }

    private void j0(c41 c41Var) {
        this.t.j(c41Var.a);
        this.t.s(c41Var);
    }

    private void k0() {
        this.N = null;
        this.X = -1;
        zb8 zb8Var = this.Q;
        if (zb8Var != null) {
            zb8Var.s();
            this.Q = null;
        }
        zb8 zb8Var2 = this.S;
        if (zb8Var2 != null) {
            zb8Var2.s();
            this.S = null;
        }
    }

    private void l0() {
        k0();
        ((vb8) ur.e(this.M)).release();
        this.M = null;
        this.H = 0;
    }

    private void m0() {
        l0();
        i0();
    }

    private void o0(c41 c41Var) {
        Handler handler = this.s;
        if (handler != null) {
            handler.obtainMessage(0, c41Var).sendToTarget();
        } else {
            j0(c41Var);
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public void D(long j, long j2) {
        boolean z;
        this.e0 = j;
        if (v()) {
            long j3 = this.Y;
            if (j3 != -9223372036854775807L && j >= j3) {
                k0();
                this.y = true;
            }
        }
        if (this.y) {
            return;
        }
        if (this.S == null) {
            ((vb8) ur.e(this.M)).a(j);
            try {
                this.S = (zb8) ((vb8) ur.e(this.M)).b();
            } catch (SubtitleDecoderException e) {
                h0(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.Q != null) {
            long f0 = f0();
            z = false;
            while (f0 <= j) {
                this.X++;
                f0 = f0();
                z = true;
            }
        } else {
            z = false;
        }
        zb8 zb8Var = this.S;
        if (zb8Var != null) {
            if (zb8Var.l()) {
                if (!z && f0() == Long.MAX_VALUE) {
                    if (this.H == 2) {
                        m0();
                    } else {
                        k0();
                        this.y = true;
                    }
                }
            } else if (zb8Var.b <= j) {
                zb8 zb8Var2 = this.Q;
                if (zb8Var2 != null) {
                    zb8Var2.s();
                }
                this.X = zb8Var.a(j);
                this.Q = zb8Var;
                this.S = null;
                z = true;
            }
        }
        if (z) {
            ur.e(this.Q);
            o0(new c41(this.Q.b(j), g0(e0(j))));
        }
        if (this.H == 2) {
            return;
        }
        while (!this.x) {
            try {
                yb8 yb8Var = this.N;
                if (yb8Var == null) {
                    yb8Var = (yb8) ((vb8) ur.e(this.M)).d();
                    if (yb8Var == null) {
                        return;
                    } else {
                        this.N = yb8Var;
                    }
                }
                if (this.H == 1) {
                    yb8Var.q(4);
                    ((vb8) ur.e(this.M)).c(yb8Var);
                    this.N = null;
                    this.H = 2;
                    return;
                }
                int a0 = a0(this.w, yb8Var, 0);
                if (a0 == -4) {
                    if (yb8Var.l()) {
                        this.x = true;
                        this.B = false;
                    } else {
                        t0 t0Var = this.w.b;
                        if (t0Var == null) {
                            return;
                        }
                        yb8Var.i = t0Var.s;
                        yb8Var.u();
                        this.B &= !yb8Var.o();
                    }
                    if (!this.B) {
                        ((vb8) ur.e(this.M)).c(yb8Var);
                        this.N = null;
                    }
                } else if (a0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                h0(e2);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void R() {
        this.L = null;
        this.Y = -9223372036854775807L;
        d0();
        this.Z = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        l0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        this.e0 = j;
        d0();
        this.x = false;
        this.y = false;
        this.Y = -9223372036854775807L;
        if (this.H != 0) {
            m0();
        } else {
            k0();
            ((vb8) ur.e(this.M)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void Z(t0[] t0VarArr, long j, long j2) {
        this.Z = j2;
        this.L = t0VarArr[0];
        if (this.M != null) {
            this.H = 1;
        } else {
            i0();
        }
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(t0 t0Var) {
        if (this.u.b(t0Var)) {
            return a2.r(t0Var.f0 == 0 ? 4 : 2);
        }
        return ku4.r(t0Var.l) ? a2.r(1) : a2.r(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean d() {
        return this.y;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        j0((c41) message.obj);
        return true;
    }

    public void n0(long j) {
        ur.g(v());
        this.Y = j;
    }

    public qj8(jj8 jj8Var, Looper looper, wb8 wb8Var) {
        super(3);
        this.t = (jj8) ur.e(jj8Var);
        this.s = looper == null ? null : z19.v(looper, this);
        this.u = wb8Var;
        this.w = new ep2();
        this.Y = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
    }
}
