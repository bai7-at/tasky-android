package defpackage;

import coil.memory.MemoryCache;

/* loaded from: classes.dex */
public final class cr6 implements MemoryCache {
    private final y48 a;
    private final dd9 b;

    public cr6(y48 y48Var, dd9 dd9Var) {
        this.a = y48Var;
        this.b = dd9Var;
    }

    @Override // coil.memory.MemoryCache
    public void a(int i) {
        this.a.a(i);
        this.b.a(i);
    }

    @Override // coil.memory.MemoryCache
    public MemoryCache.b b(MemoryCache.Key key) {
        MemoryCache.b b = this.a.b(key);
        return b == null ? this.b.b(key) : b;
    }

    @Override // coil.memory.MemoryCache
    public void c(MemoryCache.Key key, MemoryCache.b bVar) {
        this.a.c(MemoryCache.Key.b(key, null, e.b(key.c()), 1, null), bVar.a(), e.b(bVar.b()));
    }
}
