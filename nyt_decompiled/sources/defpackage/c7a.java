package defpackage;

/* loaded from: classes3.dex */
public final class c7a implements m7a {
    private final g8e a;
    private final b9e b;
    private final String c;
    private String d;
    private tx9 e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private l6a j;
    private int k;
    private long l;

    public c7a(String str) {
        g8e g8eVar = new g8e(new byte[128], 128);
        this.a = g8eVar;
        this.b = new b9e(g8eVar.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
    }

    @Override // defpackage.m7a
    public final void b(b9e b9eVar) {
        wad.b(this.e);
        while (b9eVar.q() > 0) {
            int i = this.f;
            if (i == 0) {
                while (true) {
                    if (b9eVar.q() <= 0) {
                        break;
                    }
                    if (this.h) {
                        int B = b9eVar.B();
                        if (B == 119) {
                            this.h = false;
                            this.f = 1;
                            b9e b9eVar2 = this.b;
                            b9eVar2.m()[0] = 11;
                            b9eVar2.m()[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = B == 11;
                    } else {
                        this.h = b9eVar.B() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(b9eVar.q(), this.k - this.g);
                this.e.b(b9eVar, min);
                int i2 = this.g + min;
                this.g = i2;
                if (i2 == this.k) {
                    wad.f(this.l != -9223372036854775807L);
                    this.e.c(this.l, 1, this.k, 0, null);
                    this.l += this.i;
                    this.f = 0;
                }
            } else {
                byte[] m = this.b.m();
                int min2 = Math.min(b9eVar.q(), 128 - this.g);
                b9eVar.g(m, this.g, min2);
                int i3 = this.g + min2;
                this.g = i3;
                if (i3 == 128) {
                    this.a.k(0);
                    au9 e = bu9.e(this.a);
                    l6a l6aVar = this.j;
                    if (l6aVar == null || e.c != l6aVar.y || e.b != l6aVar.z || !khe.f(e.a, l6aVar.l)) {
                        x3a x3aVar = new x3a();
                        x3aVar.k(this.d);
                        x3aVar.w(e.a);
                        x3aVar.k0(e.c);
                        x3aVar.x(e.b);
                        x3aVar.n(this.c);
                        x3aVar.r(e.f);
                        if ("audio/ac3".equals(e.a)) {
                            x3aVar.j0(e.f);
                        }
                        l6a D = x3aVar.D();
                        this.j = D;
                        this.e.f(D);
                    }
                    this.k = e.d;
                    this.i = (e.e * 1000000) / this.j.z;
                    this.b.k(0);
                    this.e.b(this.b, 128);
                    this.f = 2;
                }
            }
        }
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.d = m9aVar.b();
        this.e = sv9Var.zzw(m9aVar.a(), 1);
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }
}
