package defpackage;

/* loaded from: classes3.dex */
public class cra {
    private final String a;
    private final Object b;
    private final int c;

    protected cra(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static cra a(String str, double d) {
        return new cra(str, Double.valueOf(d), 3);
    }

    public static cra b(String str, long j) {
        return new cra(str, Long.valueOf(j), 2);
    }

    public static cra c(String str, String str2) {
        return new cra(str, str2, 4);
    }

    public static cra d(String str, boolean z) {
        return new cra(str, Boolean.valueOf(z), 1);
    }

    public final Object e() {
        lsa a = nsa.a();
        if (a == null) {
            nsa.b();
            return this.b;
        }
        int i = this.c - 1;
        return i != 0 ? i != 1 ? i != 2 ? a.a(this.a, (String) this.b) : a.b(this.a, ((Double) this.b).doubleValue()) : a.c(this.a, ((Long) this.b).longValue()) : a.zza(this.a, ((Boolean) this.b).booleanValue());
    }
}
