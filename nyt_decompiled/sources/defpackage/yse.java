package defpackage;

/* loaded from: classes3.dex */
public abstract class yse {
    private final Class a;
    private final Class b;

    /* synthetic */ yse(Class cls, Class cls2, xse xseVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static yse b(wse wseVar, Class cls, Class cls2) {
        return new vse(cls, cls2, wseVar);
    }

    public abstract sue a(ble bleVar, dme dmeVar);

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
