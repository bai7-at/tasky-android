package defpackage;

/* loaded from: classes3.dex */
public final class f7a implements m7a {
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

    public f7a(String str) {
        g8e g8eVar = new g8e(new byte[16], 16);
        this.a = g8eVar;
        this.b = new b9e(g8eVar.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
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
                while (b9eVar.q() > 0) {
                    if (this.h) {
                        int B = b9eVar.B();
                        this.h = B == 172;
                        if (B != 64) {
                            if (B == 65) {
                                B = 65;
                            }
                        }
                        this.f = 1;
                        b9e b9eVar2 = this.b;
                        b9eVar2.m()[0] = -84;
                        b9eVar2.m()[1] = B == 65 ? (byte) 65 : (byte) 64;
                        this.g = 2;
                    } else {
                        this.h = b9eVar.B() == 172;
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
                int min2 = Math.min(b9eVar.q(), 16 - this.g);
                b9eVar.g(m, this.g, min2);
                int i3 = this.g + min2;
                this.g = i3;
                if (i3 == 16) {
                    this.a.k(0);
                    eu9 a = fu9.a(this.a);
                    l6a l6aVar = this.j;
                    if (l6aVar == null || l6aVar.y != 2 || a.a != l6aVar.z || !"audio/ac4".equals(l6aVar.l)) {
                        x3a x3aVar = new x3a();
                        x3aVar.k(this.d);
                        x3aVar.w("audio/ac4");
                        x3aVar.k0(2);
                        x3aVar.x(a.a);
                        x3aVar.n(this.c);
                        l6a D = x3aVar.D();
                        this.j = D;
                        this.e.f(D);
                    }
                    this.k = a.b;
                    this.i = (a.c * 1000000) / this.j.z;
                    this.b.k(0);
                    this.e.b(this.b, 16);
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
