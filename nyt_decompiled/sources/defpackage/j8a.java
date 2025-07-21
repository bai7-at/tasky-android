package defpackage;

/* loaded from: classes3.dex */
public final class j8a implements n9a {
    private final m7a a;
    private final g8e b = new g8e(new byte[10], 10);
    private int c = 0;
    private int d;
    private pfe e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public j8a(m7a m7aVar) {
        this.a = m7aVar;
    }

    private final void c(int i) {
        this.c = i;
        this.d = 0;
    }

    private final boolean d(b9e b9eVar, byte[] bArr, int i) {
        int min = Math.min(b9eVar.q(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            b9eVar.l(min);
        } else {
            b9eVar.g(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.n9a
    public final void a(pfe pfeVar, sv9 sv9Var, m9a m9aVar) {
        this.e = pfeVar;
        this.a.c(sv9Var, m9aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v16, types: [g8e] */
    /* JADX WARN: Type inference failed for: r8v9, types: [m7a] */
    @Override // defpackage.n9a
    public final void b(b9e b9eVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        wad.b(this.e);
        int i6 = -1;
        int i7 = 2;
        ?? r6 = 0;
        int i8 = 1;
        if ((i & 1) != 0) {
            int i9 = this.c;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.j;
                    if (i10 != -1) {
                        ezd.f("PesReader", "Unexpected start indicator: expected " + i10 + " more bytes");
                    }
                    this.a.a(b9eVar.t() == 0);
                } else {
                    ezd.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i11 = i;
        while (b9eVar.q() > 0) {
            int i12 = this.c;
            if (i12 == 0) {
                i2 = i7;
                z = r6;
                i3 = i8;
                b9eVar.l(b9eVar.q());
            } else if (i12 != i8) {
                if (i12 != i7) {
                    int q = b9eVar.q();
                    int i13 = this.j;
                    int i14 = i13 == i6 ? r6 : q - i13;
                    if (i14 > 0) {
                        q -= i14;
                        b9eVar.j(b9eVar.s() + q);
                    }
                    this.a.b(b9eVar);
                    int i15 = this.j;
                    if (i15 != i6) {
                        int i16 = i15 - q;
                        this.j = i16;
                        if (i16 == 0) {
                            this.a.a(r6);
                            c(i8);
                        }
                    }
                } else {
                    if (d(b9eVar, this.b.a, Math.min(10, this.i)) && d(b9eVar, null, this.i)) {
                        this.b.k(r6);
                        if (this.f) {
                            this.b.m(4);
                            long d = this.b.d(3);
                            this.b.m(i8);
                            int d2 = this.b.d(15) << 15;
                            this.b.m(i8);
                            long d3 = this.b.d(15);
                            this.b.m(i8);
                            if (this.h || !this.g) {
                                i5 = d2;
                            } else {
                                this.b.m(4);
                                this.b.m(i8);
                                int d4 = this.b.d(15) << 15;
                                this.b.m(i8);
                                long d5 = this.b.d(15);
                                this.b.m(i8);
                                i5 = d2;
                                this.e.b((this.b.d(3) << 30) | d4 | d5);
                                this.h = true;
                            }
                            j = this.e.b((d << 30) | i5 | d3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i11 |= true != this.k ? 0 : 4;
                        this.a.d(j, i11);
                        c(3);
                        i6 = -1;
                        i7 = 2;
                        r6 = 0;
                        i8 = 1;
                    }
                }
                i2 = i7;
                z = r6;
                i3 = i8;
            } else if (d(b9eVar, this.b.a, 9)) {
                z = false;
                this.b.k(0);
                int d6 = this.b.d(24);
                i3 = 1;
                if (d6 != 1) {
                    ezd.f("PesReader", "Unexpected start code prefix: " + d6);
                    i6 = -1;
                    this.j = -1;
                    i4 = 0;
                    i2 = 2;
                } else {
                    this.b.m(8);
                    g8e g8eVar = this.b;
                    int d7 = g8eVar.d(16);
                    g8eVar.m(5);
                    this.k = this.b.o();
                    i2 = 2;
                    this.b.m(2);
                    this.f = this.b.o();
                    this.g = this.b.o();
                    this.b.m(6);
                    int d8 = this.b.d(8);
                    this.i = d8;
                    if (d7 == 0) {
                        this.j = -1;
                        i6 = -1;
                    } else {
                        int i17 = (d7 - 3) - d8;
                        this.j = i17;
                        if (i17 < 0) {
                            ezd.f("PesReader", "Found negative packet payload size: " + i17);
                            i6 = -1;
                            this.j = -1;
                        } else {
                            i6 = -1;
                        }
                    }
                    i4 = 2;
                }
                c(i4);
            } else {
                i6 = -1;
                z = false;
                i3 = 1;
                i2 = 2;
            }
            i8 = i3;
            r6 = z;
            i7 = i2;
        }
    }

    @Override // defpackage.n9a
    public final void zzc() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zze();
    }
}
