package defpackage;

import com.google.android.gms.internal.ads.zzaff;

/* loaded from: classes3.dex */
final class kz9 extends jz9 {
    private final b9e b;
    private final b9e c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public kz9(tx9 tx9Var) {
        super(tx9Var);
        this.b = new b9e(kre.a);
        this.c = new b9e(4);
    }

    @Override // defpackage.jz9
    protected final boolean a(b9e b9eVar) {
        int B = b9eVar.B();
        int i = B >> 4;
        int i2 = B & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new zzaff("Video format not supported: " + i2);
    }

    @Override // defpackage.jz9
    protected final boolean b(b9e b9eVar, long j) {
        int i;
        int B = b9eVar.B();
        long w = b9eVar.w();
        if (B == 0) {
            if (!this.e) {
                b9e b9eVar2 = new b9e(new byte[b9eVar.q()]);
                b9eVar.g(b9eVar2.m(), 0, b9eVar.q());
                hu9 a = hu9.a(b9eVar2);
                this.d = a.b;
                x3a x3aVar = new x3a();
                x3aVar.w("video/avc");
                x3aVar.l0(a.k);
                x3aVar.C(a.c);
                x3aVar.i(a.d);
                x3aVar.s(a.j);
                x3aVar.l(a.a);
                this.a.f(x3aVar.D());
                this.e = true;
                return false;
            }
        } else if (B == 1 && this.e) {
            int i2 = this.g == 1 ? 1 : 0;
            if (this.f) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] m = this.c.m();
            m[0] = 0;
            m[1] = 0;
            m[2] = 0;
            int i3 = 4 - this.d;
            int i4 = 0;
            while (b9eVar.q() > 0) {
                b9eVar.g(this.c.m(), i3, this.d);
                this.c.k(0);
                b9e b9eVar3 = this.c;
                b9e b9eVar4 = this.b;
                int E = b9eVar3.E();
                b9eVar4.k(0);
                this.a.b(this.b, 4);
                this.a.b(b9eVar, E);
                i4 = i4 + 4 + E;
            }
            this.a.c(j + (w * 1000), i, i4, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
