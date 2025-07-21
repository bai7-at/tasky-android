package defpackage;

/* loaded from: classes3.dex */
public final class ux9 {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(tx9 tx9Var, lx9 lx9Var) {
        if (this.c > 0) {
            tx9Var.c(this.d, this.e, this.f, this.g, lx9Var);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(tx9 tx9Var, long j, int i, int i2, int i3, lx9 lx9Var) {
        if (this.g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(tx9Var, lx9Var);
            }
        }
    }

    public final void d(ov9 ov9Var) {
        if (this.b) {
            return;
        }
        ov9Var.j(this.a, 0, 10);
        ov9Var.zzj();
        byte[] bArr = this.a;
        int i = bu9.g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
