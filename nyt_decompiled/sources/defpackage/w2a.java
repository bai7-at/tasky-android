package defpackage;

/* loaded from: classes3.dex */
final class w2a {
    public final tx9 a;
    public k3a d;
    public l2a e;
    public int f;
    public int g;
    public int h;
    public int i;
    private boolean l;
    public final j3a b = new j3a();
    public final b9e c = new b9e();
    private final b9e j = new b9e(1);
    private final b9e k = new b9e();

    public w2a(tx9 tx9Var, k3a k3aVar, l2a l2aVar) {
        this.a = tx9Var;
        this.d = k3aVar;
        this.e = l2aVar;
        h(k3aVar, l2aVar);
    }

    public final int a() {
        int i = !this.l ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return f() != null ? 1073741824 | i : i;
    }

    public final int b() {
        return !this.l ? this.d.d[this.f] : this.b.h[this.f];
    }

    public final int c(int i, int i2) {
        b9e b9eVar;
        i3a f = f();
        if (f == null) {
            return 0;
        }
        int i3 = f.d;
        if (i3 != 0) {
            b9eVar = this.b.n;
        } else {
            byte[] bArr = f.e;
            int i4 = khe.a;
            b9e b9eVar2 = this.k;
            int length = bArr.length;
            b9eVar2.i(bArr, length);
            b9eVar = this.k;
            i3 = length;
        }
        boolean b = this.b.b(this.f);
        boolean z = b || i2 != 0;
        b9e b9eVar3 = this.j;
        b9eVar3.m()[0] = (byte) ((true != z ? 0 : 128) | i3);
        b9eVar3.k(0);
        this.a.d(this.j, 1, 1);
        this.a.d(b9eVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!b) {
            this.c.h(8);
            b9e b9eVar4 = this.c;
            byte[] m = b9eVar4.m();
            m[0] = 0;
            m[1] = 1;
            m[2] = 0;
            m[3] = (byte) i2;
            m[4] = (byte) ((i >> 24) & 255);
            m[5] = (byte) ((i >> 16) & 255);
            m[6] = (byte) ((i >> 8) & 255);
            m[7] = (byte) (i & 255);
            this.a.d(b9eVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        b9e b9eVar5 = this.b.n;
        int F = b9eVar5.F();
        b9eVar5.l(-2);
        int i6 = (F * 6) + 2;
        if (i2 != 0) {
            this.c.h(i6);
            byte[] m2 = this.c.m();
            b9eVar5.g(m2, 0, i6);
            int i7 = (((m2[2] & 255) << 8) | (m2[3] & 255)) + i2;
            m2[2] = (byte) ((i7 >> 8) & 255);
            m2[3] = (byte) (i7 & 255);
            b9eVar5 = this.c;
        }
        this.a.d(b9eVar5, i6, 1);
        return i5 + i6;
    }

    public final long d() {
        return !this.l ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final long e() {
        if (!this.l) {
            return this.d.f[this.f];
        }
        j3a j3aVar = this.b;
        return j3aVar.i[this.f];
    }

    public final i3a f() {
        if (!this.l) {
            return null;
        }
        j3a j3aVar = this.b;
        l2a l2aVar = j3aVar.a;
        int i = khe.a;
        int i2 = l2aVar.a;
        i3a i3aVar = j3aVar.m;
        if (i3aVar == null) {
            i3aVar = this.d.a.a(i2);
        }
        if (i3aVar == null || !i3aVar.a) {
            return null;
        }
        return i3aVar;
    }

    public final void h(k3a k3aVar, l2a l2aVar) {
        this.d = k3aVar;
        this.e = l2aVar;
        this.a.f(k3aVar.a.f);
        i();
    }

    public final void i() {
        j3a j3aVar = this.b;
        j3aVar.d = 0;
        j3aVar.p = 0L;
        j3aVar.q = false;
        j3aVar.k = false;
        j3aVar.o = false;
        j3aVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean k() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
