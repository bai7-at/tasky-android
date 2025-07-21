package androidx.compose.runtime.snapshots;

import defpackage.ww8;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class n {
    private final k a;
    private final Iterator b;
    private int c;
    private Map.Entry d;
    private Map.Entry e;

    public n(k kVar, Iterator it2) {
        this.a = kVar;
        this.b = it2;
        this.c = kVar.d();
        f();
    }

    protected final void f() {
        this.d = this.e;
        this.e = this.b.hasNext() ? (Map.Entry) this.b.next() : null;
    }

    protected final Map.Entry g() {
        return this.d;
    }

    public final k h() {
        return this.a;
    }

    public final boolean hasNext() {
        return this.e != null;
    }

    protected final Map.Entry i() {
        return this.e;
    }

    public final void remove() {
        if (h().d() != this.c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.a.remove(entry.getKey());
        this.d = null;
        ww8 ww8Var = ww8.a;
        this.c = h().d();
    }
}
