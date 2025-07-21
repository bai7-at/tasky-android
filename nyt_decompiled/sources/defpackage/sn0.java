package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sn0 implements g {
    public static final sn0 f = new sn0(1, 2, 3, null);
    public static final sn0 g = new b().c(1).b(1).d(2).a();
    private static final String h = z19.t0(0);
    private static final String i = z19.t0(1);
    private static final String j = z19.t0(2);
    private static final String k = z19.t0(3);
    public static final g.a l = new g.a() { // from class: rn0
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            sn0 k2;
            k2 = sn0.k(bundle);
            return k2;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public static final class b {
        private int a;
        private int b;
        private int c;
        private byte[] d;

        public sn0 a() {
            return new sn0(this.a, this.b, this.c, this.d);
        }

        public b b(int i) {
            this.b = i;
            return this;
        }

        public b c(int i) {
            this.a = i;
            return this;
        }

        public b d(int i) {
            this.c = i;
            return this;
        }

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }

        private b(sn0 sn0Var) {
            this.a = sn0Var.a;
            this.b = sn0Var.b;
            this.c = sn0Var.c;
            this.d = sn0Var.d;
        }
    }

    public sn0(int i2, int i3, int i4, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
    }

    private static String d(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String e(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String f(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean g(sn0 sn0Var) {
        int i2;
        return sn0Var != null && ((i2 = sn0Var.c) == 7 || i2 == 6);
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ sn0 k(Bundle bundle) {
        return new sn0(bundle.getInt(h, -1), bundle.getInt(i, -1), bundle.getInt(j, -1), bundle.getByteArray(k));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putByteArray(k, this.d);
        return bundle;
    }

    public b c() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn0.class != obj.getClass()) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        return this.a == sn0Var.a && this.b == sn0Var.b && this.c == sn0Var.c && Arrays.equals(this.d, sn0Var.d);
    }

    public boolean h() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String l() {
        return !h() ? "NA" : z19.D("%s/%s/%s", e(this.a), d(this.b), f(this.c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(e(this.a));
        sb.append(", ");
        sb.append(d(this.b));
        sb.append(", ");
        sb.append(f(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }
}
