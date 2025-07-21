package defpackage;

/* loaded from: classes3.dex */
public abstract class nqf {
    private final n7g a;
    private final Class b;

    /* synthetic */ nqf(n7g n7gVar, Class cls, kqf kqfVar) {
        this.a = n7gVar;
        this.b = cls;
    }

    public static nqf c(otf otfVar, n7g n7gVar, Class cls) {
        return new hqf(n7gVar, cls, otfVar, null);
    }

    public final n7g a() {
        return this.a;
    }

    public final Class b() {
        return this.b;
    }
}
