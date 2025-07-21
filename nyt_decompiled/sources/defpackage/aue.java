package defpackage;

/* loaded from: classes3.dex */
public abstract class aue {
    private final Class a;
    private final Class b;

    /* synthetic */ aue(Class cls, Class cls2, zte zteVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static aue b(yte yteVar, Class cls, Class cls2) {
        return new xte(cls, cls2, yteVar);
    }

    public abstract sue a(ple pleVar);

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
