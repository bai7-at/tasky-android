package defpackage;

import com.amazonaws.event.ProgressEvent;

/* loaded from: classes3.dex */
public final class g8a implements m7a {
    private final b9e a;
    private final yw9 b;
    private final String c;
    private tx9 d;
    private String e;
    private int f = 0;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public g8a(String str) {
        b9e b9eVar = new b9e(4);
        this.a = b9eVar;
        b9eVar.m()[0] = -1;
        this.b = new yw9();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
    }

    @Override // defpackage.m7a
    public final void b(b9e b9eVar) {
        wad.b(this.d);
        while (b9eVar.q() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] m = b9eVar.m();
                int s = b9eVar.s();
                int t = b9eVar.t();
                while (true) {
                    if (s >= t) {
                        b9eVar.k(t);
                        break;
                    }
                    int i2 = s + 1;
                    byte b = m[s];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        b9eVar.k(i2);
                        this.i = false;
                        this.a.m()[1] = m[s];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    s = i2;
                }
            } else if (i != 1) {
                int min = Math.min(b9eVar.q(), this.k - this.g);
                this.d.b(b9eVar, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 >= this.k) {
                    wad.f(this.l != -9223372036854775807L);
                    this.d.c(this.l, 1, this.k, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                int min2 = Math.min(b9eVar.q(), 4 - this.g);
                b9eVar.g(this.a.m(), this.g, min2);
                int i4 = this.g + min2;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.k(0);
                    if (this.b.a(this.a.v())) {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (r0.g * 1000000) / r0.d;
                            x3a x3aVar = new x3a();
                            x3aVar.k(this.e);
                            x3aVar.w(this.b.b);
                            x3aVar.o(ProgressEvent.PART_FAILED_EVENT_CODE);
                            x3aVar.k0(this.b.e);
                            x3aVar.x(this.b.d);
                            x3aVar.n(this.c);
                            this.d.f(x3aVar.D());
                            this.h = true;
                        }
                        this.a.k(0);
                        this.d.b(this.a, 4);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.e = m9aVar.b();
        this.d = sv9Var.zzw(m9aVar.a(), 1);
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
