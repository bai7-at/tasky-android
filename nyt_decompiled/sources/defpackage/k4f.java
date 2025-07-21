package defpackage;

/* loaded from: classes3.dex */
public final class k4f implements e4f {
    private static final Object c = new Object();
    private volatile e4f a;
    private volatile Object b = c;

    private k4f(e4f e4fVar) {
        this.a = e4fVar;
    }

    public static e4f a(e4f e4fVar) {
        return ((e4fVar instanceof k4f) || (e4fVar instanceof u3f)) ? e4fVar : new k4f(e4fVar);
    }

    @Override // defpackage.l4f
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        e4f e4fVar = this.a;
        if (e4fVar == null) {
            return this.b;
        }
        Object zzb = e4fVar.zzb();
        this.b = zzb;
        this.a = null;
        return zzb;
    }
}
