package androidx.compose.runtime;

import defpackage.q33;
import defpackage.yu3;
import defpackage.zs0;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d0 implements zs0, Iterable, yu3 {
    private final r a;
    private final q33 b;
    private final Object c;
    private final Iterable d = kotlin.collections.i.l();
    private final Iterable e = this;

    public d0(r rVar, q33 q33Var) {
        this.a = rVar;
        this.c = Integer.valueOf(q33Var.c());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c0(this.a, this.b);
    }
}
