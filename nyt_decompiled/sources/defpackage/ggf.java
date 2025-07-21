package defpackage;

/* loaded from: classes3.dex */
public final class ggf {
    public static final ggf c;
    public static final ggf d;
    public static final ggf e;
    public static final ggf f;
    public static final ggf g;
    public final long a;
    public final long b;

    static {
        ggf ggfVar = new ggf(0L, 0L);
        c = ggfVar;
        d = new ggf(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new ggf(Long.MAX_VALUE, 0L);
        f = new ggf(0L, Long.MAX_VALUE);
        g = ggfVar;
    }

    public ggf(long j, long j2) {
        wad.d(j >= 0);
        wad.d(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ggf.class == obj.getClass()) {
            ggf ggfVar = (ggf) obj;
            if (this.a == ggfVar.a && this.b == ggfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
