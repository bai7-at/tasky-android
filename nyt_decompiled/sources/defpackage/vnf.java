package defpackage;

/* loaded from: classes3.dex */
public abstract class vnf {
    private final n7g a;
    private final Class b;

    /* synthetic */ vnf(n7g n7gVar, Class cls, snf snfVar) {
        this.a = n7gVar;
        this.b = cls;
    }

    public static vnf b(pnf pnfVar, n7g n7gVar, Class cls) {
        return new mnf(n7gVar, cls, pnfVar);
    }

    public abstract cbf a(lrf lrfVar, tdf tdfVar);

    public final n7g c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
