package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r7g extends t7g implements Iterable {
    private final List a = new ArrayList();

    @Override // defpackage.t7g
    public final int a() {
        if (this.a.size() == 1) {
            return ((t7g) this.a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.t7g
    public final String c() {
        if (this.a.size() == 1) {
            return ((t7g) this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof r7g) && ((r7g) obj).a.equals(this.a);
        }
        return true;
    }

    public final int f() {
        return this.a.size();
    }

    public final t7g g(int i) {
        return (t7g) this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final void j(t7g t7gVar) {
        this.a.add(t7gVar);
    }
}
