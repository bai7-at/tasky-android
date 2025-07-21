package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class sj2 extends op2 {
    private final long a;
    private final boolean b;
    private long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(px7 px7Var, long j, boolean z) {
        super(px7Var);
        zq3.h(px7Var, "delegate");
        this.a = j;
        this.b = z;
    }

    private final void a(ad0 ad0Var, long j) {
        ad0 ad0Var2 = new ad0();
        ad0Var2.I0(ad0Var);
        ad0Var.write(ad0Var2, j);
        ad0Var2.a();
    }

    @Override // defpackage.op2, defpackage.px7
    public long read(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "sink");
        long j2 = this.c;
        long j3 = this.a;
        if (j2 > j3) {
            j = 0;
        } else if (this.b) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(ad0Var, j);
        if (read != -1) {
            this.c += read;
        }
        long j5 = this.c;
        long j6 = this.a;
        if ((j5 >= j6 || read != -1) && j5 <= j6) {
            return read;
        }
        if (read > 0 && j5 > j6) {
            a(ad0Var, ad0Var.h1() - (this.c - this.a));
        }
        throw new IOException("expected " + this.a + " bytes but got " + this.c);
    }
}
