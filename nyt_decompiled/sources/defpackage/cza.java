package defpackage;

/* loaded from: classes3.dex */
public final class cza {
    public static final cza i = new wba().c();
    private static final String j = Integer.toString(0, 36);
    private static final String k = Integer.toString(1, 36);
    private static final String l = Integer.toString(2, 36);
    private static final String m = Integer.toString(3, 36);
    private static final String n = Integer.toString(4, 36);
    private static final String o = Integer.toString(5, 36);
    public static final zhf p = new zhf() { // from class: w8a
    };
    public final String a;
    public final rra b;
    public final rra c;
    public final moa d;
    public final w5b e;
    public final sea f;
    public final bha g;
    public final dva h;

    /* synthetic */ cza(String str, bha bhaVar, rra rraVar, moa moaVar, w5b w5bVar, dva dvaVar, pya pyaVar) {
        this.a = str;
        this.b = rraVar;
        this.c = rraVar;
        this.d = moaVar;
        this.e = w5bVar;
        this.f = bhaVar;
        this.g = bhaVar;
        this.h = dvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cza)) {
            return false;
        }
        cza czaVar = (cza) obj;
        return khe.f(this.a, czaVar.a) && this.f.equals(czaVar.f) && khe.f(this.b, czaVar.b) && khe.f(this.d, czaVar.d) && khe.f(this.e, czaVar.e) && khe.f(this.h, czaVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rra rraVar = this.b;
        return (((((((hashCode + (rraVar != null ? rraVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31;
    }
}
