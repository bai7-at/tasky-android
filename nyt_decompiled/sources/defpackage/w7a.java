package defpackage;

/* loaded from: classes3.dex */
final class w7a {
    private final tx9 a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private long g;
    private long h;

    public w7a(tx9 tx9Var) {
        this.a = tx9Var;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = i3 + (i2 - i);
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(long j, int i, boolean z) {
        wad.f(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r5, long r6) {
        /*
            r4 = this;
            r4.e = r5
            r0 = 0
            r4.d = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto Lf
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L11
            r5 = r3
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r4.b = r3
            if (r5 != r2) goto L17
            goto L18
        L17:
            r1 = r0
        L18:
            r4.c = r1
            r4.f = r0
            r4.h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7a.c(int, long):void");
    }

    public final void d() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = -1;
    }
}
