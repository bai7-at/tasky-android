package defpackage;

/* loaded from: classes3.dex */
public final class e8a implements m7a {
    private tx9 b;
    private boolean c;
    private int e;
    private int f;
    private final b9e a = new b9e(10);
    private long d = -9223372036854775807L;

    @Override // defpackage.m7a
    public final void a(boolean z) {
        int i;
        wad.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            wad.f(this.d != -9223372036854775807L);
            this.b.c(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.m7a
    public final void b(b9e b9eVar) {
        wad.b(this.b);
        if (this.c) {
            int q = b9eVar.q();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(q, 10 - i);
                System.arraycopy(b9eVar.m(), b9eVar.s(), this.a.m(), this.f, min);
                if (this.f + min == 10) {
                    this.a.k(0);
                    if (this.a.B() != 73 || this.a.B() != 68 || this.a.B() != 51) {
                        ezd.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.l(3);
                        this.e = this.a.A() + 10;
                    }
                }
            }
            int min2 = Math.min(q, this.e - this.f);
            this.b.b(b9eVar, min2);
            this.f += min2;
        }
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 5);
        this.b = zzw;
        x3a x3aVar = new x3a();
        x3aVar.k(m9aVar.b());
        x3aVar.w("application/id3");
        zzw.f(x3aVar.D());
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
