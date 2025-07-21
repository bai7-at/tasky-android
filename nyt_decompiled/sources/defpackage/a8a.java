package defpackage;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class a8a {
    private final tx9 a;
    private final mse d;
    private final byte[] e;
    private int f;
    private long g;
    private long h;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final z7a i = new z7a(null);
    private final z7a j = new z7a(null);
    private boolean k = false;

    public a8a(tx9 tx9Var, boolean z, boolean z2) {
        this.a = tx9Var;
        byte[] bArr = new byte[128];
        this.e = bArr;
        this.d = new mse(bArr, 0, 0);
    }

    private final void g(int i) {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.n;
        long j2 = this.g - this.l;
        this.a.c(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void a(long j) {
        this.g = j;
        g(0);
        this.k = false;
    }

    public final void b(gpe gpeVar) {
        this.c.append(gpeVar.a, gpeVar);
    }

    public final void c(iqe iqeVar) {
        this.b.append(iqeVar.d, iqeVar);
    }

    public final void d() {
        this.k = false;
    }

    public final void e(long j, int i, long j2, boolean z) {
        this.f = i;
        this.h = j2;
        this.g = j;
        this.o = z;
    }

    public final boolean f(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.f == 9) {
            if (z && this.k) {
                g(i + ((int) (j - this.g)));
            }
            this.l = this.g;
            this.m = this.h;
            this.n = false;
            this.k = true;
        }
        boolean z3 = this.o;
        boolean z4 = this.n;
        int i2 = this.f;
        if (i2 == 5 || (z3 && i2 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.n = z5;
        return z5;
    }
}
