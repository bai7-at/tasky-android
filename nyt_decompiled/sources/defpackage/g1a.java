package defpackage;

/* loaded from: classes3.dex */
final class g1a {
    private final b9e a = new b9e(8);
    private int b;

    private final long b(ov9 ov9Var) {
        int i;
        bv9 bv9Var = (bv9) ov9Var;
        int i2 = 0;
        bv9Var.d(this.a.m(), 0, 1, false);
        int i3 = this.a.m()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        bv9Var.d(this.a.m(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.a.m()[i2] & 255) + (i6 << 8);
        }
        this.b += i;
        return i6;
    }

    public final boolean a(ov9 ov9Var) {
        long zzd = ov9Var.zzd();
        long j = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j = zzd;
        }
        bv9 bv9Var = (bv9) ov9Var;
        bv9Var.d(this.a.m(), 0, 4, false);
        long J = this.a.J();
        this.b = 4;
        while (J != 440786851) {
            int i = (int) j;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            bv9Var.d(this.a.m(), 0, 1, false);
            J = ((J << 8) & (-256)) | (this.a.m()[0] & 255);
        }
        long b = b(ov9Var);
        long j2 = this.b;
        if (b != Long.MIN_VALUE) {
            long j3 = j2 + b;
            if (zzd == -1 || j3 < zzd) {
                while (true) {
                    long j4 = this.b;
                    if (j4 < j3) {
                        if (b(ov9Var) == Long.MIN_VALUE) {
                            return false;
                        }
                        long b2 = b(ov9Var);
                        if (b2 < 0) {
                            return false;
                        }
                        if (b2 != 0) {
                            int i3 = (int) b2;
                            bv9Var.k(i3, false);
                            this.b += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
