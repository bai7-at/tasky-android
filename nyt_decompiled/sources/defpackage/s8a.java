package defpackage;

/* loaded from: classes3.dex */
public final class s8a implements n9a {
    private final r8a a;
    private final b9e b = new b9e(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public s8a(r8a r8aVar) {
        this.a = r8aVar;
    }

    @Override // defpackage.n9a
    public final void a(pfe pfeVar, sv9 sv9Var, m9a m9aVar) {
        this.a.a(pfeVar, sv9Var, m9aVar);
        this.f = true;
    }

    @Override // defpackage.n9a
    public final void b(b9e b9eVar, int i) {
        int i2 = i & 1;
        int s = i2 != 0 ? b9eVar.s() + b9eVar.B() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            b9eVar.k(s);
            this.d = 0;
        }
        while (b9eVar.q() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int B = b9eVar.B();
                    b9eVar.k(b9eVar.s() - 1);
                    if (B == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(b9eVar.q(), 3 - this.d);
                b9eVar.g(this.b.m(), this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.k(0);
                    this.b.j(3);
                    this.b.l(1);
                    b9e b9eVar2 = this.b;
                    int B2 = b9eVar2.B();
                    boolean z = (B2 & 128) != 0;
                    int B3 = b9eVar2.B();
                    this.e = z;
                    this.c = (B3 | ((B2 & 15) << 8)) + 3;
                    int r = this.b.r();
                    int i5 = this.c;
                    if (r < i5) {
                        int r2 = this.b.r();
                        this.b.e(Math.min(4098, Math.max(i5, r2 + r2)));
                    }
                }
            } else {
                int min2 = Math.min(b9eVar.q(), this.c - i3);
                b9eVar.g(this.b.m(), this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.j(i7);
                    } else {
                        if (khe.s(this.b.m(), 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.j(this.c - 4);
                    }
                    this.b.k(0);
                    this.a.b(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.n9a
    public final void zzc() {
        this.f = true;
    }
}
