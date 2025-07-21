package defpackage;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class jdf {
    private final ConcurrentMap a;
    private final ncf b;
    private final Class c;
    private final gvf d;

    /* synthetic */ jdf(ConcurrentMap concurrentMap, ncf ncfVar, gvf gvfVar, Class cls, idf idfVar) {
        this.a = concurrentMap;
        this.b = ncfVar;
        this.c = cls;
        this.d = gvfVar;
    }

    public final ncf a() {
        return this.b;
    }

    public final gvf b() {
        return this.d;
    }

    public final Class c() {
        return this.c;
    }

    public final Collection d() {
        return this.a.values();
    }

    public final boolean e() {
        return !this.d.a().isEmpty();
    }
}
