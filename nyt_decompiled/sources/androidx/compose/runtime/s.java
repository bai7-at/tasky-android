package androidx.compose.runtime;

import defpackage.ov7;
import defpackage.yu3;
import defpackage.zs0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class s implements zs0, Iterable, yu3 {
    private final r a;
    private final int b;
    private final int c;

    public s(r rVar, int i, int i2) {
        this.a = rVar;
        this.b = i;
        this.c = i2;
    }

    private final void a() {
        if (this.a.v() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int I;
        a();
        this.a.C(this.b);
        r rVar = this.a;
        int i = this.b;
        I = ov7.I(rVar.o(), this.b);
        return new h(rVar, i + 1, i + I);
    }
}
