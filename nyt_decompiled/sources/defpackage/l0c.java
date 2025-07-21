package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class l0c {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    private static final String E;
    public static final zhf F;
    public static final Object p = new Object();
    private static final Object q = new Object();
    private static final cza r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final String x;
    private static final String y;
    private static final String z;
    public Object b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public moa j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public Object a = p;
    public cza c = r;

    static {
        wba wbaVar = new wba();
        wbaVar.a("androidx.media3.common.Timeline");
        wbaVar.b(Uri.EMPTY);
        r = wbaVar.c();
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = new zhf() { // from class: izb
        };
    }

    public final l0c a(Object obj, cza czaVar, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, moa moaVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = czaVar == null ? r : czaVar;
        this.b = null;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = z2;
        this.h = z3;
        this.i = moaVar != null;
        this.j = moaVar;
        this.l = 0L;
        this.m = j5;
        this.n = 0;
        this.o = 0;
        this.k = false;
        return this;
    }

    public final boolean b() {
        wad.f(this.i == (this.j != null));
        return this.j != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0c.class.equals(obj.getClass())) {
            l0c l0cVar = (l0c) obj;
            if (khe.f(this.a, l0cVar.a) && khe.f(this.c, l0cVar.c) && khe.f(null, null) && khe.f(this.j, l0cVar.j) && this.d == l0cVar.d && this.e == l0cVar.e && this.f == l0cVar.f && this.g == l0cVar.g && this.h == l0cVar.h && this.k == l0cVar.k && this.m == l0cVar.m && this.n == l0cVar.n && this.o == l0cVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() + 217) * 31) + this.c.hashCode();
        moa moaVar = this.j;
        int hashCode2 = ((hashCode * 961) + (moaVar == null ? 0 : moaVar.hashCode())) * 31;
        long j = this.d;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.k ? 1 : 0);
        long j4 = this.m;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
    }
}
