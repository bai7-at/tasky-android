package defpackage;

/* loaded from: classes3.dex */
final class qzf extends jzf {
    public static final Object i = new Object();
    private final Object g;
    private final Object h;

    private qzf(n1c n1cVar, Object obj, Object obj2) {
        super(n1cVar);
        this.g = obj;
        this.h = obj2;
    }

    public static qzf q(cza czaVar) {
        return new qzf(new szf(czaVar), l0c.p, i);
    }

    public static qzf r(n1c n1cVar, Object obj, Object obj2) {
        return new qzf(n1cVar, obj, obj2);
    }

    @Override // defpackage.jzf, defpackage.n1c
    public final int a(Object obj) {
        Object obj2;
        if (i.equals(obj) && (obj2 = this.h) != null) {
            obj = obj2;
        }
        return this.f.a(obj);
    }

    @Override // defpackage.jzf, defpackage.n1c
    public final fyb d(int i2, fyb fybVar, boolean z) {
        this.f.d(i2, fybVar, z);
        if (khe.f(fybVar.b, this.h) && z) {
            fybVar.b = i;
        }
        return fybVar;
    }

    @Override // defpackage.jzf, defpackage.n1c
    public final l0c e(int i2, l0c l0cVar, long j) {
        this.f.e(i2, l0cVar, j);
        if (khe.f(l0cVar.a, this.g)) {
            l0cVar.a = l0c.p;
        }
        return l0cVar;
    }

    @Override // defpackage.jzf, defpackage.n1c
    public final Object f(int i2) {
        Object f = this.f.f(i2);
        return khe.f(f, this.h) ? i : f;
    }

    public final qzf p(n1c n1cVar) {
        return new qzf(n1cVar, this.g, this.h);
    }
}
