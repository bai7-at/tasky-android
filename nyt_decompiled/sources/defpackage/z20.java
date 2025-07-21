package defpackage;

/* loaded from: classes2.dex */
final class z20 implements w20 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private z20(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static z20 c(yo5 yo5Var) {
        int u = yo5Var.u();
        yo5Var.V(12);
        int u2 = yo5Var.u();
        int u3 = yo5Var.u();
        int u4 = yo5Var.u();
        yo5Var.V(4);
        int u5 = yo5Var.u();
        int u6 = yo5Var.u();
        yo5Var.V(8);
        return new z20(u, u2, u3, u4, u5, u6);
    }

    public long a() {
        return z19.Q0(this.e, this.c * 1000000, this.d);
    }

    public int b() {
        int i = this.a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        a84.j("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.a));
        return -1;
    }

    @Override // defpackage.w20
    public int getType() {
        return 1752331379;
    }
}
