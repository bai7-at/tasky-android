package defpackage;

import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class l6a {
    private static final l6a H = new l6a(new x3a());
    private static final String I = Integer.toString(0, 36);
    private static final String J = Integer.toString(1, 36);
    private static final String K = Integer.toString(2, 36);
    private static final String L = Integer.toString(3, 36);
    private static final String M = Integer.toString(4, 36);
    private static final String N = Integer.toString(5, 36);
    private static final String O = Integer.toString(6, 36);
    private static final String P = Integer.toString(7, 36);
    private static final String Q = Integer.toString(8, 36);
    private static final String R = Integer.toString(9, 36);
    private static final String S = Integer.toString(10, 36);
    private static final String T = Integer.toString(11, 36);
    private static final String U = Integer.toString(12, 36);
    private static final String V = Integer.toString(13, 36);
    private static final String W = Integer.toString(14, 36);
    private static final String X = Integer.toString(15, 36);
    private static final String Y = Integer.toString(16, 36);
    private static final String Z = Integer.toString(17, 36);
    private static final String a0 = Integer.toString(18, 36);
    private static final String b0 = Integer.toString(19, 36);
    private static final String c0 = Integer.toString(20, 36);
    private static final String d0 = Integer.toString(21, 36);
    private static final String e0 = Integer.toString(22, 36);
    private static final String f0 = Integer.toString(23, 36);
    private static final String g0 = Integer.toString(24, 36);
    private static final String h0 = Integer.toString(25, 36);
    private static final String i0 = Integer.toString(26, 36);
    private static final String j0 = Integer.toString(27, 36);
    private static final String k0 = Integer.toString(28, 36);
    private static final String l0 = Integer.toString(29, 36);
    private static final String m0 = Integer.toString(30, 36);
    private static final String n0 = Integer.toString(31, 36);
    public static final zhf o0 = new zhf() { // from class: i1a
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final zzby j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final zzae o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final ayf x;
    public final int y;
    public final int z;

    public final int a() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final x3a b() {
        return new x3a(this, null);
    }

    public final l6a c(int i) {
        x3a x3aVar = new x3a(this, null);
        x3aVar.c(i);
        return new l6a(x3aVar);
    }

    public final boolean d(l6a l6aVar) {
        if (this.n.size() != l6aVar.n.size()) {
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!Arrays.equals((byte[]) this.n.get(i), (byte[]) l6aVar.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && l6a.class == obj.getClass()) {
            l6a l6aVar = (l6a) obj;
            int i2 = this.G;
            if ((i2 == 0 || (i = l6aVar.G) == 0 || i2 == i) && this.d == l6aVar.d && this.e == l6aVar.e && this.f == l6aVar.f && this.g == l6aVar.g && this.m == l6aVar.m && this.p == l6aVar.p && this.q == l6aVar.q && this.r == l6aVar.r && this.t == l6aVar.t && this.w == l6aVar.w && this.y == l6aVar.y && this.z == l6aVar.z && this.A == l6aVar.A && this.B == l6aVar.B && this.C == l6aVar.C && this.D == l6aVar.D && this.F == l6aVar.F && Float.compare(this.s, l6aVar.s) == 0 && Float.compare(this.u, l6aVar.u) == 0 && khe.f(this.a, l6aVar.a) && khe.f(this.b, l6aVar.b) && khe.f(this.i, l6aVar.i) && khe.f(this.k, l6aVar.k) && khe.f(this.l, l6aVar.l) && khe.f(this.c, l6aVar.c) && Arrays.equals(this.v, l6aVar.v) && khe.f(this.j, l6aVar.j) && khe.f(this.x, l6aVar.x) && khe.f(this.o, l6aVar.o) && d(l6aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.G;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = hashCode + 527;
        String str3 = this.c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        int i3 = (i2 * 31) + hashCode2;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        String str4 = this.i;
        int hashCode4 = ((((((((((((i3 * 31) + hashCode3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzby zzbyVar = this.j;
        int hashCode5 = (hashCode4 + (zzbyVar == null ? 0 : zzbyVar.hashCode())) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int hashCode7 = ((((((((((((((((((((((((((((((((((hashCode6 + (this.l != null ? r2.hashCode() : 0)) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) - 1) * 31) - 1) * 31) + this.F;
        this.G = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.k + ", " + this.l + ", " + this.i + ", " + this.h + ", " + this.c + ", [" + this.q + ", " + this.r + ", " + this.s + ", " + String.valueOf(this.x) + "], [" + this.y + ", " + this.z + "])";
    }

    private l6a(x3a x3aVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        int i4;
        String str4;
        zzby zzbyVar;
        String str5;
        String str6;
        int i5;
        List list;
        zzae zzaeVar;
        long j;
        int i6;
        int i7;
        float f;
        int i8;
        float f2;
        byte[] bArr;
        int i9;
        ayf ayfVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        str = x3aVar.a;
        this.a = str;
        str2 = x3aVar.b;
        this.b = str2;
        str3 = x3aVar.c;
        this.c = khe.c(str3);
        i = x3aVar.d;
        this.d = i;
        i2 = x3aVar.e;
        this.e = i2;
        i3 = x3aVar.f;
        this.f = i3;
        i4 = x3aVar.g;
        this.g = i4;
        this.h = i4 != -1 ? i4 : i3;
        str4 = x3aVar.h;
        this.i = str4;
        zzbyVar = x3aVar.i;
        this.j = zzbyVar;
        str5 = x3aVar.j;
        this.k = str5;
        str6 = x3aVar.k;
        this.l = str6;
        i5 = x3aVar.l;
        this.m = i5;
        list = x3aVar.m;
        this.n = list == null ? Collections.emptyList() : x3aVar.m;
        zzaeVar = x3aVar.n;
        this.o = zzaeVar;
        j = x3aVar.o;
        this.p = j;
        i6 = x3aVar.p;
        this.q = i6;
        i7 = x3aVar.q;
        this.r = i7;
        f = x3aVar.r;
        this.s = f;
        i8 = x3aVar.s;
        this.t = i8 == -1 ? 0 : x3aVar.s;
        f2 = x3aVar.t;
        this.u = f2 == -1.0f ? 1.0f : x3aVar.t;
        bArr = x3aVar.u;
        this.v = bArr;
        i9 = x3aVar.v;
        this.w = i9;
        ayfVar = x3aVar.w;
        this.x = ayfVar;
        i10 = x3aVar.x;
        this.y = i10;
        i11 = x3aVar.y;
        this.z = i11;
        i12 = x3aVar.z;
        this.A = i12;
        i13 = x3aVar.A;
        this.B = i13 == -1 ? 0 : x3aVar.A;
        i14 = x3aVar.B;
        this.C = i14 != -1 ? x3aVar.B : 0;
        i15 = x3aVar.C;
        this.D = i15;
        i16 = x3aVar.D;
        this.E = i16;
        i17 = x3aVar.E;
        this.F = (i17 != 0 || zzaeVar == null) ? x3aVar.E : 1;
    }
}
