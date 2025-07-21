package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ayf {
    public static final ayf h;
    public static final ayf i;
    private static final String j;
    private static final String k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;
    public static final zhf p;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    private int g;

    static {
        zuf zufVar = new zuf();
        zufVar.c(1);
        zufVar.b(2);
        zufVar.d(3);
        h = zufVar.g();
        zuf zufVar2 = new zuf();
        zufVar2.c(1);
        zufVar2.b(1);
        zufVar2.d(2);
        i = zufVar2.g();
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = new zhf() { // from class: zof
        };
    }

    /* synthetic */ ayf(int i2, int i3, int i4, byte[] bArr, int i5, int i6, rwf rwfVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i2) {
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

    private static String g(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String h(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String i(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final zuf c() {
        return new zuf(this, null);
    }

    public final String d() {
        String str;
        String str2;
        if (f()) {
            str = String.format(Locale.US, "%s/%s/%s", h(this.a), g(this.b), i(this.c));
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            str2 = this.e + "/" + this.f;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    public final boolean e() {
        return (this.e == -1 || this.f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ayf.class == obj.getClass()) {
            ayf ayfVar = (ayf) obj;
            if (this.a == ayfVar.a && this.b == ayfVar.b && this.c == ayfVar.c && Arrays.equals(this.d, ayfVar.d) && this.e == ayfVar.e && this.f == ayfVar.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + this.e) * 31) + this.f;
        this.g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i2 = this.e;
        String str2 = "NA";
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        byte[] bArr = this.d;
        int i4 = this.c;
        int i5 = this.b;
        int i6 = this.a;
        return "ColorInfo(" + h(i6) + ", " + g(i5) + ", " + i(i4) + ", " + (bArr != null) + ", " + str + ", " + str2 + ")";
    }
}
