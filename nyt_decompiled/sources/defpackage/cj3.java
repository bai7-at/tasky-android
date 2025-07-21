package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class cj3 implements Iterable, yu3 {
    private final qs2 a;

    public cj3(qs2 qs2Var) {
        zq3.h(qs2Var, "iteratorFactory");
        this.a = qs2Var;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new dj3((Iterator) this.a.mo865invoke());
    }
}
