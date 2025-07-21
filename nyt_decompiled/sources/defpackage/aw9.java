package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aw9 implements Iterator {
    private int a = 0;
    final /* synthetic */ qx9 b;

    aw9(qx9 qx9Var) {
        this.b = qx9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.e();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a < this.b.e()) {
            qx9 qx9Var = this.b;
            int i = this.a;
            this.a = i + 1;
            return qx9Var.f(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.a);
    }
}
