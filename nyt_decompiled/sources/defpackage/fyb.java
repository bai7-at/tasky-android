package defpackage;

/* loaded from: classes3.dex */
public final class fyb {
    private static final String h = Integer.toString(0, 36);
    private static final String i = Integer.toString(1, 36);
    private static final String j = Integer.toString(2, 36);
    private static final String k = Integer.toString(3, 36);
    private static final String l = Integer.toString(4, 36);
    public static final zhf m = new zhf() { // from class: exb
    };
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    private z4c g = z4c.e;

    public final int a(int i2) {
        return this.g.a(i2).b;
    }

    public final int b() {
        int i2 = this.g.a;
        return 0;
    }

    public final int c(long j2) {
        return -1;
    }

    public final int d(long j2) {
        this.g.b(-1);
        return -1;
    }

    public final int e(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fyb.class.equals(obj.getClass())) {
            fyb fybVar = (fyb) obj;
            if (khe.f(this.a, fybVar.a) && khe.f(this.b, fybVar.b) && this.c == fybVar.c && this.d == fybVar.d && this.f == fybVar.f && khe.f(this.g, fybVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i2, int i3) {
        return this.g.a(i2).a(i3);
    }

    public final int g() {
        int i2 = this.g.c;
        return 0;
    }

    public final long h(int i2, int i3) {
        jbb a = this.g.a(i2);
        if (a.b != -1) {
            return a.f[i3];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j2 = this.d;
        return (((((hashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final long i(int i2) {
        long j2 = this.g.a(i2).a;
        return 0L;
    }

    public final long j() {
        long j2 = this.g.b;
        return 0L;
    }

    public final long k(int i2) {
        long j2 = this.g.a(i2).g;
        return 0L;
    }

    public final fyb l(Object obj, Object obj2, int i2, long j2, long j3, z4c z4cVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = 0L;
        this.g = z4cVar;
        this.f = z;
        return this;
    }

    public final boolean m(int i2) {
        b();
        if (i2 != -1) {
            return false;
        }
        this.g.b(-1);
        return false;
    }

    public final boolean n(int i2) {
        boolean z = this.g.a(i2).h;
        return false;
    }
}
