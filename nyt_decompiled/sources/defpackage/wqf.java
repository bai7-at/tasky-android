package defpackage;

/* loaded from: classes3.dex */
public abstract class wqf {
    private final Class a;
    private final Class b;

    /* synthetic */ wqf(Class cls, Class cls2, tqf tqfVar) {
        this.a = cls;
        this.b = cls2;
    }

    public static wqf c(mtf mtfVar, Class cls, Class cls2) {
        return new qqf(cls, cls2, mtfVar, null);
    }

    public final Class a() {
        return this.a;
    }

    public final Class b() {
        return this.b;
    }
}
