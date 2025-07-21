package defpackage;

/* loaded from: classes3.dex */
public abstract class wte {
    private final tze a;
    private final Class b;

    /* synthetic */ wte(tze tzeVar, Class cls, vte vteVar) {
        this.a = tzeVar;
        this.b = cls;
    }

    public static wte b(ute uteVar, tze tzeVar, Class cls) {
        return new tte(tzeVar, cls, uteVar);
    }

    public abstract ple a(sue sueVar);

    public final tze c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
