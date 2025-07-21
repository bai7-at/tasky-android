package defpackage;

/* loaded from: classes2.dex */
public class q51 extends a61 {
    public static final q51 g = new q51(0, 0, "00000000000000000000000000000000");
    private final long c;
    private final long d;
    private String e;
    private String f;

    private q51(long j, long j2, String str) {
        this.c = j;
        this.d = j2;
        this.e = str;
    }

    public static q51 c(long j, long j2) {
        return new q51(j, j2, null);
    }

    @Override // defpackage.a61
    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String f = pb4.f(this.c, this.d, 32);
        this.e = f;
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q51)) {
            return false;
        }
        q51 q51Var = (q51) obj;
        return this.c == q51Var.c && this.d == q51Var.d;
    }

    public int hashCode() {
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.d;
        return (int) ((j2 ^ j3) ^ (j3 >>> 32));
    }

    public String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.d);
        this.f = unsignedString;
        return unsignedString;
    }
}
