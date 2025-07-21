package defpackage;

/* loaded from: classes2.dex */
public final class pla {
    private static final pla d = new pla();
    private final apa a;
    private final bpa b;
    private final kpa c;

    protected pla() {
        apa apaVar = new apa();
        bpa bpaVar = new bpa();
        kpa kpaVar = new kpa();
        this.a = apaVar;
        this.b = bpaVar;
        this.c = kpaVar;
    }

    public static apa a() {
        return d.a;
    }

    public static bpa b() {
        return d.b;
    }

    public static kpa c() {
        return d.c;
    }
}
