package defpackage;

/* loaded from: classes2.dex */
public class r51 extends a61 {
    public static final r51 f = new r51(-1, "18446744073709551615");
    private final long c;
    private String d;
    private String e;

    r51(long j, String str) {
        this.c = j;
        this.d = str;
    }

    static r51 c(long j, String str) {
        a61 a61Var;
        return (j != 0 || (a61Var = a61.a) == null) ? j == -1 ? f : new r51(j, str) : (r51) a61Var;
    }

    public static r51 d(long j) {
        return c(j, null);
    }

    @Override // defpackage.a61
    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String e = pb4.e(this.c, 32);
        this.e = e;
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r51) && this.c == ((r51) obj).c;
    }

    public int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.c);
        this.d = unsignedString;
        return unsignedString;
    }
}
