package defpackage;

/* loaded from: classes3.dex */
public final class u3f implements e4f, l3f {
    private static final Object c = new Object();
    private volatile e4f a;
    private volatile Object b = c;

    private u3f(e4f e4fVar) {
        this.a = e4fVar;
    }

    public static l3f a(e4f e4fVar) {
        return e4fVar instanceof l3f ? (l3f) e4fVar : new u3f(e4fVar);
    }

    public static e4f b(e4f e4fVar) {
        return e4fVar instanceof u3f ? e4fVar : new u3f(e4fVar);
    }

    @Override // defpackage.l4f
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.zzb();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
