package defpackage;

/* loaded from: classes5.dex */
public final class mm3 {
    private final String a;
    private String b;
    private String c;
    private hv d;

    mm3(String str) {
        this.a = str;
    }

    public lm3 a() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        hv hvVar = this.d;
        if (hvVar == null) {
            hvVar = hv.d();
        }
        return lm3.c(str, str2, str3, hvVar);
    }

    public mm3 b(hv hvVar) {
        this.d = hvVar;
        return this;
    }

    public mm3 c(String str) {
        this.c = str;
        return this;
    }

    public mm3 d(String str) {
        this.b = str;
        return this;
    }
}
