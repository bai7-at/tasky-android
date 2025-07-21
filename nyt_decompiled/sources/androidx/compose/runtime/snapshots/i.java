package androidx.compose.runtime.snapshots;

import defpackage.hv3;
import defpackage.ln0;
import java.util.Set;

/* loaded from: classes.dex */
abstract class i implements Set, hv3 {
    private final k a;

    public i(k kVar) {
        this.a = kVar;
    }

    public final k a() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ln0.b(this, objArr);
    }
}
