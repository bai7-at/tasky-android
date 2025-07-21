package defpackage;

/* loaded from: classes3.dex */
final class y1a {
    public final yw9 a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;

    private y1a(yw9 yw9Var, long j, long j2, long[] jArr, int i, int i2) {
        this.a = yw9Var;
        this.b = j;
        this.c = j2;
        this.f = jArr;
        this.d = i;
        this.e = i2;
    }

    public static y1a a(yw9 yw9Var, b9e b9eVar) {
        long[] jArr;
        int i;
        int i2;
        int v = b9eVar.v();
        int E = (v & 1) != 0 ? b9eVar.E() : -1;
        long J = (v & 2) != 0 ? b9eVar.J() : -1L;
        if ((v & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = b9eVar.B();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((v & 8) != 0) {
            b9eVar.l(4);
        }
        if (b9eVar.q() >= 24) {
            b9eVar.l(21);
            int D = b9eVar.D();
            i2 = D & 4095;
            i = D >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new y1a(yw9Var, E, J, jArr, i, i2);
    }
}
