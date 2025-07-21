package defpackage;

/* loaded from: classes3.dex */
public abstract class sea {
    public static final sea f = new bha(new dda(), null);
    private static final String g = Integer.toString(0, 36);
    private static final String h = Integer.toString(1, 36);
    private static final String i = Integer.toString(2, 36);
    private static final String j = Integer.toString(3, 36);
    private static final String k = Integer.toString(4, 36);
    static final String l = Integer.toString(5, 36);
    static final String m = Integer.toString(6, 36);
    public static final zhf n = new zhf() { // from class: uca
    };
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* synthetic */ sea(dda ddaVar, pda pdaVar) {
        int i2 = khe.a;
        this.a = 0L;
        this.b = Long.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sea)) {
            return false;
        }
        long j2 = ((sea) obj).a;
        return true;
    }

    public final int hashCode() {
        return ((int) (-9223372034707292160L)) * 29791;
    }
}
