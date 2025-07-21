package defpackage;

/* loaded from: classes3.dex */
public abstract class use {
    private final tze a;
    private final Class b;

    /* synthetic */ use(tze tzeVar, Class cls, tse tseVar) {
        this.a = tzeVar;
        this.b = cls;
    }

    public static use b(sse sseVar, tze tzeVar, Class cls) {
        return new rse(tzeVar, cls, sseVar);
    }

    public abstract ble a(sue sueVar, dme dmeVar);

    public final tze c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
